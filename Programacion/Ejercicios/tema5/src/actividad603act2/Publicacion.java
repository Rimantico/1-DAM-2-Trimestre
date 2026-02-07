package actividad603act2;

public class Publicacion {
	
	
	// Attributes
	protected String titulo;
	protected String autor;
	protected int anoPublicacion;
	
	// Constructor
	
	public Publicacion(String titulo , String autor , int anoPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacion = anoPublicacion;
	}
	
	// Getters

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnoPublicacion() {
		return anoPublicacion;
	}
	

}
