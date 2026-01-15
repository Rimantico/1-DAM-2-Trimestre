package modelo;

public class CocheElectrico extends Coche {
	
	// Atributos
	
	private int nivelBateria;
	
	
	// Constructor
	
	public CocheElectrico(String matricula, String marca, int velocidad, int numeroPuertas , int nivelBateria) {
		super(matricula, marca,velocidad, numeroPuertas);
		this.nivelBateria = nivelBateria;
	}
	
	// Métodos
	
	public void cargarBateria() {
		System.out.println("Batería cargándose");
	}

	@Override
	public void arrancar() {
		System.out.println("El coche eléctrico ha arrancado en silencio");
	}
}
