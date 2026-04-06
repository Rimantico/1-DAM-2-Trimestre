package tema6act3;

public class Resta implements Operacion{
	
	public Resta() {
		
	}
	
	@Override
	public double calcular(double a, double b) {
		double resta = a-b;
		return resta;
	}

}
