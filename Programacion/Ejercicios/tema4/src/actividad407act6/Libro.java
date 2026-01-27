package actividad407act6;

public class Libro extends Publicacion{
	
	public enum Encuadernado{
		TAPABLANDA, TAPADURA
	}
	
	private int numPaginas;
	private Encuadernado encuadernado;
	
	public Libro(String titulo, String autor, int anoPublicacion, int numPaginas, Encuadernado encuadernado) {
		super(titulo,autor,anoPublicacion);
		this.numPaginas = numPaginas;
		this.encuadernado = encuadernado;
	}

}
