package actividad407act3;

public class Mamifero extends Animal {
	
	// Attributes
	
	private boolean tienePelo;
	private boolean amamanta;
	private int mesesGestacion;
	
	// Constructor
	
	public Mamifero(String nombre, int edad, char sexo, double peso,int energia, boolean tienePelo, boolean amamanta, int mesesGestacion) {
		super(nombre, edad, sexo, peso, energia);
		this.tienePelo = tienePelo;
		this.amamanta = amamanta;
		this.mesesGestacion = mesesGestacion;
	}
	
	//Methods
	
	public void amamanta() {
		System.out.println("El mamifero "+ nombre + " esta amamantando");
	}
	
	
	
}
