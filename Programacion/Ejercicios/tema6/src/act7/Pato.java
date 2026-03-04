package act7;

public class Pato implements Nadador,Volador{

	// Attributes
	
	private String nombre;
	private String edad;
	
	// Constructor
	
	public Pato(String nombre, String edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	// Methods
	
	public void volar() {
		System.out.println(nombre + " esta volando");
	}
	
	public void nadar() {
		System.out.println(nombre + " esta nadando");
	}
}
