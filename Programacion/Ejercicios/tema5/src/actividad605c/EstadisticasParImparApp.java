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
		for (int l : estadistica) {
			System.out.print(l + ",");
			if (l % 2 == 0) {
				par.add(l);
			} else
				impar.add(l);

		}
		System.out.println(")");

		// Mostrar Lista Pares
		System.out.print("La lista de los pares es: ( ");
		for (int l : par) {
			System.out.print(l + ",");
		}
		System.out.println(")");

		// Mostrar Lista Impares
		System.out.print("La lista de los impares es: ( ");
		for (int l : impar) {
			System.out.print(l + ",");
		}
		System.out.println(")");
		
		// Mostrar la suma de los pares
		int sumaPar = 0;
		for(int l : par)
			sumaPar += l;
		
		System.out.println("La suma de los pares es: " + sumaPar);
		
		// Mostrar media de los valores pares
		double mediaPar = 0;
		mediaPar = sumaPar/par.size();
		
		System.out.println("La media de los valores pares es: " + mediaPar);
		
		// Mostrar el Máximo y el Mínimo de los numeros pares
		
		int maximoPar = Integer.MIN_VALUE;
		int minimoPar = Integer.MAX_VALUE;
		
		for(int l : par) {
			if(l > maximoPar) {
				maximoPar = l;
			}
			if(l< minimoPar) {
				minimoPar = l;
			}
		}
		System.out.println("El numero máximo de los pares es: " + maximoPar);
		System.out.println("El numero mínino de los pares es: " + minimoPar);
		
		// Mostrar la suma de los impares
		
		int sumaImpar = 0;
		for(int l : impar)
			sumaImpar += l;
		System.out.println(" La suma de los elementos de la lista impar es de " + sumaImpar);
		
		// Mostrar la media de los impares
		
		double mediaImpar;
		
		mediaImpar = sumaImpar / impar.size();	
		
		System.out.println("La media de los números impares es de " + mediaImpar);
		
		// Mostrar el Máximo y el Mínimo
		
		int maximoImpar = Integer.MIN_VALUE;
		int minimoImpar = Integer.MAX_VALUE;
		
		for(int l : impar) {
			if(l> maximoImpar) 
				maximoImpar = l;
			if(l< minimoImpar) {
				minimoImpar = l;
			}	
		}
		System.out.println("El número máximo de los impares es: "+ maximoImpar);
		System.out.println("El número mínimo de los impares es: " + minimoImpar);
	}

}
