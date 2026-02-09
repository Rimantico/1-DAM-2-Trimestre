package actividad603b;

public class Revista extends Publicacion {

	// Attributes

	private int numero;

	// Constructor

	public Revista(String titulo, int anoPublicacion, int numero) {
		super(titulo, titulo, anoPublicacion);
		this.numero = numero;
	}

	// Methods

	@Override
	public String toString() {
		return "REVISTA" + "\n" + "Titulo: " + titulo + "\n" + "Numero de la revista: " + numero + "\n"
				+ "Año Publicacion: " + anoPublicacion;
	}

}
