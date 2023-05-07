package controlador;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import consola.Hotel;
import logica_.Consumo;
import logica_.Habitacion;
import logica_.HuespedReserva;
import logica_.Reserva;
import modelo.CargadorArchivo;
import modelo.FuncionesEmpleado;
import modelo.Inventario;

public class controlador {
	public HashMap<String, HuespedReserva> huespedes = new HashMap<String, HuespedReserva>();
	public HashMap<String, Reserva> reservas = new HashMap<String, Reserva>();
	public CargadorArchivo cargador =CargadorArchivo.getInstance();
	
	
	public ArrayList<String> usuariosCheckIn = new ArrayList<String>();
	FuncionesEmpleado empleado = new FuncionesEmpleado();
	Inventario inventarioInstancia = new Inventario();
	HashMap<String, ArrayList<Date>> inventario = inventarioInstancia.getInventario();
	private static controlador instancia;
	
	
	
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
		{

			
			int documento1 = Integer
					.parseInt(documento);
			
			HuespedReserva huesped1 = huespedes.get(nombre);
			if (huesped1 == null) {
				HashMap<String, Consumo> consumoss = new HashMap<String, Consumo>();
				huesped1 = new HuespedReserva(nombre, documento1, correo, celular, consumoss);
				huespedes.put(nombre, huesped1);
				
				System.out.println(huespedes);
				return true;
			} else {
				return false;
			}

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
		ArrayList<String> habitacionesReserva = reserva.getHabitaciones();
		Date Fecha_llegada = reserva.getFecha_llegada();
		Date Fecha_salida = reserva.getFecha_salida();
		empleado.cancelarReserva(habitacionesReserva, Fecha_llegada, Fecha_salida, inventario);
		Hotel hotel= Hotel.getInstance();
		hotel.eliminarReserva(nombre, Fecha_llegada, Fecha_salida);
	}
}
