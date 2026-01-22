package actividad407act3;

public class Animal {
	
	// Attributes
	
	protected String nombre;
	protected int edad;
	protected Sexo sexo;
	protected double peso;
	protected int energia;
	
	// Constructor
	
	public Animal(String nombre, int edad, Sexo sexo, double peso , int energia) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.energia = energia;
	}
	
	// Methods
	
	public enum Sexo{
		H,
		M
	}
	
}
