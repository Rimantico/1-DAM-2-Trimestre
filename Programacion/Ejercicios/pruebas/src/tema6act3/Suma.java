package tema6act3;

public class Suma implements Operacion{

	
	public Suma(){

	}
	
	@Override
	public double calcular(double a, double b) {
		double suma = a + b;
		return suma;
	}
	

}
