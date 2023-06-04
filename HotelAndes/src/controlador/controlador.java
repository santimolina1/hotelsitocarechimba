package controlador;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import consola.Hotel;
import logica_.Consumo;
import logica_.Factura;
import logica_.GenerarConsumos;
import logica_.Habitacion;
import logica_.HuespedReserva;
import logica_.Reserva;
import logica_.Servicio;
import modelo.CargadorArchivo;
import modelo.FuncionesEmpleado;
import modelo.Inventario;

public class controlador {
	public HashMap<String, HuespedReserva> huespedes = new HashMap<String, HuespedReserva>();
	public GenerarConsumos consumos =GenerarConsumos.getInstance();
	public HashMap<String, Reserva> reservas = new HashMap<String, Reserva>();
	public CargadorArchivo cargador =CargadorArchivo.getInstance();
	
	
	public ArrayList<String> usuariosCheckIn = new ArrayList<String>();
	FuncionesEmpleado empleado = new FuncionesEmpleado();
	Inventario inventarioInstancia = new Inventario();
	HashMap<String, ArrayList<Date>> inventario = inventarioInstancia.getInventario();
	private static controlador instancia;
	
	
	public void cargarConsumo (Servicio consumo) {
		
		
		Consumo objconsumo = new Consumo(LocalDate.now(), (String) consumo.getNombre(), consumo.getPrecioTotal(),
				(float) (consumo.getPrecioTotal() * 0.19), false);
		
		ArrayList<HuespedReserva> huespedesList= huespedes.values().stream().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(huespedes);
		System.out.println(huespedesList);
		HuespedReserva a = huespedesList.get(0);
		HashMap<String, Consumo> losconsumos = a.getConsumos();
		losconsumos.put(objconsumo.getNombre(), objconsumo);
		System.out.println(a.getNombre());
		System.out.println(a.getConsumos());
		consumos.generarConsumo(objconsumo);
		
	}
	public static controlador getInstance()
	{
		if (instancia == null)
			instancia = new controlador();
		
		return instancia;
	}
	
	public HashMap<String, HuespedReserva> getHuespedes() {
		return huespedes;
	}

	public static controlador getInstancia() {
		return instancia;
	}

	public boolean ingresarDatos(String nombre, String documento, String correo, String celular) {
		

			
			int documento1 = Integer
					.parseInt(documento);
			
			HuespedReserva huesped1 = huespedes.get(nombre);
			if (huesped1 == null) {
				HashMap<String, Consumo> consumoss = new HashMap<String, Consumo>();
				huesped1 = new HuespedReserva(nombre, documento1, correo, celular, consumoss);
				huespedes.put(nombre, huesped1);
				
				
				return true;
			} else {
				return false;
			}
			
			

		
	}
	
	public Date formatearHora(String date_time, String formato) {

		SimpleDateFormat dateParser = new SimpleDateFormat(formato);
		Date date = null;

		{
			try {
				date = dateParser.parse(date_time);

			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return date;
	}
	
	
	public HashMap<String, Float> reservar(String nombre,int cantidadDeAcompañantes, String fecha_llegada, String fecha_salida) throws IOException {

		
		
		HashMap<String, Habitacion> habitaciones = cargador.getHabitacionies();
		HashMap<String, ArrayList<Habitacion>> habitacionies = cargador.getHabitacionesID();
		HashMap<Date, Float> tarifaEstandar = cargador.getTarifaEstandar();
		HashMap<Date, Float> tarifaSuite = cargador.getTarifaSuite();
		HashMap<Date, Float> tarifaSuiteDoble = cargador.getTarifaSuiteDoble();

		

		Date Fecha_llegada = formatearHora(fecha_llegada,"dd/MM/yy");
		Date Fecha_salida = formatearHora(fecha_salida,"dd/MM/yy");
		HuespedReserva huesped1 = huespedes.get(nombre);
		
			FuncionesEmpleado empleado = new FuncionesEmpleado();
			File archivoHabitaciones = new File("./data/habitacion.txt");
			cargador.cargarHabitacion(archivoHabitaciones);
			ArrayList<Date> fechas = empleado.fechas(Fecha_llegada, Fecha_salida);
			ArrayList<String> xd = empleado.reserva(huesped1, Fecha_llegada, Fecha_salida, cantidadDeAcompañantes,
					habitacionies);
			HashMap<String, Float> valores = empleado.calcularValoresTotales(xd, habitaciones, tarifaEstandar,
					tarifaSuite, tarifaSuiteDoble, fechas);
			System.out.println(xd);
			System.out.println(valores);
			System.out.println(huespedes);
			HuespedReserva huesped = huespedes.get(nombre);
			int numHabitaciones = xd.size();
			float precio_habitaciones = 0;
			for (float precio : valores.values()) {
				precio_habitaciones += precio;
			}
			System.out.println(huesped.getNombre());
			Reserva reserva = new Reserva(huesped, Fecha_llegada, Fecha_salida, precio_habitaciones,
					cantidadDeAcompañantes, numHabitaciones, 0, false, xd);
			reservas.put(nombre, reserva);
			
			System.out.println(reserva.getHuespedReserva());
			Hotel hotel= Hotel.getInstance();
			System.out.println(reserva.getHuespedReserva());
			hotel.crearReserva(reserva);
			
		
		return valores;

	}

	public controlador() {
	
	}


	public void cancelarReserva(String nombre) throws IOException {
		
		FuncionesEmpleado empleado = new FuncionesEmpleado();
		Reserva reserva = reservas.get(nombre);
		String habitacion = reserva.getHabitacion();
		Date Fecha_llegada = reserva.getFecha_llegada();
		Date Fecha_salida = reserva.getFecha_salida();
		empleado.cancelarReserva(habitacion, Fecha_llegada, Fecha_salida, inventario);
		Hotel hotel= Hotel.getInstance();
		hotel.eliminarReserva(nombre, Fecha_llegada, Fecha_salida);
	}
	
	public void checkIn(String nombre) throws IOException{
		Reserva reserva = reservas.get(nombre);
		int z=usuariosCheckIn.indexOf(nombre);
		if (z==-1) {
		reserva.setEstado(true);
		usuariosCheckIn.add(nombre);
		}
	
		
	}
	public Factura generarFactura() {
		ArrayList<HuespedReserva> huespedesList= huespedes.values().stream().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(huespedes);
		System.out.println(huespedesList);
		HuespedReserva persona = huespedesList.get(0);
		ArrayList<Consumo> consumosLiii = new ArrayList<Consumo>(((persona).getConsumos()).values());
		Factura f = new Factura(LocalDate.now(), persona.getNombre(), persona, consumosLiii);
		f.generarTextoFactura();
		return f;
		
	}
	public ArrayList<Consumo> getConsumos(){
		ArrayList<HuespedReserva> huespedesList= huespedes.values().stream().collect(Collectors.toCollection(ArrayList::new));
		
		HuespedReserva persona = huespedesList.get(0);
		ArrayList<Consumo> consumosLiii = new ArrayList<Consumo>(((persona).getConsumos()).values());
		return consumosLiii;
		
	}
	
	
	
	public void reservar1(String nombre,String id, String fecha_llegada, String fecha_salida) throws IOException
	{
		Date Fecha_llegada = formatearHora(fecha_llegada,"dd/MM/yy");
		Date Fecha_salida = formatearHora(fecha_salida,"dd/MM/yy");
		empleado.reservar(Fecha_llegada, Fecha_salida, id, 2, nombre, huespedes, reservas);
	}
	
	public ArrayList<String> mostrarDisponiblesFechas(String fecha_llegada, String fecha_salida) {
		
		Date Fecha_llegada = formatearHora(fecha_llegada,"dd/MM/yy");
		Date Fecha_salida = formatearHora(fecha_salida,"dd/MM/yy");
		HashMap<String, ArrayList<String>> fechas= cargador.getFechas();
		ArrayList<String> disponibles=empleado.mostrarDisponiblesFechas(Fecha_llegada, Fecha_salida, fechas);
		return disponibles;
		
	}
	
	public String mostrarCaracteristicasHotel() {
		Hotel hotel= Hotel.getInstance();
		String caracteristicas=hotel.getCaracteristicas();
		return caracteristicas;
	}
	
	public String mostrarCaracteristicasHbatiacion(String id) {
		String todo ="ajd";
		return todo;
	}
}
