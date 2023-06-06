package logica_;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PayPal extends PasarelasDePagos{
	private ArrayList<Transaccion>pagos=new ArrayList<Transaccion>();
	@Override
	public void agregarPago(Transaccion transaccion,String archivo) throws IOException {
		pagos.add(transaccion);
		guardarPagos(archivo);
		
	}
	@Override
	public void guardarPagos(String archivoT) throws IOException {
		File archivo =new File (archivoT);
		PrintWriter pw = null;
		ArrayList<Transaccion> trans=cargarPagos(archivoT);
		try {
			pw = new PrintWriter(archivo);
			// escribir
			
			for (Transaccion i : pagos) {
				if(!trans.contains(i)) {
					pw.println(fechaString(i.getFecha()) + ";" + i.getValor() + ";" + i.getResultado());
					
				}
			}

			

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();

		} finally {
			if (pw != null) {
				pw.close();
			}
		}
		
	}
	@Override
	public ArrayList<Transaccion> cargarPagos(String archivoT) throws IOException {
		ArrayList<Transaccion> trans= new ArrayList<Transaccion>();
		FileReader archivo = new FileReader(archivoT);
		BufferedReader br = new BufferedReader(archivo);
		String linea = br.readLine();

		while (linea != null) // Cuando se llegue al final del archivo, linea tendrá el valor null
		{

			System.out.println(linea);
		String[] partes = linea.split(";");
		Date fecha = formatearFecha((partes[0]),"dd/MM");
		float valor = Float.parseFloat(partes[1]);
		String resultado = partes[2];
		Transaccion laTra= new Transaccion(fecha,valor,resultado);
		if(!trans.contains(laTra)) {
			trans.add(laTra);
		}
			
			linea = br.readLine();
		}
		br.close();
		
		return trans;
		
	}
	public Date formatearFecha(String date_time, String formato) {

		SimpleDateFormat dateParser = new SimpleDateFormat(formato);
		Date date = null;

		{
			try {
				date = dateParser.parse(date_time);

			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return date;
	}
	public  String fechaString(Date date) {
		SimpleDateFormat dateFormatter=null;
        
        dateFormatter = new SimpleDateFormat("dd/MM");
       
        return dateFormatter.format(date);
	}
	
}
