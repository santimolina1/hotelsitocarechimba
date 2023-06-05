package Excepciones;

public class saldoInsuficienteException extends PagoException {
	

	public saldoInsuficienteException() {
		
	}

	@Override
	public String getMessage() {
		return "La tarjeta no tiene fondos suficientes para realizar la compra";
	}

	

}
