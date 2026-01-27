package actividad407act5;



public class Portador extends Cofrade{
	
	// Enumerator
	
	public enum Posicion{
		CABEZA, COLA, LATERALES, SUBMARINOS
	}

	// Attributes
	private int alturaHombro;
	private Posicion posicion;
	
	// Constructor
	
	public Portador(String dni, String nombre, int edad, Procesion procesion, Puesto puesto, int alturaHombro, Posicion posicion) {
		super(dni,nombre,edad,procesion,puesto);
		this.alturaHombro = alturaHombro;
		this.posicion = posicion;
		ponerCofrade();
	}
}
