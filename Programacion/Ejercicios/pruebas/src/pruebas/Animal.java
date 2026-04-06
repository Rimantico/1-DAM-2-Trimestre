package pruebas;

public class Animal {
	
	private int idAnimal;
	private String nombreAnimal;
	
	// Constructor
	
	public Animal(int idAnimal , String nombreAnimal) {
		this.idAnimal = idAnimal;
		this.nombreAnimal = nombreAnimal;
	}
	// Getters and Setters

	public int getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}

	public String getNombreAnimal() {
		return nombreAnimal;
	}

	public void setNombreAnimal(String nombreAnimal) {
		this.nombreAnimal = nombreAnimal;
	}

	
	
}
