package modelo;

public class Coche extends Vehiculo {
	
	// Atributos
	
	protected int numeroPuertas;
	
	// Constructor
	
	public Coche(String matricula , String marca, int velocidad , int numeroPuertas) {
		super(matricula,marca,velocidad);
		this.numeroPuertas = numeroPuertas;
	}

	// Métodos
	
	public void tocarClaxon() {
		System.out.println("El coche ha tocado el claxon");
	}
	
	@Override
	public void arrancar() {
		System.out.println("El coche ha arrancado");

	}
	
}
