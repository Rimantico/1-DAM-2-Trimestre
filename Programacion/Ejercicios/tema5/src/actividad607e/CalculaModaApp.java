package actividad607e;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;


public class CalculaModaApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int claveMayor = 0;
		int moda = Integer.MIN_VALUE;
		List<Integer> serie = new ArrayList();
		Map<Integer, Integer> contar = new HashMap();
	
		
		// Programa Principal
		
		System.out.println("CALCULO DE MODA");
		System.out.print("Introduzca la cantidad de números de la serie: ");
		int numSerie = Integer.parseInt(sc.nextLine());
		System.out.print("Valor mínimo del intervalo para generar los valores aleatorios: ");
		int numMin = Integer.parseInt(sc.nextLine());
		System.out.print("Valor máximo del intervalo para generar los valores aleatorios: ");
		int numMax = Integer.parseInt(sc.nextLine());
		
		generarSerie(numSerie,numMin,numMax, serie, r);
		
		System.out.print("La serie generada es: [");
		for(int l : serie) {
			System.out.print(l + ", ");
		}
		System.out.println("]");
		
		
		for(Integer numero : serie) {
			contar.put(numero, contar.getOrDefault(numero, 0)+1);
		}
		for(Integer clave : contar.keySet()) {
			int valor =contar.get(clave);
			if(valor > moda) {
				moda = valor;
				claveMayor = clave;
			}
		}
		System.out.println("La moda de la serie es "+ claveMayor + " y aparece " + moda + " veces en la serie");
		sc.close();
	}

	public static void generarSerie(int numSerie, int numMin, int numMax, List<Integer> serie, Random r) {
		for(int i = 0 ; i<numSerie ; i++) {
			int numAleatorio = r.nextInt((numMax - numMin)+ 1) + numMin;
			serie.add(numAleatorio);
		}
		
	}

}
