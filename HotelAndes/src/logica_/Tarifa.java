package logica_;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import modelo.CargadorArchivo;

public class Tarifa implements Servicio{
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

	public float getPrecioTotal() {
		return precio;
	}

	public Date getFecha() {
		return fecha;
	}

	@Override
	public String getNombre() {
		String nombre= "Tarifa habitación "+ tipoHabitacion + " en la fecha: " + fechaString(fecha);
		return nombre;
	}

	@Override
	public String getUbicacion() {
		
		return "N. A";
	}

	@Override
	public String[] getDias() {
		String[] a=new String[1];
		a[0]="N.A";
		return a;
	}

	@Override
	public String getHorariosDeDisponibilidad() {
		
		return "N.A";
	}
	public  String fechaString(Date date) {
		SimpleDateFormat dateFormatter=null;
        
        dateFormatter = new SimpleDateFormat("dd/MM");
       
        return dateFormatter.format(date);
	}

}
