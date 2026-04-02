package act16;

public class Alojamiento {
	
	// Attributes
	
	private String nombreAlojamiento;
	private String ciudadAlojamiento;
	
	// Constructor
	
	public Alojamiento(String nombreAlojamiento, String ciudadAlojamiento) {
		this.nombreAlojamiento = nombreAlojamiento;
		this.ciudadAlojamiento = ciudadAlojamiento;
	}
	
	// Getters and Setters

	public String getNombreAlojamiento() {
		return nombreAlojamiento;
	}

	public void setNombreAlojamiento(String nombreAlojamiento) {
		this.nombreAlojamiento = nombreAlojamiento;
	}

	public String getCiudadAlojamiento() {
		return ciudadAlojamiento;
	}

	public void setCiudadAlojamiento(String ciudadAlojamiento) {
		this.ciudadAlojamiento = ciudadAlojamiento;
	}
	
	
	// Methods
	
	@Override
	public String toString() {
		return "Nombre del Alojamiento: " + nombreAlojamiento + "\n" +
				" Ciudad del Alojamiento: " + ciudadAlojamiento;
	}
	

}
