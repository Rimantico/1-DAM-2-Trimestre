package tema6act1;

public class Gato implements Animal{
	
	// Attributes
	
	private String nombre;
	private String raza;
	
	// Constructor
	
	public Gato(String nombre, String raza) {
		this.nombre = nombre;
		this.raza = raza;
	}
	
	// Methods
	
	@Override
	public void hacerSonido() {
		System.out.println(nombre + " al ser un gato maulla");	
	}
	
	@Override
	public void moverse() {
		System.out.println(nombre + " al ser un gato se mueve con las patas");	
	}
	
	

}
