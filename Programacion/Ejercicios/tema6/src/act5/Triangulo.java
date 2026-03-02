package act5;

public class Triangulo implements Figura{
	
	private double base;
	private double altura;
	private double lado3;
	
	public Triangulo(double base, double altura, double lado3) {
		this.base = base;
		this.altura = altura;
		this.lado3 = lado3;
	}
	
	public double calcularPerimetro() {
		double perimetro = base+altura+lado3;
		return perimetro;
	}
	
	public double calcularArea() {
		double area = (base*altura)/2;
		return area;
	}

	@Override
	public String toString() {
		return "TRIANGULO"+"\n"+"Perimetro del Triangulo: " + calcularPerimetro() +"\n"+ "Area del Triangulo: " + calcularArea();
	}
}
