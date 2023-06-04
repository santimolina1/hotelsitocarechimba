package logica_;

public class PagoOnline {
	
	private PasarelasDePagos pasarela;
	
	
	public void PagoOnline(String clasePago, String archivo) {
		try
		{
		// 1. Dado el nombre completo (claseAgenda), encontramos un objeto de la clase
		// Class
		Class clase = Class.forName(clasePago);
		// 2. Le pedimos a la clase un constructor sin parámetros y luego lo usamos
		// para crear una nueva instancia de la clase
		pasarela = (PasarelasDePagos) clase.getDeclaredConstructor(null).newInstance(null);
		// 3. Cargamos los contactos llamando al método abstracto de AgendaTelefonica:
		// la implementación que se ejecutará dependerá de la clase exacta que se haya
		// recibido como el parámetro claseAgenda
		
		}
		/*
		catch (IOException e)
		{
		System.out.println("Hubo un error de lectura");
		}
		*/
		catch (Exception e)
		{
		System.out.println("Hubo otro error construyendo la agenda telefónica: " + e.getMessage());
		e.printStackTrace();
		}
	}

}
