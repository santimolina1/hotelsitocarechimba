package logica_;

import java.util.ArrayList;
import java.util.Date;

public class Reserva {
	private HuespedReserva huesped;
	private Date fecha_llegada;
	private Date fecha_salida;
	private float precio;
	private int cantidadDeAcompañantes;
	private float montoTotal;
	private boolean estado;
	private String habitacion;

	public String getHabitacion() {
		return habitacion;
	}

	public int getCantidadDeAcompañantes() {
		return cantidadDeAcompañantes;
	}

	public Date getFecha_llegada() {
		return fecha_llegada;
	}

	public Date getFecha_salida() {
		return fecha_salida;
	}

	public float getPrecio() {
		return precio;
	}

	public HuespedReserva getHuespedReserva() {
		return huesped;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Reserva(HuespedReserva huesped, Date fecha_llegada, Date fecha_salida, float precio,
			int cantidadDeAcompañantes,
			float montoTotal, boolean estado, String habitacion) {

		this.huesped = huesped;
		this.fecha_llegada = fecha_llegada;
		this.fecha_salida = fecha_salida;
		this.precio = precio;
		this.cantidadDeAcompañantes = cantidadDeAcompañantes;
		this.habitacion = habitacion;
		;
		this.montoTotal = montoTotal;
		this.estado = estado;
	}

	

	public float getMontoTotal() {
		return montoTotal;
	}

	public boolean isEstado() {
		return estado;
	}
}