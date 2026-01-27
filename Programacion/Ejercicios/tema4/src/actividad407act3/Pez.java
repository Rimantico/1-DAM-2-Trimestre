package actividad407act3;

public class Pez extends Animal{
	
	
	//Enumerator
	
	public enum TipoAgua{
		DULCE,SALADA
	}
	
	// Attributes
	
	private int numeroAletas;
	private TipoAgua tipoAgua;
	
	// Constructor
	
	public Pez(String nombre, int edad, String especie, double peso, int numeroAletas, TipoAgua tipoAgua) {
		super(nombre,edad,especie,peso);
		this.numeroAletas = numeroAletas;
		this.tipoAgua = tipoAgua;
	}
	
	// Methods
	
	public void filtrarOxigeno() {
		System.out.println(nombre + " esta filtrando Oxigeno");
	}
	
	@Override
	public void moverse() {
		System.out.println("El pez se mueve por el agua");
	}

}
