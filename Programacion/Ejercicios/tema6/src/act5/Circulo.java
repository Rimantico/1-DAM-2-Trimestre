package act5;

public class Circulo {
	// Constants
	private final double PI = 3.1416;
	
	private double diametro;
	private double radio = diametro/2;
	
	
	public Circulo(double diametro) {
		this.diametro = diametro;                                         
	}

	
	public double calcularPerimetro() {
		double perimetro = PI * diametro;
		return perimetro;
	}
	
	public double calcularArea() {
		double area = PI *(radio*radio);
		return area;
	}
	
	@Override
	public String toString() {
		return "CIRCULO\n" + "Perimetro del circulo: " + calcularPerimetro() + "\nArea del circulo: " + calcularArea();
	}
}
