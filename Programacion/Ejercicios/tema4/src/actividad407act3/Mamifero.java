package actividad407act3;

public class Mamifero extends Animal{
	
	// Attributes
	
	private String tipoPelaje;
	
	
	// Constructor
	
	public Mamifero(String nombre, int edad, String especie, double peso, String tipoPelaje) {
		super(nombre,edad,especie,peso);
		this.tipoPelaje = tipoPelaje;
	}
	
	// Methods
	
	public void producirLeche() {
		System.out.println(nombre + " está produciendo leche");
	}
	
	@Override
	public void moverse() {
		System.out.println("El mamifero se esta moviendo");
	}

}
