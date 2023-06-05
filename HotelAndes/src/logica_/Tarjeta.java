package logica_;

public class Tarjeta {
	//metodo;numero;cedula;codigo;fechaVencimiento;saldo;reportada
	private String metodo;
	private String numero;
	private String cedula;
	private String codigo;
	private String fechaVencimiento;
	private String saldo;
	private String reportada;
	public Tarjeta(String metodo, String numero, String cedula, String codigo, String fechaVencimiento, String saldo,
			String reportada) {
		
		this.metodo = metodo;
		this.numero = numero;
		this.cedula = cedula;
		this.codigo = codigo;
		this.fechaVencimiento = fechaVencimiento;
		this.saldo = saldo;
		this.reportada = reportada;
	}
	public String getMetodo() {
		return metodo;
	}
	public String getNumero() {
		return numero;
	}
	public String getCedula() {
		return cedula;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}
	public String getSaldo() {
		return saldo;
	}
	public String getReportada() {
		return reportada;
	}
	
	
	

}
