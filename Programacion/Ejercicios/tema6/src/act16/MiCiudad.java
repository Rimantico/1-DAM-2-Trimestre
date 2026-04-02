package act16;

import java.util.ArrayList;
import java.util.List;

public final class MiCiudad extends Ciudad {

	// Attributes

	private String codigoCiudad;
	private List<LugarInteres> lugarInteres;
	private List<Alojamiento> alojamiento;
	private boolean visitado = false;

	// Constructor

	public MiCiudad(String nombreCiudad, String paisCiudad, String ciudadContinente, String codigoCiudad,
			boolean visitado) throws ComprobarCodigoCiudadException {
		super(nombreCiudad, paisCiudad, ciudadContinente);
		comprobarCodigoCiudad(codigoCiudad);
		lugarInteres = new ArrayList<>();
		alojamiento = new ArrayList<>();
		this.visitado = visitado;
	}

	public String getCodigoCiudad() {
		return codigoCiudad;
	}

	public void setCodigoCiudad(String codigoCiudad) {
		this.codigoCiudad = codigoCiudad;
	}

	public List<LugarInteres> getLugarInteres() {
		return lugarInteres;
	}

	public void setLugarInteres(List<LugarInteres> lugarInteres) {
		this.lugarInteres = lugarInteres;
	}

	public List<Alojamiento> getAlojamiento() {
		return alojamiento;
	}

	public void setAlojamiento(List<Alojamiento> alojamiento) {
		this.alojamiento = alojamiento;
	}

	public boolean isVisitado() {
		return visitado;
	}

	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}

	// Methods

	public void comprobarCodigoCiudad(String codigoCiudad) throws ComprobarCodigoCiudadException {
		String regex = "^[A-Z]{3}-[A-Z]{3}-[A-Z]{3}$";
		if (codigoCiudad.matches(regex)) {
			this.codigoCiudad = codigoCiudad;
		} else
			throw new ComprobarCodigoCiudadException("El codigo de ciudad es erroneo");

	}

	@Override
	public String toString() {
		return "NombreCiudad: " + nombreCiudad + "\n" +
				"Pais: " + paisCiudad +
				"Continente: " + ciudadContinente + "\n" +
				"Codigo Ciudad: " + codigoCiudad + "\n" +
				"¿Se ha visitado?" + visitado;
	}

}
