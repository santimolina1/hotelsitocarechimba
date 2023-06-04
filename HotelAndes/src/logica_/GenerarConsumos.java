package logica_;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;

import controlador.controlador;
import modelo.CargadorArchivo;

public class GenerarConsumos {
	public CargadorArchivo cargador =CargadorArchivo.getInstance();
	public HashMap<String, Bebida> bebidas = cargador.getBebidas();
	public HashMap<String, Servicio> servicios = cargador.getServicios();
	public HashMap<String, Plato> platos = cargador.getPlatos();
	private static GenerarConsumos instancia;
	public static GenerarConsumos getInstance()
	{
		if (instancia == null)
			instancia = new GenerarConsumos();
		
		return instancia;
	}
	
	public void generarConsumo(Consumo consumo) {
		String nombreArchivo="";
		if (bebidas.containsKey(consumo.getNombre()) || platos.containsKey(consumo.getNombre()) ) {
			
			nombreArchivo="consumosRestaurante";
		}
		else if (servicios.containsKey(consumo.getNombre())) {
			nombreArchivo="consumosRecreativos";
		}
		if (nombreArchivo!="") {
		File archivo =new File (nombreArchivo+".txt");
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(archivo);
			
			pw.println("Producto   ----   Precio ----  Pagado");
			
			pw.println(consumo.getNombre() + "   ----   " + consumo.getPrecio() + "   ----   " );
	
			

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();

		} finally {
			if (pw != null) {
				pw.close();
			}
		}

	}
	}

	}
	
	
	
	
	
	
	
	
	


