package actividadExamen;

public class Jugador {
	private String nombre;
	private int nivel;
	private double oro;
	
	public Jugador(String nombre, int nivel, double oro) {
		this.nombre = nombre;
		validarNivel(nivel);
		this.nivel = nivel;
		this.oro = oro;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public double getOro() {
		return oro;
	}

	public void setOro(double oro) {
		this.oro = oro;
	}

	public void validarNivel(int nivel) {
		if(nivel<0) {
			throw new IllegalArgumentException("Has introducido un nivel erroneo, debe ser mayor o igual a 0");
		}
	}
	
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + "\n" +
				"Nivel: " + nivel + "\n" +
				"Oro: " + oro + "\n";
	}
	
}
