package act3;

public class Division implements Operacion{
	
	private double a;
	private double b;
	
	public Division(double a , double b) {
		this.a = a;
		this.b = b;
	}
	
	public double calcular(double a , double b) {
		double dividir = a/b;
		return dividir;
	}
	
	public void imprimirResultado() {
		System.out.println("El resultado de la division es: " + calcular(a, b));
	}

}
