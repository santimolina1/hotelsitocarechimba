package logica_;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Factura {

	private LocalDate fecha;
	private String nombre;
	private HuespedReserva huesped;
	private float valorTotal;
	private float impuestos;
	private int numeroFactura;
	public ArrayList<Consumo> consumos = new ArrayList<Consumo>();

	public Factura(LocalDate fecha, String nombre, HuespedReserva huesped, ArrayList<Consumo> consumos) {

		this.fecha = fecha;
		this.nombre = nombre;
		this.huesped = huesped;
		this.consumos = consumos;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public HuespedReserva getHuésped() {
		return huesped;
	}

	public float getValotTotal() {
		float suma = 0f;
		for (Consumo c : consumos) {
			if (c.getPagado() == false) {
				suma += c.getPrecio();
			}
		}
		return suma;
	}

	public float getImpuestos() {
		float suma = 0f;
		for (Consumo c : consumos) {
			if (c.getPagado() == false)

			{
				suma += c.getImpuestos();
			}
		}
		return suma;
	}

	public int getNumeroFactura() {

		double x = Math.random() * 10000;

		int num = (int) x;
		return num;
	}

	public ArrayList<Consumo> getConsumos() {
		return consumos;
	}

	public HashMap<String, Object> generarFactura() {
		HashMap<String, Object> elementos = new HashMap<String, Object>();

		elementos.put("fecha", fecha);
		elementos.put("nombre", nombre);
		elementos.put("huesped", huesped);
		elementos.put("valor", getValotTotal());
		elementos.put("impuestos", getImpuestos());
		elementos.put("numeroF", getNumeroFactura());
		return elementos;

	}
	public void cargarValoresHabitacion(){
		File archivo =new File ("valoresPorHabitacion.txt");
		PrintWriter pw = null;
		Consumo tarifa=null;
		Consumo habitacion=null;
		for(Consumo i: consumos) {
			if(i.getNombre().contains("Tarifa habitación")) {
				tarifa=i;
			}
			else if(esNumeroEntero(i.getNombre())) {
				habitacion=i;
			}
		}
		if(tarifa!=null && habitacion!=null) {
		try {
			pw = new PrintWriter(archivo);
			pw.println(tarifa.getNombre() + "   ----   " + tarifa.getPrecio() );
			pw.println(habitacion.getNombre() + "   ----   " + habitacion.getPrecio() );
		
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();

		} finally {
			if (pw != null) {
				pw.close();
			}
		}
		}

	}
	
	public void cargarValoresTotales(){
		File archivo =new File ("valoresTotalesFacturas.txt");
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(archivo);
			pw.println(getNombre() + "   ----   " + getValotTotal() + getImpuestos());
		
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();

		} finally {
			if (pw != null) {
				pw.close();
			}
		}

	}

	

	public void generarTextoFactura() {
		
		
		
		File archivo =new File (Integer.toString(getNumeroFactura())+".txt");
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(archivo);
			// escribir
			pw.println("Número de factura: " + getNumeroFactura());
			System.out.println("Número de factura: " + getNumeroFactura());
			pw.println("Fecha: " + fecha);
			System.out.println("Fecha: " + fecha);
			pw.println("Nombre: " + nombre);
			System.out.println("Nombre: " + nombre);

			pw.println("Producto   ----   Precio ----  Pagado");
			for (Consumo i : consumos) {

				pw.println(i.getNombre() + "   ----   " + i.getPrecio() + "   ----   " + i.getPagado());
			}

			pw.println("Precio neto de lo NO pago: " + getValotTotal());
			pw.println("valor del IVA de lo NO pago: " + getImpuestos());
			pw.println("Valor total de lo NO pago: " + (getValotTotal() + getImpuestos()));

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();

		} finally {
			if (pw != null) {
				pw.close();
			}
		}
		cargarValoresTotales();
		cargarValoresHabitacion();

	}
	
	public boolean esNumeroEntero(String texto) {
	    try {
	        Integer.parseInt(texto);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}
	
	

}
