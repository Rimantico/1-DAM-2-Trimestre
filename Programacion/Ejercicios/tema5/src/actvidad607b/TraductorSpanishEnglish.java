package actvidad607b;

import java.util.Scanner;

public class TraductorSpanishEnglish {

	public static void main(String[] args) {
		
		// Variables and objects
		Scanner sc = new Scanner(System.in);
		DiccionarioSpanishEnglish diccionario = new DiccionarioSpanishEnglish();
		String palabra;
		
		// Main Program
		
		System.out.println("TRADUCCIÓN ESPAÑOL - ÍNGLES");
		do {
			
			System.out.print("Introduzca una palabra a traducir al inglés (vacío para terminar): ");
			palabra = sc.nextLine().toLowerCase();
			if(palabra.isEmpty() || palabra.isBlank()) {
				System.out.println("No has introducido nada. Saliendo del programa");
			}else
				diccionario.traducir(palabra);
		}while(!palabra.isEmpty() && !palabra.isBlank());
		
		
	
	
		
		sc.close();
	}

}
