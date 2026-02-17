package examenTema4b;

public class Electrico extends Cohete {

	// Clase hecha por: Juan Gómez Ruiz

	// Constantes

	public static final int DISTANCIALUNA = 384400;
	public static final int VELOCIDADCOHETE = 28000;
	public static final int GASTOCOMBUSTIBLESEGUNDO = 1;

	// En el caso del electrico no nos hará falta hacer ningun atributo mas debido a
	// que sabemos que el gasto por segundo es 1 y para calcular el gasto de viaje
	// por segundo a cualquier sitio del espacio siempre sabremos que es 1

	// En el caso de químico al ser un rango si deberemos de especificar su consumo
	// aporximado para que nos muestre todo bien y el consumo

	public Electrico(String nombre, String codigo, TipoCombustible combustible, TipoEncendido encendido,
			boolean motorEncendido) {
		super(nombre, codigo, combustible, encendido, motorEncendido);
	}
	
	// Getters y Setters
	public static int getDistancialuna() {
		return DISTANCIALUNA;
	}

	public static int getVelocidadcohete() {
		return VELOCIDADCOHETE;
	}

	public static int getGastocombustiblesegundo() {
		return GASTOCOMBUSTIBLESEGUNDO;
	}

	// Methods

	// Con este metodo calcularemos el tiempo que hay de aqui a la Luna con una
	// velocidad constante, esta velocidad no varia en ningun momento del programa
	// En caso de que este no introduzca el gasto de Combustible por segundo bien,
	// la cantidad de combustible total no la podremos saber

	public void calcularTiempoLuna() {

		int tiempoRecorrer = DISTANCIALUNA / VELOCIDADCOHETE;

		System.out.println("El tiempo que se necesita para llegar a la luna es de " + tiempoRecorrer + " horas");

		int combustibleGastadoTotal = (3600 * tiempoRecorrer);
		if (combustibleGastadoTotal == 0) {
			System.out.println("Al no introducir bien el gasto de combustible por segundo no sabemos en consumo total");
		} else
			System.out.println("El combustible en total gastado por el cohete es de " + combustibleGastadoTotal
					+ " kg de combustible");
	}

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
