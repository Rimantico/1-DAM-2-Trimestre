package act15;

public class Direccion {

	// Attributes

	private String calle;
	private int numero;
	private int codigoPostal;
	private String portal;

	// Constructors

	public Direccion(String calle, int numero, int codigoPostal, String portal) {
		this.calle = calle;
		this.numero = numero;
		this.codigoPostal = codigoPostal;
		this.portal = portal;
	}

	public Direccion(String calle, int numero, int codigoPostal) {
		this.calle = calle;
		this.numero = numero;
		this.codigoPostal = codigoPostal;
	}

}
