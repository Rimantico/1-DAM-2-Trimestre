
package tema6act3;

public class Division implements Operacion{
	
	public Division() {
		
	}
	
	@Override
	public double calcular(double a, double b) {
		double dividir = a /b;
		return dividir;
	}

}
