package act3;

public class Suma implements Operacion {

	private double a;
	private double b;

	public Suma(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double calcular(double a, double b) {
		double suma = a + b;
		return suma;

	}

	public void imprimirResultado() {
		System.out.println("El resultado de la suma es: " + calcular(a, b));
	}
}
