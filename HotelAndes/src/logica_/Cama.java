package logica_;

import java.util.HashMap;

import modelo.CargadorArchivo;

public class Cama {
	CargadorArchivo cargador = CargadorArchivo.getInstance();
	// Atributos
	public String tamaño;
	private String uso;
	private int numeroNiños;
	private int numeroAdultos;
	private HashMap<String, Cama> camas = cargador.getCamas();

	// Constructor
	public Cama(String tamaño, String uso, int numeroNiños, int numeroAdultos) {
		this.tamaño = tamaño;
		this.uso = uso;
		this.numeroNiños = numeroNiños;
		this.numeroAdultos = numeroAdultos;
	}

	public String getTamaño() {
		return tamaño;
	}

	public String getUso() {
		return uso;
	}

	public int getNumeroNiños() {
		return numeroNiños;
	}

	public int getNumeroAdultos() {
		return numeroAdultos;
	}

}
