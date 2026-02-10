package actividad605a;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListaEntero {
	Random r = new Random();

	private List<Integer> lista;
	
	public ListaEntero() {
		lista = new ArrayList<>();
	}
	
	public void generaCadena() {
		if(lista == null) {
			System.out.println("La cadena es nula");
		}else
			if(lista.isEmpty()) {
				System.out.println("()");
			}else
				for(Integer l : lista) {
					System.out.println(l);
				}
	}
	
	public void generaAleatorios() {
		int rangoLista = r.nextInt(30)+1;
		for(int i = 0 ; i<rangoLista ; i++) {
			int numero = r.nextInt(30)+1;
			lista.add(numero); 
		}
	}
}
