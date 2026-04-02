package act16;

public abstract class Ciudad {
	
	// Attributes
	
	protected String nombreCiudad;
	protected String paisCiudad;
	protected String ciudadContinente;
	
	// Constructor
	
	public Ciudad(String nombreCiudad, String paisCiudad, String ciudadContinente) {
		this.nombreCiudad = nombreCiudad;
		this.paisCiudad = paisCiudad;
		this.ciudadContinente = ciudadContinente;
		
	}
	
	// Getters and Setters

	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

	public String getPaisCiudad() {
		return paisCiudad;
	}

	public void setPaisCiudad(String paisCiudad) {
		this.paisCiudad = paisCiudad;
	}

	public String getCiudadContinente() {
		return ciudadContinente;
	}

	public void setCiudadContinente(String ciudadContinente) {
		this.ciudadContinente = ciudadContinente;
	}
	
	

}
