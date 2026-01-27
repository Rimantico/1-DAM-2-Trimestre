package actividad407act5;


public class Nazareno extends Cofrade{
	
	// Enumerator
	
	public enum Posicion{
		CORTEJO, FILAS, ORDEN
	}
	
	//Attributes
	
	private int numTunica;
	private Posicion posicion;
	
	// Constructor
	
	public Nazareno(String dni, String nombre, int edad, Procesion procesion, Puesto puesto, int numTunica, Posicion posicion) {
		super(dni,nombre,edad,procesion,puesto);
		this.numTunica = numTunica;
		this.posicion = posicion;
		ponerCofrade();
	}
	

}
