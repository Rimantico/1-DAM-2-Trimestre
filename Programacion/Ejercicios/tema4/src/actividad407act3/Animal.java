package actividad407act3;

public class Animal {
	
	// Atributos
	
	protected String nombre;
	protected int edad;
	protected char sexo;
	protected double peso;
	protected int energia;
	
	// Constructor
	
	public Animal(String nombre, int edad, char sexo, double peso , int energia) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.energia = energia;
	}
	
	// Methods
	
	public enum sexo{
		H,
		M
	}
	
}
