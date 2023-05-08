package interfaz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DatosGrafica {
	
	
	
	
	int[] data= {0,0,0,0,0,0,0,0,0,0,0,0};
	public void obtenerOcupacion() throws IOException{
		FileReader archivo = new FileReader("./data/reservas.txt");
		BufferedReader br = new BufferedReader(archivo);
		String linea = br.readLine();
		String[] titulos = linea.split(";");
		linea = br.readLine();

		while (linea != null) // Cuando se llegue al final del archivo, linea tendrá el valor null
		{
			// producto, precio, tiempo, Shabitacion

			String[] partes = linea.split(";");

			Date llegada = formatearFecha(partes[1], "dd/MM/yyyy");
			
			Calendar calendar = Calendar.getInstance();
	        calendar.setTime(llegada);
	 
	        int mes = calendar.get(Calendar.MONTH);
	        
        	switch (mes) {
        	case 0:data[0]++;
			case 1:data[1]++;
			case 2:data[2]++;
			case 3:data[3]++;
			case 4:data[4]++;
			case 5:data[5]++;
			case 6:data[6]++;
			case 7:data[7]++;
			case 8:data[8]++;
			case 9:data[9]++;
			case 10:data[10]++;
			case 11:data[11]++;
			
			
				break;
        	}
				
			linea = br.readLine(); // Leer la siguiente línea
		}

		br.close();
		
	
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
	public DatosGrafica() throws IOException {
		obtenerOcupacion();
	}
	public int[] getData() {
		return data;
	}
	
	
}
