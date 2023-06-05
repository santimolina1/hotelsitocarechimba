package tests;

import org.junit.jupiter.api.Test;

import modelo.CargadorArchivo;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;


public class CargadorPrueba {

    @Test
    public void testCargarArchivo() {
        CargadorArchivo cargador = CargadorArchivo.getInstance();

        // Prueba de carga exitosa
        String contenido = null;
        try {
            contenido = cargador.CargadorArchivo("data/bebidas.txt");
        } catch (IOException e) {
            fail("No se esperaba una excepción en la carga exitosa");
        }
        assertEquals("Contenido del archivo de bebidas.", contenido);

        // Prueba de carga fallida (archivo inexistente)
        assertThrows(FileNotFoundException.class, () -> {
            CargadorArchivo.getInstance().CargadorArchivo("data/archivo_inexistente.txt");
        });

        // Prueba de carga fallida (archivo vacío)
        assertThrows(IOException.class, () -> {
            CargadorArchivo.getInstance().CargadorArchivo("data/archivo_vacio.txt");
        });
    }
}







