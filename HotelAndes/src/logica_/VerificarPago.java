package logica_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import Excepciones.PagoException;
import Excepciones.datosErroneosException;
import Excepciones.saldoInsuficienteException;
import Excepciones.tarjetaReportadaException;
import controlador.controlador;
import modelo.CargadorArchivo;


public class VerificarPago {
	private static VerificarPago instancia;
	private HashMap<String,Tarjeta>  tarjetas= new HashMap<String,Tarjeta> ();
	public static VerificarPago getInstance()
	{
		if (instancia == null)
			instancia = new VerificarPago();
		
		return instancia;
	}
	
	
	public HashMap<String,Tarjeta> cargarTarjetas() throws IOException {
		HashMap<String,Tarjeta>  tarjetas= new HashMap<String,Tarjeta> ();
		FileReader archivo = new FileReader("./data/infoTarjetas.txt");
		BufferedReader br = new BufferedReader(archivo);
		String linea = br.readLine();
		String[] titulos = linea.split(";");
		linea = br.readLine();

		while (linea != null) // Cuando se llegue al final del archivo, linea tendrá el valor null
		{
			//metodo;numero;cedula;codigo;fechaVencimiento;saldo;reportada

			String[] partes = linea.split(";");

			String metodo = partes[0];
			String numero = (partes[1]);
			String cedula = partes[2];
			String codigo = (partes[3]);
			String fechaVencimiento = (partes[4]);
			String saldo = (partes[5]);
			String reportada = (partes[6]);
			Tarjeta laTarjeta = tarjetas.get(numero);
			if (laTarjeta == null) {
				laTarjeta = new Tarjeta(metodo, numero, cedula, codigo,fechaVencimiento,saldo,reportada);
				tarjetas.put(numero, laTarjeta);
							}
			linea = br.readLine(); // Leer la siguiente línea
		}

		br.close();
		return tarjetas;

	}
	
	public void verificacion(String numero, String contraseña) throws IOException, PagoException {
		controlador control= controlador.getInstance();
		HashMap<String, HuespedReserva> huespedes=control.getHuespedes();
		ArrayList<HuespedReserva> listaHuespedes = new ArrayList<>(huespedes.values());
		System.out.println(huespedes);
		System.out.println(listaHuespedes);
		float total=0;
		HuespedReserva a = listaHuespedes.get(0);
		HashMap<String,Consumo> consumos= a.getConsumos();
		for (Consumo i: consumos.values()) {
			if(i.getPagado()!=true) {
				total+=(i.getPrecio()+i.getImpuestos());
			}
		}
		HashMap<String,Tarjeta>  tarjetas=cargarTarjetas();
		for(String i: tarjetas.keySet()) {
			System.out.println( i);
			
		}
		Tarjeta tarje= tarjetas.get(numero);
		System.out.println(tarje);
		 
		
		if (tarje==null) {
			datosErroneosException ex = new datosErroneosException(numero);
			throw ex;
		}
		else {
			if(!tarje.getCodigo().equals(contraseña)) {
				datosErroneosException ex = new datosErroneosException(numero);
				throw ex;
			}
			
			if(Float.parseFloat(tarje.getSaldo())<total) {
				saldoInsuficienteException ex = new saldoInsuficienteException();
				throw ex;
				
				
			}
			if(tarje.getReportada().equals("1")) {
				tarjetaReportadaException ex = new tarjetaReportadaException(numero);
				throw ex;
			}
		}
	}
	
	public static String fechaString(Date date) {
		SimpleDateFormat dateFormatter=null;
        
        dateFormatter = new SimpleDateFormat("dd/MM");
       
        return dateFormatter.format(date);
	}

}
