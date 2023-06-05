package Excepciones;

public class datosErroneosException extends PagoException{
	private String nombre;

	public datosErroneosException(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getMessage() {
		return "La tarjeta " + nombre + " con la información solicitada no fue encontrada";
	}

	public String getNombreProducto() {
		return nombre;
	}

}
