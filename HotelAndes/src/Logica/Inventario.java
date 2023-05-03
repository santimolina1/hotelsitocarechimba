package Logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Inventario {

	private HashMap<String, Habitacion> cuartos;
	private HashMap<String, ArrayList<Date>> inventario;

	public Inventario() {
		inventario = new HashMap<String, ArrayList<Date>>();
		CargadorArchivo cargador = CargadorArchivo.getInstance();
		cuartos = cargador.getHabitacionies();
	}

	public ArrayList<Date> fechasOcupado(String id) {

		return inventario.get(id);
	}

	public HashMap<String, ArrayList<Date>> getInventario() {
		for (String i : cuartos.keySet()) {
			Habitacion hab = cuartos.get(i);
			ArrayList<Date> diasOcupados = new ArrayList<Date>();
			inventario.put(hab.getId(), diasOcupados);
		}
		return inventario;
	}

	public void setDisponibilidad(String IDcuarto, Date ocupada) {
		ArrayList<Date> diasOcupados = inventario.get(IDcuarto);
		diasOcupados.add(ocupada);

	}

}