package logica_;

import java.io.IOException;
import java.util.ArrayList;

public abstract class PasarelasDePagos {
	
	
	
	public abstract void agregarPago(Transaccion transaccion,String archivo) throws IOException ;
	public abstract void guardarPagos(String archivo) throws IOException;
	public abstract ArrayList<Transaccion> cargarPagos(String archivo) throws IOException;
	

}
