package act16;

public abstract class Ciudad {
	
	// Attributes
	
	protected String nombre;
	protected String pais;
	protected int poblacion;
	protected String continente;
	
	// Constructor
	
	public Ciudad(String nombre, String pais, int poblacion, String continente) {
		this.nombre = nombre;
		this.pais = pais;
		this.poblacion = poblacion;
		this.continente = continente;
	}
	
	public Ciudad(String nombre, String pais, String continente) {
		this.nombre = nombre;
		this.pais = pais;
		this.continente = continente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}
	
	

}
