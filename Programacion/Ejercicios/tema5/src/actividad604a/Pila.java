package actividad604a;

import java.util.ArrayList;
import java.util.List;

public class Pila <T>{
	private List<T> elementos;

	
	public Pila() {
		elementos = new ArrayList<>();
	}
	
	public void meterElemento(T elemento) {
		elementos.add(elemento);
		System.out.println("Has introducido " + elemento);
	}
	
	public void sacarElemento() {
		if(elementos.isEmpty()) {
			System.out.println("La pila esta vacía, no puedes sacar elementos");
		}else {
			int ultimoIndice = elementos.size()-1;
			T elemento = elementos.remove(ultimoIndice);
			System.out.println("El elemento " + elemento + " ha sido borrado");
		}
	}
	
}
