package modelo;

import java.util.HashMap;

import logica_.Bebida;
import logica_.Plato;

public class Restaurante {
	CargadorArchivo cargador= CargadorArchivo.getInstance();
	public HashMap<String, Plato> platos= cargador.getPlatos();
	public HashMap<String, Bebida> bebidas= cargador.getBebidas();
	public HashMap<String, Plato> getPlatos() {
		return platos;
	}
	public HashMap<String, Bebida> getBebidas() {
		return bebidas;
	}
	
	

}
