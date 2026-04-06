package tema6act5;

public class Circulo implements Figura {
	
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	@Override
	public double calcularArea() {
		double calculo = (radio * radio) * PI;
		return calculo;
	}
	
	
	@Override
	public double calcularPerimetro() {
		double calculo = (radio * radio) * PI;
		return calculo;
	}

}
