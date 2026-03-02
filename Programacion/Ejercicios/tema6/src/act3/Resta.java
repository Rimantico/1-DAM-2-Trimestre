package act3;

public class Resta implements Operacion{
	
	private double a;
	private double b;
	
	public Resta(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	
	public double calcular(double a, double b) {
		double resta = a-b;
		return resta;
	}
	
	public void imprimirResultado() {
		System.out.println("El resultado de la resta es: " + calcular(a, b));
	}

}
