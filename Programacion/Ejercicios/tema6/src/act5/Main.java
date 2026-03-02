package act5;

public class Main {

	public static void main(String[] args) {
		Figura[] arrayFiguras = new Figura[4];
		Triangulo triangulo = new Triangulo(4.5,3.5,2.2);
		arrayFiguras[0] = triangulo;
		
		System.out.println(arrayFiguras[0]);

	}

}
