package examenTema4b;

public class Quimico extends Cohete {

	// Clase hecha por: Juan Gómez Ruiz

	// Constantes

	public static final int DISTANCIALUNA = 384400;
	public static final int VELOCIDADCOHETE = 28000;

	// Attributes

	private int gastoCombustibleSegundo;

	public Quimico(String nombre, String codigo, TipoCombustible combustible, TipoEncendido encendido,
			boolean motorEncendido, int gastoCombustibleSegundo) {
		super(nombre, codigo, combustible, encendido, motorEncendido);
		if (gastoCombustibleSegundo > 15000 || gastoCombustibleSegundo < 2000) {
			System.out.println("Este cohete necesita reparación");
		} else
			this.gastoCombustibleSegundo = gastoCombustibleSegundo;
	}
	

	// Getters y Setters
	public int getGastoCombustibleSegundo() {
		return gastoCombustibleSegundo;
	}


	public void setGastoCombustibleSegundo(int gastoCombustibleSegundo) {
		this.gastoCombustibleSegundo = gastoCombustibleSegundo;
	}


	public static int getDistancialuna() {
		return DISTANCIALUNA;
	}


	public static int getVelocidadcohete() {
		return VELOCIDADCOHETE;
	}

	// Methods

		// Con este metodo calcularemos el tiempo que hay de aqui a la Luna con una
		// velocidad constante, esta velocidad no varia en ningun momento del programa
		// En caso de que este no introduzca el gasto de Combustible por segundo bien,
		// la cantidad de combustible total no la podremos saber


	public void calcularTiempoLuna() {

		int tiempoRecorrer = DISTANCIALUNA / VELOCIDADCOHETE;

		System.out.println("El tiempo que se necesita para llegar a la luna es de " + tiempoRecorrer + " horas");

		int combustibleGastadoTotal = (3600 * tiempoRecorrer) * gastoCombustibleSegundo;
		if (combustibleGastadoTotal == 0) {
			System.out.println("Al no introducir bien el gasto de combustible por segundo no sabemos en consumo total");
		} else
			System.out.println("El combustible en total gastado por el cohete es de " + combustibleGastadoTotal
					+ " kg de combustible");
	}
	
	// Para cambiar en general un poco los métodos antes creados

	@Override
	public void encenderMotor() {
		setMotorEncendido(true);
		System.out.println("El motor eléctrico ha sido encendido");
	}

	@Override
	public void apagarMotor() {
		setMotorEncendido(false);
		System.out.println("El motor eléctrico ha sido apagado");
	}

}
