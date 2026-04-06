package tema6act3;

public class Main {

	public static void main(String[] args) {
		Suma suma = new Suma();
		Resta resta = new Resta();
		Multiplicacion mult = new Multiplicacion();
		Division div = new Division();
		
		// Main Program
		
		System.out.println(suma.calcular(3, 2));
		System.out.println(resta.calcular(5, 2));
		System.out.println(mult.calcular(2, 2));
		System.out.println(div.calcular(4, 2));

	}

}
