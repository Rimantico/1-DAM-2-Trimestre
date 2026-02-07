package actividad603;

public class Libro {
	
	
	// Attributes
	
	protected String titulo;
	protected String autor;
	protected int anoPublicacion;
	
	// Constructor
	
	public Libro(String titulo , String autor , int anoPublicacion) {
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
	
	
	// Methods
	
	@Override
	public String toString() {
		return "Titulo: " + titulo + "\n" + "Autor: " + autor + "\n" + "Año de Publicacion: " + anoPublicacion + "\n" + "---------";
		
	}
	
	
}
