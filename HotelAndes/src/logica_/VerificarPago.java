package logica_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class VerificarPago {
	
	private HashMap<String,Tarjeta>  tarjetas= new HashMap<String,Tarjeta> ();
	public HashMap<String,Tarjeta> cargarTarjetas() throws IOException {
		HashMap<String,Tarjeta>  tarjetas= new HashMap<String,Tarjeta> ();
		FileReader archivo = new FileReader("./data/infoTarjetas");
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

}
