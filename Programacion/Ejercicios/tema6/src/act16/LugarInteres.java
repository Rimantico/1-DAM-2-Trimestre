package act16;

public class LugarInteres {
	
	// Attributes
	
	private String nombreLugarInteres;
	private String ciudadLugarInteres;

	
	// Constructor
	
	public LugarInteres(String nombreLugarInteres, String ciudadLugarInteres) {
		this.nombreLugarInteres = nombreLugarInteres;
		this.ciudadLugarInteres = ciudadLugarInteres;
	}

	// Getters and Setters

	public String getNombreLugarInteres() {
		return nombreLugarInteres;
	}


	public void setNombreLugarInteres(String nombreLugarInteres) {
		this.nombreLugarInteres = nombreLugarInteres;
	}


	public String getCiudadLugarInteres() {
		return ciudadLugarInteres;
	}


	public void setCiudadLugarInteres(String ciudadLugarInteres) {
		this.ciudadLugarInteres = ciudadLugarInteres;
	}
	
	// Methods
	
	@Override
	public String toString() {
		return "Nombre del Lugar de Interes: " + nombreLugarInteres + "\n" +
				"Ciudad del lugar de Interes: " + ciudadLugarInteres; 
	}
	

}
