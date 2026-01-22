package actividad407act5;


public class Portadores extends Cofrade{
	
	// Enumerators
	
	public enum Posicion{
		COSTALERO, CAPATAZ, LISTERO, MAYORDOMO
	}
	
	// Attributes
	
	private int alturaHombrocm;
	private Posicion posicion;
	
	// Constructor
	
	public Portadores(String dni, String nombre, int edad, Procesion procesion, Puesto puesto, int alturaHombrocm, Posicion posicion) {
		super(dni,nombre,edad,procesion,puesto);
		this.alturaHombrocm = alturaHombrocm;
		this.posicion = posicion;
		quitarPlaza();
	}
	
	// Methods
	
	public void setCostalero() {
		posicion = Posicion.COSTALERO;
	}
	
	public void setCapataz() {
		posicion= Posicion.CAPATAZ;
	}
	
	public void setListero() {
		posicion=Posicion.LISTERO;
	}
	
	public void setMayordomo() {
		posicion= Posicion.MAYORDOMO;
	}
	
	

}
