package tema6act5;

public class Rectangulo implements Figura{
	
	private double base;
	private double altura;
	
	public Rectangulo(double base , double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		double calculo = base * altura;
		return calculo;
	}
	
	@Override
	public double calcularPerimetro() {
		double calculo = (base * 2) + (altura *2);
		return calculo;
	}

}
