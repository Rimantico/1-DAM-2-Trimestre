package tema6act5;

public class Triangulo implements Figura {
	
	private double base;
	private double altura;
	private double lado3;
	
	
	public Triangulo(double base , double altura, double lado3) {
		this.base = base;
		this.altura = altura;
		this.lado3 = lado3;
	}
	
	@Override
	public double calcularArea() {
		double calculo = (base * altura) /2;
		return calculo;
	}
	
	@Override
	public double calcularPerimetro() {
		double calculo = base + altura + lado3;
		return calculo;
	}

}
