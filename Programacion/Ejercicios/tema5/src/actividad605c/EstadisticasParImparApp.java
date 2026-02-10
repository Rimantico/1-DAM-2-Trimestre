package actividad605c;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EstadisticasParImparApp {

	public static void main(String[] args) {
		
		// Listas y variables
		List<Integer> estadistica = new ArrayList<>();
		List<Integer> par = new ArrayList<>();
		List<Integer> impar = new ArrayList<>();
		Random r = new Random();
		
		
	
		int min = 10;
		int max = 20;
		int rango = r.nextInt(max - min + 1) + min;
		for (int i = 0; i < rango; i++) {
			int numero = r.nextInt(100) + 1;
			estadistica.add(numero);
		}
		// Mostrar Lista enteros
		System.out.println("ESTADÍSTICAS II");
		System.out.print("La lista generada es: ( ");
		for (Integer l : estadistica) {
			System.out.print(l + ",");
			if(l % 2 == 0) {
				par.add(l);
			}else
				impar.add(l);
			
		}
		System.out.println(")");


	}

}
