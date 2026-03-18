package refactorizacion;

public class Trabajador {
	private float nom;
	private int hExt;
	TipoTrabajador trab;

	public Trabajador(float nomina, int horasExtras, TipoTrabajador trab) {
		this.nom = nomina;
		this.hExt = horasExtras;
		this.trab = trab;
	}

	public float getNom() {
		return nom;
	}

	public int masTrab() {
		return hExt;
	}

	public TipoTrabajador trab() {
		return trab;
	}
}
