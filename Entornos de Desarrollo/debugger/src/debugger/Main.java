package debugger;

import java.util.ArrayList;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();

		numeros.add(10);

		numeros.add(20);

		numeros.add(30);

		double resultado = calcularPromedio(numeros);

		System.out.println("Promedio: " + resultado);

		}

		public static double calcularPromedio(List<Integer> numeros) {

		int suma = 0;

		// ERROR 1: condición incorrecta del for

		for (int i = 0; i < numeros.size(); i++) {

		suma = suma + numeros.get(i);

		}

		// ERROR 2: división entera (pierde decimales)

		double promedio = suma / numeros.size();

		return promedio;

		}
}


