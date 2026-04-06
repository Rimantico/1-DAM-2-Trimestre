package tema6act2;

public class Informe implements Imprimible{
	
	private int idInforme;
	private String contenidoInforme;
	
	public Informe(int idInforme, String contenidoInforme) {
		this.idInforme = idInforme;
		this.contenidoInforme = contenidoInforme;
	}
	
	@Override
	public String toString() {
		
		return "ID del informe: " + idInforme + "\n" +
		"Contenido del Informe: " + contenidoInforme;
	}
	
	

}
