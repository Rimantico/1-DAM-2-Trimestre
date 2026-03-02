package act3;

public class Main {

	public static void main(String[] args) {
		Suma suma = new Suma(5.5,4.5);
		Resta resta = new Resta(4.5,3.2);
		Multiplicacion multiplicacion = new Multiplicacion(6.7,3.2);
		Division division = new Division(5.4,2.2);
		
		suma.imprimirResultado();
		resta.imprimirResultado();
		multiplicacion.imprimirResultado();
		division.imprimirResultado();

	}

}
