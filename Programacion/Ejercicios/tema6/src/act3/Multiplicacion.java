package act3;

public class Multiplicacion implements Operacion{
	
	private double a;
	private double b;
	
	public Multiplicacion(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public double calcular(double a , double b) {
		double multiplicar = a*b;
		return multiplicar;
	}

	
	public void imprimirResultado() {
		System.out.println("El resultado de la multiplicación es: " + calcular(a, b));
	}
}
