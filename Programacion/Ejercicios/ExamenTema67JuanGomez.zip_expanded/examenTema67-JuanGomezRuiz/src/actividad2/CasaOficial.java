package actividad2;

public class CasaOficial implements Metodos {

	// Clase hecha por Juan Gómez Ruiz


	// Attributos

	private String nombreCasaOficial;
	private PersonaContacto personaContacto;

	// Constructor

	public CasaOficial(String nombreCasaOficial, PersonaContacto personaContacto) {
		super();
		this.nombreCasaOficial = nombreCasaOficial;
		this.personaContacto = personaContacto;
	}
	
	// Getters y Setters

	public String getNombreCasaOficial() {
		return nombreCasaOficial;
	}

	public void setNombreCasaOficial(String nombreCasaOficial) {
		this.nombreCasaOficial = nombreCasaOficial;
	}

	public PersonaContacto getPersonaContacto() {
		return personaContacto;
	}

	public void setPersonaContacto(PersonaContacto personaContacto) {
		this.personaContacto = personaContacto;
	}
	
	@Override
	public void acercaDe() {
		System.out.println("Autocares Juan");
		System.out.println("AP1231");	
	}

	@Override
	public String toString() {
		return "CasaOficial [nombreCasaOficial=" + nombreCasaOficial + ", personaContacto=" + personaContacto + "]";
	}
	
	

}
