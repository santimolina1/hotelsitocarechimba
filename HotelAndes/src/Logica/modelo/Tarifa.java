package Logica.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import Logica.CargadorArchivo;

public class Tarifa {
	CargadorArchivo cargador = CargadorArchivo.getInstance();
	private String tipoHabitacion;
	private float precio;
	private Date fecha;
	public HashMap<Date, Float> tarifaEstandar = cargador.getTarifaEstandar();
	public HashMap<Date, Float> tarifaSuite = cargador.getTarifaSuite();
	public HashMap<Date, Float> tarifaSuiteDoble = cargador.getTarifaSuiteDoble();

	private String[] diaSemana;

	public Tarifa(String tipoHabitacion, float precio, Date fecha, String[] diaSemana) {
		this.tipoHabitacion = tipoHabitacion;
		this.precio = precio;
		this.fecha = fecha;

	}

	public String getTipoHabitacion() {
		return tipoHabitacion;
	}

	public String[] getDiaSemana() {
		return diaSemana;
	}

	public float getPrecio() {
		return precio;
	}

	public Date getFecha() {
		return fecha;
	}

}
