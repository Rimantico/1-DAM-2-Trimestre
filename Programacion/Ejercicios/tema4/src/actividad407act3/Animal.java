package actividad407act3;

public class Animal {

	// Attributes
	
	protected String nombre;
	protected int edad;
	protected String especie;
	protected double peso;
	
	// Constructor
	
	public Animal(String nombre, int edad, String especie, double peso) {
		this.nombre = nombre;
		this.edad = edad;
		this.especie = especie;
		this.peso = peso;
	}
	
	// Methods
	
	public void comer() {
		System.out.println("El animal está comiendo");
	}
	public void dormir() {
		System.out.println("El animal está durmiendo");
	}
	public void moverse() {
		System.out.println("El animal se está moviendo");
	}
}
