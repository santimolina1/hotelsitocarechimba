package logica_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import modelo.CargadorArchivo;

public class Habitacion {
	CargadorArchivo cargador = CargadorArchivo.getInstance();
	// id;ubicacion;capacidad;camas;precioFijo;vista;balcon;cocina;tipo
	private String id;
	private int capacidad;
	private ArrayList<Cama> cama;
	private String ubicacion;
	private String tipo;
	private float precioFijo;
	private boolean vista;
	private boolean balcon;
	private boolean cocina;
	private HashMap<String, ArrayList<Habitacion>> habitacionesPorTipo = cargador.getHabitacionesPorTipo();

	public Habitacion(String id, int capacidad, ArrayList<Cama> cama, String ubicacion, String tipo, float precioFijo,
			boolean vista, boolean balcon, boolean cocina) {

		this.id = id;
		this.capacidad = capacidad;
		this.cama = cama;
		this.ubicacion = ubicacion;
		this.tipo = tipo;
		this.precioFijo = precioFijo;
		this.vista = vista;
		this.balcon = balcon;
		this.cocina = cocina;
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

	public float getPrecioFijo() {
		return precioFijo;
	}

	public boolean isVista() {
		return vista;
	}

	public boolean isBalcon() {
		return balcon;
	}

	public boolean isCocina() {
		return cocina;
	}

}
