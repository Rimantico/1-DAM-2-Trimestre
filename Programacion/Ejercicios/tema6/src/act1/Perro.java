package act1;

public class Perro implements Animal{
	
	// Attributes
	
	private String nombre;
	private String raza;
	private String colorPelo;

	
	public Perro(String nombre, String raza, String colorPelo) {
		this.nombre = nombre;
		this.raza = raza;
		this.colorPelo = colorPelo;
	}


	@Override
	public void hacerSonido() {
		System.out.println(nombre + " ladra");
		
	}


	@Override
	public void moverse() {
		System.out.println(nombre + " se mueve");
	}
	
	// Methods
	
	

}
