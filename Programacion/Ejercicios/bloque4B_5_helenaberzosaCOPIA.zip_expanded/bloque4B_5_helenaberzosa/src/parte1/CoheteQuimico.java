package parte1;

public class CoheteQuimico extends CoheteEspacial {

	// ATRIBUTO
	private static int gastoKg = 7500;

	// CONSTRUCTOR
	public CoheteQuimico(String nombre, String codigo, String tipoCombustible, String tipoEncendido) {
		super(nombre, codigo, tipoCombustible, tipoEncendido);
	}

	// MÉTODOS GETTERS & SETTERS
	public static int getGastoKg() {
		return gastoKg;
	}

	public static void setGastoKg(int gastoKg) {
		CoheteQuimico.gastoKg = gastoKg;
	}

	// MÉTODOS
	@Override
	public void visualizarDatos() {
		System.out.println("Nombre: " + nombre + " - Código: " + codigo + " - Tipo de combustible: " + tipoCombustible
				+ " - Tipo de encendido: " + tipoEncendido + ".");
	}

	@Override
	public void encenderMotor() {
		System.out.println("El motor se ha encendido.");
	}

	@Override
	public void apagarMotor() {
		System.out.println("El motor se ha apagado.");
	}
}
