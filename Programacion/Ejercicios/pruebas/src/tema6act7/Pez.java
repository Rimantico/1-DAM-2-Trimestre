package tema6act7;

public class Pez implements Nadador{
	
	private String nombrePez;
	private String razaPez;
	
	public Pez(String nombrePez, String razaPez) {
		this.nombrePez = nombrePez;
		this.razaPez = razaPez;
	}
	
	@Override
	public void nadar() {
		System.out.println(nombrePez + " al ser solo un pez, este solo puede nadar");	
	}

}
