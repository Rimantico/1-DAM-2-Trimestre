package actividad603act2;

public class Revista extends Publicacion{
	
	// Attributes
	
	// Constructor
	
	public Revista(String titulo , String autor, int anoPublicacion) {
		super(titulo, autor, anoPublicacion);
	}
	
	// Methods
	
	@Override
	public String toString() {
		return "Titulo: " + titulo + "\n" + "Autor: " + autor + "\n" + "Año Publicacion: " + anoPublicacion;
	}

}
