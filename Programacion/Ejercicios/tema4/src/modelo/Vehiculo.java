package modelo;

public class Vehiculo {
	
	// Atributos
	
	protected String matricula;
	protected String marca;
	protected int velocidad;
	
	// Constructor
	
	public Vehiculo(String matricula, String marca, int velocidad) {
		this.matricula = matricula;
		this.marca = marca;
		this.velocidad = velocidad;
	}
	
	// Métodos
	
	public void arrancar() {
		System.out.println("El vehículo ha arrancado");
	}

}
