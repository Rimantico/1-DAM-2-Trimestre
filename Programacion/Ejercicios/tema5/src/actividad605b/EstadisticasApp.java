package actividad605b;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class EstadisticasApp {

	public static void main(String[] args) {

		// Listas y variables
		List<Integer> estadistica = new ArrayList<>();
		Random r = new Random();
		int suma = 0;
		double media = 0;
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;
	
		int min = 10;
		int max = 20;
		int rango = r.nextInt(max - min + 1) + min;
		for (int i = 0; i < rango; i++) {
			int numero = r.nextInt(100) + 1;
			estadistica.add(numero);
		}
		// Mostrar Lista
		System.out.println("ESTADÍSTICAS");
		System.out.print("La lista generada es: ( ");
		for (Integer l : estadistica) {
			System.out.print(l + ",");
			if(l > maximo)
				maximo = l;
			if(l< minimo)
				minimo = l;
				
		}
		System.out.println(")");

		// Suma de los elementos
		for (int l : estadistica)
			suma += l;
		System.out.println("La suma de los elementos vale: " + suma);

		// Media de los valores
		media =(double) suma / estadistica.size();
		System.out.println("La media de los valores es: " + media);
		
		// Máximo y mínimo
		System.out.println("El valor mínimo es " + minimo);
		System.out.println("El valor máximo es " + maximo);

	}

}
