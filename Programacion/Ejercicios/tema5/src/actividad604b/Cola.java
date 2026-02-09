package actividad604b;

import java.util.ArrayList;
import java.util.List;

public class Cola<T> {

	private List<T> cola;

	public Cola() {
		cola = new ArrayList<>();
	}

	public void introducirElemento(T elemento) {
		cola.add(elemento);
	}

	public void eliminarElemento() {
		if (cola.isEmpty()) {
			System.out.println("La cola esta vacia");
		} else
			cola.remove(0);
	}

}
