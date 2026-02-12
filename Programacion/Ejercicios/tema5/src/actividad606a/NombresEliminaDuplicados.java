package actividad606a;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NombresEliminaDuplicados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> nombres = new HashSet<>();
		String introducirNombre;
		
		// Main Program
		
		System.out.println("NOMBRES DUPLICADOS I");
		do {
			System.out.print("Introduzca un nombre (vacío para terminar): ");
			introducirNombre = sc.nextLine();
			if(introducirNombre.isEmpty()){
				break;
			}else
				nombres.add(introducirNombre);
		}while(!introducirNombre.isEmpty());
		
		
		System.out.println("Los nombres introducidos sin duplicados son: ");
		for(String c : nombres) {
			System.out.println(c);
		}
		
		
		sc.close();
	}

}
