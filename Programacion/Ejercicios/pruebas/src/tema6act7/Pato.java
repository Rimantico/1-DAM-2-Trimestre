package tema6act7;

public class Pato implements Volador, Nadador{

	private String nombre;
	
	public Pato(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public void nadar() {
		System.out.println(nombre + " Al ser un pato puede nadar");
	}
	
	@Override
	public void volar() {
		System.out.println(nombre + " Al ser un pato puede volar");	
	}
}
