package actividad605f;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PruebaMezclasListasApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> lista1 = new ArrayList<>();
		List<String> lista2 = new ArrayList<>();
		String palabra;

		System.out.println("MEZCLA DE LISTAS");
		do {
			System.out.println("Introduce la primera lista de palabras");
			System.out.println("Introduce palabras, una por línea. Línea vacía para terminar");
			palabra = sc.nextLine();
			if (palabra.isEmpty()) {
				break;
			} else
				lista1.add(palabra);
		} while (!palabra.isEmpty());

		do {
			System.out.println("Introduce la segunda lista de palabras");
			System.out.println("Introduce palabras, una por línea. Línea vacía para terminar");
			palabra = sc.nextLine();
			if (palabra.isEmpty()) {
				break;
			} else
				lista2.add(palabra);
		} while (!palabra.isEmpty());

		// Mostrar Primera Lista

		System.out.print("La primera lista es : [");
		for (String l : lista1) {
			System.out.print("\"" + l + "\",");
		}
		System.out.println("]");

		// Mostrar Segunda Lista

		System.out.print("La segunda lista es : [");
		for (String l : lista2) {
			System.out.print("\"" + l + "\",");
		}
		System.out.println("]");

		// Intersección de Listas
		List<String> interseccion = new ArrayList<>();
		for (String palabra1 : lista1) {
			if (lista2.contains(palabra1) && !interseccion.contains(palabra1)) {
				interseccion.add(palabra1);

			}
		}

		System.out.print("La intersección de ambas listas es: [");
		for (String l : interseccion) {
			System.out.print("\"" + l + "\",");
		}
		System.out.println("]");

		sc.close();
		
		// Diferencia entre la primera lista menos la segunda
		List<String> diferencia1 = new ArrayList<>(lista1);
		diferencia1.removeAll(lista2);
		System.out.print("La diferencia de la primera lista menos la segunda es: [");
		for (String l : diferencia1) {
			System.out.print("\"" + l + "\",");
		}
		System.out.println("]");
		
		// Diferencia entre la segunda lista menos la primera
		List<String> diferencia2= new ArrayList<>(lista2);
		diferencia2.removeAll(lista1);
		System.out.print("La diferencia de la segunda lista menos la primera es : [");
		for (String l : diferencia2) {
			System.out.print("\"" + l + "\",");
		}
		System.out.println("]");

	}

}
