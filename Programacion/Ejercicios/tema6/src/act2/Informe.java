package act2;

public class Informe implements Imprimible {

	public enum Tipo {
		VENTAS, FINANCIERO, TECNICO, AUDITORIA
	}

	public enum Periodo {
		MENSUAL, ANUAL
	}

	public enum Estado {
		BORRADOR, FINALIZADO, PUBLICADO
	}

	// Attributes

	private int id;
	private String titulo;
	private String autor;
	private String contenido;
	private Tipo tipoInforme;
	private Periodo periodoInforme;
	private Estado informeEstado;

	// Constructor

	public Informe(int id, String titulo, String autor, String contenido, Tipo tipoInforme, Periodo periodoInforme,
			Estado informeEstado) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.contenido = contenido;
		this.tipoInforme = tipoInforme;
		this.periodoInforme = periodoInforme;
		this.informeEstado = informeEstado;
	}

	// Methods
	
	@Override
	public String toString() {
		return 
				"Id Informe: " + id +
				"Titulo Informe: " + titulo +
				"Autor del Informe: " + autor +
				"Contenido del Informe: " + contenido +
				"Tipo de Informe: " + tipoInforme + 
				"Periodo Informe: " + periodoInforme +
				"Estado del Informe: " + informeEstado
				;
	}

}
