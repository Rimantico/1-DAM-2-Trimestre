package act1;

public class Gato implements Animal {
	
	
	// Attributes
	
	private String nombre;
	private String raza;
	private String colorPelo;
	
	public Gato(String nombre, String raza, String colorPelo) {
		this.nombre = nombre;
		this.raza = raza;
		this.colorPelo = colorPelo;
	}

	@Override
	public void hacerSonido() {
		System.out.println(nombre + " hace miau");

	}

	@Override
	public void moverse() {
		System.out.println( nombre +" se mueve");

	}

}
