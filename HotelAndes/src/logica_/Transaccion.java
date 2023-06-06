package logica_;

import java.util.Date;

public class Transaccion {
	private Date fecha;
	private float valor;
	private String resultado;
	
	public Transaccion(Date fecha, float valor, String resultado) {
	
		this.fecha = fecha;
		this.valor = valor;
		this.resultado = resultado;
	}
	
	public String verificarDatos(String  tarjeta, String codigo) {
		String a="";		
			return a;
	}

	public Date getFecha() {
		return fecha;
	}

	public float getValor() {
		return valor;
	}

	public String getResultado() {
		return resultado;
	}
	
	
	

}
