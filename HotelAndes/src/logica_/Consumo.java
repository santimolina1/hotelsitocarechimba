package logica_;

import java.time.LocalDate;

public class Consumo {

	private LocalDate fecha;
	private String nombre;
	private float precio;
	private float impuestos;
	private boolean pagado;

	public Consumo(LocalDate fecha, String nombre, float precio, float impuestos, boolean pagado) {

		this.fecha = fecha;
		this.nombre = nombre;

		this.precio = precio;
		this.impuestos = impuestos;
		this.pagado = pagado;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public float getImpuestos() {
		return impuestos;
	}

	public boolean getPagado() {
		return pagado;
	}

	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}

}
