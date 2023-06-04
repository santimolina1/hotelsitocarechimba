package consola;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import logica_.Cama;
import logica_.HuespedReserva;
import logica_.Reserva;
import modelo.CargadorArchivo;
import controlador.controlador;

public class Hotel {
	public String nombre = "Hotel Andes";
	public String tiposDeHabitación = "Estandar, Suite, Suite Doble";
	public String servicios = "Alojamiento, spa, guia turistico, Restaurante, servicio a la habitación y muchas diversiones más :)";
	public String restaurante;
	public String caracteristicas="Parqueadero, Piscina, Zonas húmedas, BBQ, Wifi Gratis, Recepción 24 horas, Admite mascotas";
	HashMap<String, String> usuariosYPass = new HashMap<String, String>();
	HashMap<String, String> tipoDePersona = new HashMap<String, String>();
	ArrayList<String> usuarios = new ArrayList<String>(usuariosYPass.keySet());
	AplicacionCliente clientes = new AplicacionCliente();
	MenuAdmin admins = new MenuAdmin();
	
private static Hotel instancia;
	
	private Hotel()
	{
		
	}
	
	public String getCaracteristicas() {
		return caracteristicas;
	}

	public static Hotel getInstance()
	{
		if (instancia == null)
			instancia = new Hotel();
		
		return instancia;
	}
	
	
	
	
	
	
	

	public HashMap<String, String> cargarUsuarios() throws IOException {
		File archivoUsers = new File("./data/usuarios.txt");
		FileReader archivo = new FileReader(archivoUsers);
		BufferedReader br = new BufferedReader(archivo);
		String linea = br.readLine();

		while (linea != null) // Cuando se llegue al final del archivo, linea tendrá el valor null
		{
			// fechaInical;fechaFinal;dia;tipo de habitacion;extra 01-01-23;07-01-23

			String[] partes = linea.split(";");

			String elUser = partes[0];
			String elPassw = partes[1];
			String persona = partes[2];
			String User = usuariosYPass.get(elUser);
			if (User == null) {
				usuariosYPass.put(elUser, elPassw);
				tipoDePersona.put(elUser, persona);

			}
			linea = br.readLine(); // Leer la siguiente línea
		}

		br.close();
		return usuariosYPass;
	}

	public String iniciarSesion(String user, String password) throws IOException {

		HashMap<String, String> usuariosYPass = cargarUsuarios();
		ArrayList<String> usuarios = new ArrayList<String>(usuariosYPass.keySet());

		String retorno = "";
		Boolean cond1 = usuarios.contains(user);
		String contraseña = usuariosYPass.get(user);
		Boolean cond2 = password.equals(contraseña);
		String persona = tipoDePersona.get(user);
		if (cond1 & cond2) {
			retorno = "Inició sesión con exito";

			if (persona.equals("administrador")) {
				retorno="admin";
				admins.ejecutarAplicacion();
			}
			if (persona.equals("usuario")) {
				retorno="user";
				//clientes.ejecutarAplicacion();
			}

		} else {
			retorno = "Usuario o contraseña incorrecta";
		}

		return retorno;
	}

	public String crearUsuario(String user, String password) throws IOException {
		cargarUsuarios();
		
		String retorno = "";
		Boolean cond = usuariosYPass.containsKey(user);
		
		if (cond) {
			retorno = "El usuario ya existe";
		} else {
			File archivo = new File("./data/usuarios.txt");

			try {
				FileWriter escritor = new FileWriter(archivo, true);
				escritor.write(user + ";");
				escritor.write(password + ";");
				escritor.write("usuario" + "\n");
				escritor.close();
				System.out.println("Se escribió en el archivo correctamente.");
			} catch (IOException e) {
				System.out.println("Hubo un error al escribir en el archivo.");
				e.printStackTrace();
			}
		}
		return retorno;
	}
	
	public String crearReserva(Reserva reserva) throws IOException {
		
		String retorno="";
		File archivo= new File("./data/reservas.txt");
		HuespedReserva huesped=reserva.getHuespedReserva();
		String nombre=huesped.getNombre();
		Date fecha_llegada=reserva.getFecha_llegada();
		Date fecha_salida=reserva.getFecha_salida();
		int acompañantes=reserva.getCantidadDeAcompañantes();
		String habitacion=reserva.getHabitacion();
		
	
		
		FileWriter escritor= new FileWriter(archivo,true);
		
		escritor.write(nombre+";");
		escritor.write(fecha_llegada+";");
		escritor.write(fecha_salida+";");
		escritor.write(acompañantes+";");
		escritor.write(habitacion+";");
		escritor.write("reserva"+"\n");
		escritor.close();
		
		
		
		
		
		
		return retorno ;
		
		
	}

	public String eliminarReserva(String nombre, Date fechaLlegada, Date fechaSalida) {
	    String retorno = "";
	    try {
	        File archivo = new File("./data/reservas.txt");
	        File tempArchivo = new File("./data/reservas_temp.txt");
	        BufferedReader lector = new BufferedReader(new FileReader(archivo));
	        BufferedWriter escritor = new BufferedWriter(new FileWriter(tempArchivo));

	        String lineaActual;

	        while ((lineaActual = lector.readLine()) != null) {
	            String[] datos = lineaActual.split(";");

	            // Comparamos los datos de la reserva actual con los parámetros de entrada
	            String nombreReserva = datos[0];
	            Date llegadaReserva = new Date(Long.parseLong(datos[1]));
	            Date salidaReserva = new Date(Long.parseLong(datos[2]));

	            if (nombreReserva.equals(nombre) && llegadaReserva.equals(fechaLlegada) && salidaReserva.equals(fechaSalida)) {
	                continue; // Saltamos la línea actual, que corresponde a la reserva que queremos eliminar
	            }

	            // Si la línea actual no corresponde a la reserva que queremos eliminar, la escribimos en el archivo temporal
	            escritor.write(lineaActual + System.getProperty("line.separator"));
	        }

	        escritor.close();
	        lector.close();

	        // Borramos el archivo original y renombramos el temporal con su nombre
	        archivo.delete();
	        tempArchivo.renameTo(archivo);

	    } catch (IOException e) {
	        retorno = "Error al intentar eliminar la reserva.";
	    }
	    return retorno;
	    
	    
	}
	public static String fechaString(Date date) {
		SimpleDateFormat dateFormatter=null;
        
        dateFormatter = new SimpleDateFormat("dd/MM");
       
        return dateFormatter.format(date);
	}


//holaaa
}
