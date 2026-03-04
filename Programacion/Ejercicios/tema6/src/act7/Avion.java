package act7;

public class Avion implements Volador {
	
	// Attributes
	
	private String numSerie;
	private String motor;

	
	public Avion(String numSerie , String motor) {
		this.numSerie = numSerie;
		this.motor = motor;
	}
	@Override
	public void volar() {
		System.out.println(numSerie + " actualmente esta volando");
	}

}
