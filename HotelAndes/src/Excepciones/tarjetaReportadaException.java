package Excepciones;

public class tarjetaReportadaException extends PagoException{
	private String nombre;

	public tarjetaReportadaException(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getMessage() {
		return "La tarjeta " + nombre + " Se encuentra reportada";
	}

	public String getNombreProducto() {
		return nombre;
	}

}
