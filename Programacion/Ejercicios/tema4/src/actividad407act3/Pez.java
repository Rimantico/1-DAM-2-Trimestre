package actividad407act3;

public class Pez  extends Animal{
	
	// Attribute
	
	private String tipoAgua;
	private boolean tieneEscamas;
	private boolean tieneBranquias;
	
	// Constructor
	
	public Pez(String nombre, int edad, Sexo sexo, int energia, int peso, String tipoAgua) {
		super(nombre,edad,sexo,energia,peso);
		this.tipoAgua = tipoAgua;
		this.tieneEscamas = tieneEscamas;
		this.tieneBranquias = tieneBranquias;
	}
	
	// Methods
	
	public void nadar() {
		energia-=5;
		System.out.println(nombre + " está nadando");
	}

}
