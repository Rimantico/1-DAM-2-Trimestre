package act5;

public class Rectangulo implements Figura{
	
	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double calcularPerimetro(){
		double perimetro = (2*base)+(2*altura);
		return perimetro;
	}
	
	public double calcularArea() {
		double area = base * altura;
		return area;
	}
	
	@Override
	public String toString() {
		return "RECTANGULO\n" + "Perimetro del rectangulo: " + calcularPerimetro() + "\n" + "Area del rectangulo" + calcularArea();
	}

}
