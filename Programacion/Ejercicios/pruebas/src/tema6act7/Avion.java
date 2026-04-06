package tema6act7;

public class Avion implements Volador{
	
	private String nombreAvion;
	private int numeroHelices;
	
	
	public Avion(String nombreAvion, int numeroHelices) {
		this.nombreAvion = nombreAvion;
		this.numeroHelices = numeroHelices;
	}
	
	@Override
	public void volar() {
		System.out.println(nombreAvion + " al ser un avion solo puede volar");	
	}
	
	

}
