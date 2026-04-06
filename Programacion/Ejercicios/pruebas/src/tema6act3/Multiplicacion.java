package tema6act3;

public class Multiplicacion implements Operacion{

	
	public Multiplicacion() {
		
	}
	
	@Override
	public double calcular(double a, double b) {
		double multiplicar = a*b;
		return multiplicar;
	}
	

}
