package actividad407act3;

public class Ave extends Animal{
	
	// Attributes
	
	private boolean vuela;
	private double envergaduraAlas;
	private boolean poneHuevos;
	
	//  Constructor
	
	public Ave(String nombre, int edad, char sexo, double peso ,int energia, boolean vuela, double envergaduraAlas, boolean poneHuevos) {
		super(nombre,edad,sexo,peso, energia);
		this.vuela = vuela;
		this.envergaduraAlas = envergaduraAlas;
		this.poneHuevos = poneHuevos;
	}
	
	// Methods
	
	public void vuela() {
		if(vuela == true) {
			energia -= 10;
			System.out.println(nombre + " está volando");
		}else
			System.out.println(nombre + " no puede volar");
	}
}
