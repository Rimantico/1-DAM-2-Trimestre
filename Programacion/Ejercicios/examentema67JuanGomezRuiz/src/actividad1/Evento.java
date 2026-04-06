package actividad1;

public class Evento {

	// Attributes
	
	private int id;
	private int espectadores;
	
	public Evento(int id , int espectadores) {
		this.id = id;
		this.espectadores = espectadores;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEspectadores() {
		return espectadores;
	}

	public void setEspectadores(int espectadores) {
		this.espectadores = espectadores;
	}
	
}
