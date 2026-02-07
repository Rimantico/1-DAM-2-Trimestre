package actividad603act2;

public class Libro  extends Publicacion{
	
	// Attributes
	
	// Constructor
	
	public Libro(String titulo , String autor, int anoPublicacion) {
		super(titulo, autor, anoPublicacion);
	}
	
	// Methods
	
	@Override
	public String toString() {
		return "Titulo: " + titulo + "\n" + "Autor: " + autor + "\n" + "Año Publicacion: " + anoPublicacion;
	}

}
