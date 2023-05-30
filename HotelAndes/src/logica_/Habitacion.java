package logica_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import modelo.CargadorArchivo;

public class Habitacion implements Servicio {
	CargadorArchivo cargador = CargadorArchivo.getInstance();
	// id;ubicacion;capacidad;camas;precioFijo;vista;balcon;cocina;tipo
	private String id;
	private int capacidad;
	private ArrayList<Cama> cama;
	private String ubicacion;
	private String tipo;
	private float precioFijo;
	private ArrayList<String> atributosAdicionales;
	
	//private HashMap<String, ArrayList<Habitacion>> habitacionesPorTipo = cargador.getHabitacionesPorTipo();

	public Habitacion(String id, int capacidad, ArrayList<Cama> cama, String ubicacion, String tipo, float precioFijo, ArrayList<String> atributosAdicionales)
	{		

		this.id = id;
		this.capacidad = capacidad;
		this.cama = cama;
		this.ubicacion = ubicacion;
		this.tipo = tipo;
		this.precioFijo = precioFijo;
		this.atributosAdicionales = atributosAdicionales;
	
	}

	public String getId() {
		return id;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public ArrayList<Cama> getCama() {
		return cama;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public String getTipo() {
		return tipo;
	}

	public float getPrecioTotal() {
		return precioFijo;
	}

	public ArrayList<String> isVista() {
		return atributosAdicionales;
	}


	@Override
	public String getNombre() {
		return id;
	}

	

	@Override
	public String[] getDias() {
		String[] a=new String[1];
		a[0]="N.A";
		return a;
	}

	@Override
	public String getHorariosDeDisponibilidad() {
		
		return "N.A";
	}

}
