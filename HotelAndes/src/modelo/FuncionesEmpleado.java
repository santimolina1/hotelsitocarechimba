package modelo;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

import java.util.List;

import java.util.Set;
import java.util.stream.Collectors;

import modelo.CargadorArchivo;
import consola.Hotel;
import controlador.controlador;
import logica_.Bebida;
import logica_.Consumo;
import logica_.Habitacion;
import logica_.HuespedReserva;
import logica_.Plato;
import logica_.Reserva;
import logica_.Servicio;
import logica_.Tarifa;


public class FuncionesEmpleado {
	Inventario inventarioInstancia = new Inventario();
	HashMap<String, ArrayList<Date>> inventario = inventarioInstancia.getInventario();
	private CargadorArchivo cargador = CargadorArchivo.getInstance();
	private HashMap<String, Bebida> bebidas = cargador.getBebidas();
	private HashMap<String, Plato> platos = cargador.getPlatos();
	private HashMap<String, Habitacion> habitaciones = cargador.getHabitacionies();
	private HashMap<Date, Float> tarifaEstandar = cargador.getTarifaEstandar();
	private HashMap<Date, Float> tarifaSuite = cargador.getTarifaSuite();
	private HashMap<Date, Float> tarifaSuiteDoble = cargador.getTarifaSuiteDoble();
	
	private HashMap<String, Servicio> servicios = cargador.getServicios();
	controlador co= controlador.getInstance();
	

	public ArrayList<String> reserva(HuespedReserva huesped1, Date Fecha_llegada, Date Fecha_salida,
			int cantidadDeAcompañantes, HashMap<String, ArrayList<Habitacion>> catalogo) {

		HashMap<String, Integer> habitacionestipo = new HashMap<>();
		habitacionestipo.put("estandar", 0);
		habitacionestipo.put("suite", 0);
		habitacionestipo.put("suiteDoble", 0);
		while (cantidadDeAcompañantes > 0) {
			if (cantidadDeAcompañantes >= 4) { // suiteDoble
				habitacionestipo.put("suiteDoble", habitacionestipo.get("suiteDoble").intValue() + 1);
				cantidadDeAcompañantes -= 4;
			} else if (cantidadDeAcompañantes >= 3) { // suite
				habitacionestipo.put("suite", habitacionestipo.get("suite").intValue() + 1);
				cantidadDeAcompañantes -= 3;
			} else {// estandar
				habitacionestipo.put("estandar", habitacionestipo.get("estandar").intValue() + 1);
				cantidadDeAcompañantes -= 2;
			}
		}

		ArrayList<Date> fechasEntreEntradaYSalida = fechas(Fecha_llegada, Fecha_salida);

		// ArrayList<Date> diasOcupados= inventario.get(IDcuarto); hola mundo

		ArrayList<String> idsReservados = new ArrayList<String>();

		for (int i = 0; i < fechasEntreEntradaYSalida.size(); i++) {
			Date fecha = fechasEntreEntradaYSalida.get(i);

			if (habitacionestipo.get("estandar") != 0) {
				int cantidad = habitacionestipo.get("estandar");

				ArrayList<Habitacion> habitaciones = catalogo.get("estandar");
				ArrayList<String> idsDisponibles = new ArrayList<String>();

				for (Habitacion habitacion : habitaciones) {
					if (!inventario.containsKey(habitacion.getId())) {
						inventario.put(habitacion.getId(), new ArrayList<Date>());
					}
					ArrayList<Date> fechasOcupadas = inventario.get(habitacion.getId());
					if (!fechasOcupadas.contains(fecha)) {
						idsDisponibles.add(habitacion.getId());
					}
				}

				if (idsDisponibles.size() < cantidad) {
					// No hay suficientes habitaciones disponibles para esta fecha y tipo
					return new ArrayList<String>();
				}

				// Reservar habitaciones disponibles
				for (int k = 0; k < cantidad; k++) {

					String id = idsDisponibles.get(k);
					idsReservados.add(id);
					inventario.get(id).add(fecha);
				}
			}

			if (habitacionestipo.get("suite") != 0) {
				int cantidad = habitacionestipo.get("suite");

				ArrayList<Habitacion> habitaciones = catalogo.get("suite");
				ArrayList<String> idsDisponibles = new ArrayList<String>();

				for (Habitacion habitacion : habitaciones) {
					if (!inventario.containsKey(habitacion.getId())) {
						inventario.put(habitacion.getId(), new ArrayList<Date>());
					}
					ArrayList<Date> fechasOcupadas = inventario.get(habitacion.getId());
					if (!fechasOcupadas.contains(fecha)) {
						idsDisponibles.add(habitacion.getId());
					}
				}

				if (idsDisponibles.size() < cantidad) {
					// No hay suficientes habitaciones disponibles para esta fecha y tipo
					return new ArrayList<String>();
				}

				// Reservar habitaciones disponibles
				for (int k = 0; k < cantidad; k++) {

					String id = idsDisponibles.get(k);
					idsReservados.add(id);
					inventario.get(id).add(fecha);
				}
			}

			if (habitacionestipo.get("suiteDoble") != 0) {
				int cantidad = habitacionestipo.get("suiteDoble");

				ArrayList<Habitacion> habitaciones = catalogo.get("suiteDoble");
				ArrayList<String> idsDisponibles = new ArrayList<String>();

				for (Habitacion habitacion : habitaciones) {
					if (!inventario.containsKey(habitacion.getId())) {
						inventario.put(habitacion.getId(), new ArrayList<Date>());
					}
					ArrayList<Date> fechasOcupadas = inventario.get(habitacion.getId());
					if (!fechasOcupadas.contains(fecha)) {
						idsDisponibles.add(habitacion.getId());
					}
				}

				if (idsDisponibles.size() < cantidad) {
					// No hay suficientes habitaciones disponibles para esta fecha y tipo
					return new ArrayList<String>();
				}

				// Reservar habitaciones disponibles
				for (int k = 0; k < cantidad; k++) {

					String id = idsDisponibles.get(k);
					idsReservados.add(id);
					inventario.get(id).add(fecha);
				}
			}
		}

		Set<String> set = new HashSet<>();
		ArrayList<String> listaSinRepetidos = new ArrayList<>();

		for (String elemento : idsReservados) {
			if (!set.contains(elemento)) {
				listaSinRepetidos.add(elemento);
				set.add(elemento);
			}
		}

		return listaSinRepetidos;

	}

	public ArrayList<Date> fechas(Date Fecha_llegada, Date Fecha_salida) {
		ArrayList<Date> fechasEntreEntradaYSalida = new ArrayList<Date>();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(Fecha_llegada);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		while (calendar.getTime().before(Fecha_salida) || calendar.getTime().equals(Fecha_salida)) {
			Date fechaActual = calendar.getTime();
			String x = sdf.format(fechaActual);
			fechasEntreEntradaYSalida.add(formatearHora(x, "dd/MM/yy"));
			calendar.add(Calendar.DATE, 1);
		}

		return fechasEntreEntradaYSalida;
	}

	public void cancelarReservaFecha(String habitacion, Date Fecha,
			HashMap<String, ArrayList<Date>> inventario) {

		
			ArrayList<Date> listaFechas = inventario.get(habitacion);
			listaFechas.remove(Fecha);
		

	}
	
	/*

	public String cancelarReserva(ArrayList<String> habitacionesReserva, Date FechaLlegada,

			Date FechaSalida, HashMap<String, ArrayList<Date>> inventario) {

		Date fechaActual = new Date();

		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(FechaLlegada);
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(fechaActual);

		long tiempo1 = cal1.getTimeInMillis();
		long tiempo2 = cal2.getTimeInMillis();

		long diferencia = tiempo2 - tiempo1;
		int dias = (int) (diferencia / (1000 * 60 * 60 * 24));

		ArrayList<Date> FechasEntreEntradaYSalida = fechas(FechaLlegada, FechaSalida);

		if (dias <= 2) {
			for (Date Fecha : FechasEntreEntradaYSalida) {
				cancelarReservaFecha(habitacionesReserva, Fecha, inventario);
			}

			System.out.println(inventario);

			return ("Se ha cancelado su reserva");
		} else {
			return ("No es posible cancelar la reserva debido a que debe ser 2 días antes de la fecha de inicio de la reserva");
		}

	}
*/
	public HashMap<String, Float> calcularValoresTotales(ArrayList<String> habitacionesReservadas,
			HashMap<String, Habitacion> habitaciones, HashMap<Date, Float> tarifaEstandar,
			HashMap<Date, Float> tarifaSuite, HashMap<Date, Float> tarifaSuiteDoble,
			ArrayList<Date> fechasEntreEntradaYSalida) {
		HashMap<String, Float> valoresTotales = new HashMap<String, Float>();
		Tarifa tarifa=null;
		for (String idHabitacion : habitacionesReservadas) {
			Habitacion habitacion = habitaciones.get(idHabitacion);
			float valorTotal = 0;

			for (Date fecha : fechasEntreEntradaYSalida) {
				float valorBase = habitacion.getPrecioTotal();
				String tipo = habitacion.getTipo();
				Float valorAdicional = null;
				if (tipo == "estandar") {
					valorAdicional = tarifaEstandar.get(fecha);
					tarifa= new Tarifa("estandar", valorAdicional, fecha);
					
				} else if (tipo == "suite") {
					valorAdicional = tarifaSuite.get(fecha);
					tarifa= new Tarifa("suite", valorAdicional, fecha);
				} else if (tipo == "suite Doble") {
					valorAdicional = tarifaSuiteDoble.get(fecha);
					tarifa= new Tarifa("suite Doble", valorAdicional, fecha);
				}

				if (valorAdicional != null) {
					valorBase += valorAdicional;
				}

				valorTotal += valorBase;
			}

			valoresTotales.put(idHabitacion, valorTotal);
		}

		return (valoresTotales);
	}

	public void cargarConsumo(HashMap<String, Object> opcion) {
		Servicio elServicio = null;
		System.out.println(opcion);
		
		if (opcion.get("bebida") != null) {
			Object op = opcion.get("bebida");
			ArrayList<Servicio> listaBebidas=  cargador.getListaBebidas();
			System.out.println(op);
			System.out.println(bebidas);
			System.out.println(listaBebidas);
			elServicio = listaBebidas.get((int)op - 1);

		}
		if (opcion.get("plato") != null) {
			Object op = opcion.get("plato");
			ArrayList<Servicio> listaPlatos=  cargador.getListaPlatos();
			System.out.println(op);
			System.out.println(platos);
			System.out.println(listaPlatos);
			elServicio = listaPlatos.get((int)op - 1);

		}
		if (opcion.get("servicio") != null) {
			Object op = opcion.get("servicio");
			ArrayList<Servicio> listaServicio=  cargador.getListaServicios();
			System.out.println(op);
			System.out.println(servicios);
			System.out.println(listaServicio);
			elServicio = listaServicio.get((int) op - 1);

		}
		if (elServicio == null) {
			System.out.println("Algo Salio Mal");
		}

		Consumo objconsumo = new Consumo(LocalDate.now(), (String) elServicio.getNombre(), elServicio.getPrecioTotal(),
				(float) (elServicio.getPrecioTotal() * 0.19), false);
		Reserva res= (Reserva) opcion.get("reserva");
		HuespedReserva a = res.getHuespedReserva();
		HashMap<String, Consumo> losconsumos = a.getConsumos();
		losconsumos.put(objconsumo.getNombre(), objconsumo);

	}
	

	public static String fechaString(Date date) {

		SimpleDateFormat dateFormatter = null;

		dateFormatter = new SimpleDateFormat("dd/MM");

		return dateFormatter.format(date);

	}
/*
	public void generarFactura(String nombre) {
		Factura factura= new Factura(LocalDate.now(), )
		return

		// public Factura(Date fecha, String nombre, HuespedReserva huésped, float
		// valotTotal, float impuestos, int numeroFactura, ArrayList<Consumo> consumos)
		// {
	}
*/
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

	public ArrayList<String> mostrarDisponiblesFechas(Date Fecha_llegada, Date Fecha_salida,
			HashMap<String, ArrayList<String>> dataMap) {
		ArrayList<String> disponibles = new ArrayList<String>();
		for (int i = 1; i <= 50; i++) {
			disponibles.add(Integer.toString(i));
		}

		ArrayList<Date> fechasEntreEntradaYSalida = fechas(Fecha_llegada, Fecha_salida);
		for (Date fecha : fechasEntreEntradaYSalida) {
			String fecha1 = fechaString(fecha);
			ArrayList<String> ocupados = dataMap.get(fecha1);
			disponibles.removeAll(ocupados);

		}

		return disponibles;
	}

	public float reservar(Date Fecha_llegada, Date Fecha_salida, String id, int cantidadAcompañantes, String nombre,
			HashMap<String, HuespedReserva> huespedes, HashMap<String, Reserva> reservas) throws IOException {

		CargadorArchivo c = CargadorArchivo.getInstance();
		//controlador.class cotrolador=controlador.getInstance();

		HuespedReserva huesped = huespedes.get(nombre);
		HashMap<Date, Float> tarifaEstandar = c.getTarifaEstandar();
		HashMap<Date, Float> tarifaSuite = c.getTarifaSuite();
		HashMap<Date, Float> tarifaSuiteDoble = c.getTarifaSuiteDoble();
		HashMap<String, Habitacion> habitaciones = c.getHabitacionies();
		ArrayList<Date> fechasEntreEntradaYSalida = fechas(Fecha_llegada, Fecha_salida);

		Object valorTotal = (calcularValorTotal(id, habitaciones, tarifaEstandar, tarifaSuite, tarifaSuiteDoble,
				fechasEntreEntradaYSalida)).get(0);
		Tarifa tarifa=(Tarifa)(calcularValorTotal(id, habitaciones, tarifaEstandar, tarifaSuite, tarifaSuiteDoble,
				fechasEntreEntradaYSalida)).get(1);
		for (Date fecha : fechasEntreEntradaYSalida) {
			String fecha1 = fechaString(fecha);
			c.addStringToDate(fecha1, id);
		}

		Reserva reserva = new Reserva(huesped, Fecha_llegada, Fecha_salida, (Float)valorTotal, cantidadAcompañantes, 0, false,
				id);
		reservas.put(nombre, reserva);
		Hotel hotel= Hotel.getInstance();
		hotel.crearReserva(reserva);
		Habitacion hab= habitaciones.get(id);
		co.cargarConsumo(hab);
		co.cargarConsumo(tarifa);
		
		return (Float)valorTotal;
	}

	public ArrayList<Object> calcularValorTotal(String idHabitacion, HashMap<String, Habitacion> habitaciones,
			HashMap<Date, Float> tarifaEstandar, HashMap<Date, Float> tarifaSuite,
			HashMap<Date, Float> tarifaSuiteDoble, ArrayList<Date> fechasEntreEntradaYSalida) {

		Habitacion habitacion = habitaciones.get(idHabitacion);
		float valorTotal = 0;
		Tarifa tarifa=null;
		for (Date fecha : fechasEntreEntradaYSalida) {
			float valorBase = habitacion.getPrecioTotal();
			String tipo = habitacion.getTipo();
			
			Float valorAdicional = null;
			if (tipo == "estandar") {
				
				valorAdicional = tarifaEstandar.get(fecha);
				tarifa= new Tarifa("estandar", valorAdicional, fecha);
			} else if (tipo == "suite") {
				valorAdicional = tarifaSuite.get(fecha);
				tarifa= new Tarifa("suite", valorAdicional, fecha);
			} else if(tipo=="suiteDoble"){
				valorAdicional = tarifaSuiteDoble.get(fecha);
				tarifa= new Tarifa("suiteDoble", valorAdicional, fecha);
			}

			if (valorAdicional != null) {
				valorBase += valorAdicional;
			}

			valorTotal += valorBase;
		}
		ArrayList<Object> retorno= new ArrayList<Object>();
		retorno.add(valorTotal);
		retorno.add(tarifa);
		return retorno;
	}
	
	public ArrayList<String>mostrarInfoHabitacion(String id){
		CargadorArchivo c = CargadorArchivo.getInstance();
		HashMap<String, Habitacion> habitaciones = c.getHabitacionies();
		Habitacion habitacion = habitaciones.get(id);
		ArrayList<String> informacion= new ArrayList<String>();
		informacion.add(id);
		String tipo= habitacion.getTipo();
		informacion.add(tipo);
		String capacidad= String.valueOf(habitacion.getCapacidad());
		informacion.add(capacidad);
		ArrayList<String> atributos= habitacion.getAtributosAdicionales();
		String tamCuarto=atributos.get(2);
		informacion.add(tamCuarto);
		String ubicacion= habitacion.getUbicacion();
		informacion.add(ubicacion);
		String vista= atributos.get(0);
		informacion.add(vista);
		String balcon = atributos.get(1);
		informacion.add(balcon);
		String cocina=atributos.get(2);
		informacion.add(cocina);
		String elemento4 = atributos.get(3);
		informacion.add(elemento4);
		String elemento5 = atributos.get(4);
		informacion.add(elemento5);
		String elemento6 = atributos.get(5);
		informacion.add(elemento6);
		String elemento7 = atributos.get(6);
		informacion.add(elemento7);
		String elemento8 = atributos.get(7);
		informacion.add(elemento8);
		String elemento9 = atributos.get(8);
		informacion.add(elemento9);
		String elemento10 = atributos.get(9);
		informacion.add(elemento10);
		String elemento11 = atributos.get(10);
		informacion.add(elemento11);
		String elemento12 = atributos.get(11);
		informacion.add(elemento12);
		String elemento13 = atributos.get(12);
		informacion.add(elemento13);
		String elemento14 = atributos.get(13);
		informacion.add(elemento14);
		String elemento15 = atributos.get(14);
		informacion.add(elemento15);
		String elemento16 = atributos.get(15);
		informacion.add(elemento16);
		
		
		
		
		return informacion;
	}
}
