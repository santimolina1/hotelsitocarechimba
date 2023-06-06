package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica_.Bebida;
import logica_.Cama;
import logica_.Habitacion;
import logica_.Plato;
import logica_.Servicio;
import logica_.ServicioRecreativo;
import logica_.Tarifa;
import modelo.CargadorArchivo;

class CargadorArchivoTest {
	
	private CargadorArchivo instancia;

    @BeforeEach
    public void setUp() {
    	instancia = CargadorArchivo.getInstance();
    }

	 @Test
	    public void cargarBebida() throws IOException {
	        
	        File archivoBebidas = new File("./data/bebidas.txt");

	     
	        HashMap<String, Bebida> bebidas = instancia.cargarBebida(archivoBebidas);

	       
	        Assertions.assertEquals(9, bebidas.size()); 
	        Assertions.assertTrue(bebidas.containsKey("Jugo")); 
	        Assertions.assertTrue(bebidas.containsKey("Cafe"));
	        Assertions.assertTrue(bebidas.containsKey("AguaConGas"));
	        Assertions.assertTrue(bebidas.containsKey("Gaseosa"));
	        Assertions.assertTrue(bebidas.containsKey("PiñaColada"));
	    }

	    @Test
	    public void cargarPlato() throws IOException {
	    	File archivoPlatos = new File("./data/platos.txt");

		     
	        HashMap<String, Plato> platos = instancia.cargarPlato(archivoPlatos);

	       
	        Assertions.assertEquals(19, platos.size()); 
	        Assertions.assertTrue(platos.containsKey("Waffles")); 
	        Assertions.assertTrue(platos.containsKey("Bunuelo"));
	        Assertions.assertTrue(platos.containsKey("LomoDeRes"));
	        Assertions.assertTrue(platos.containsKey("Pasta"));
	        Assertions.assertTrue(platos.containsKey("Empanadas"));
	    }

	    @Test
	    public void cargarCamas() throws IOException {
	    	File archivoCamas = new File("./data/camas.txt");

		     
	        HashMap<String, Cama> camas = instancia.cargarCamas(archivoCamas);

	       
	        Assertions.assertEquals(5, camas.size()); 
	        Assertions.assertTrue(camas.containsKey("King")); 
	        Assertions.assertTrue(camas.containsKey("Queen"));
	        Assertions.assertTrue(camas.containsKey("Doble"));
	        Assertions.assertTrue(camas.containsKey("Sencilla"));
	        Assertions.assertTrue(camas.containsKey("Ninos"));
	    }

	    @Test
	    public void cargarHabitacion() throws IOException {
	    	File archivohab = new File("./data/habitacion.txt");

		     
	        HashMap<String, Habitacion> cuartos = instancia.cargarHabitacion(archivohab);

	       
	        Assertions.assertEquals(50, cuartos.size()); 
	        Assertions.assertTrue(cuartos.containsKey("1")); 
	        Assertions.assertTrue(cuartos.containsKey("6"));
	        Assertions.assertTrue(cuartos.containsKey("9"));
	        Assertions.assertTrue(cuartos.containsKey("30"));
	        Assertions.assertTrue(cuartos.containsKey("50"));
	    }

	    

	    @Test
	    public void cargarServicios_deberiaCargarServiciosCorrectamente() throws IOException {
	    	File archivoServicios = new File("./data/servicios.txt");

		     
	        HashMap<String, Servicio> servicios = instancia.cargarServicios(archivoServicios);

	       
	        Assertions.assertEquals(13, servicios.size()); 
	        Assertions.assertTrue(servicios.containsKey("guiaPorLaIsla")); 
	        Assertions.assertTrue(servicios.containsKey("chivaRumbera"));
	        Assertions.assertTrue(servicios.containsKey("spaConJacussi"));
	        Assertions.assertTrue(servicios.containsKey("cityTourHistorico"));
	        Assertions.assertTrue(servicios.containsKey("masajeAfrodisiaco"));
	    }

}
