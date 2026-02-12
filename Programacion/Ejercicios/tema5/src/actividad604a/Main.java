package actividad604a;

public class Main {

	public static void main(String[] args) {
		Pila<Integer> pila = new Pila();
		Pila<Double> pila2 = new Pila();
		
		pila.sacarElemento();
		pila.meterElemento(20);
		pila.sacarElemento();
		pila.sacarElemento();
		pila2.meterElemento(25.2);
		pila2.sacarElemento();

	}

}
