package actividad407act3;

public class Ave extends Animal{
	
	// Attributes
	
	private double envergaduraAlas;
	private String tipoPico;
	
	// Constructor
	
	public Ave(String nombre, int edad, String especie, double peso, double envergaduraAlas, String tipoPico) {
		super(nombre,edad,especie,peso);
		this.envergaduraAlas = envergaduraAlas;
		this.tipoPico= tipoPico;
	}
	
	// Methods
	
	public void ponerHuevo() {
		System.out.println(nombre + "  ha puesto un huevo");
	}
	
	@Override
	public void moverse(){
		System.out.println("El ave se ha puesto a volar");
	}
	
}
