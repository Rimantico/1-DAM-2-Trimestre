package tema6act1;

public class Perro implements Animal{
	
	// Attributes
	
	private String nombre;
	private String raza;
	
	// Constructor
	
	public Perro(String nombre, String raza) {
		this.nombre = nombre;
		this.raza = raza;
	}
	
	// Methods
	
	@Override
	public void hacerSonido() {
		System.out.println(nombre + " como es un perro ladra");
	}
	
	
	@Override
	public void moverse() {
		System.out.println(nombre + " como se es un perro se mueve");
	}

}
