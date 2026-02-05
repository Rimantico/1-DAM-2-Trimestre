package actividad408act7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edad;
		System.out.println("¿Que tipo de contrato te puedo hacer con tu edad?");
		edad = Integer.parseInt(sc.nextLine());
		if(edad >= 67 || edad< 16) {
			System.out.println("Usted no puede trabajar en nuestra empresa");
		}else
			if(edad >= 55 && edad < 67) {
				System.out.println("Usted es senior y fijo");
			}else
				if(edad <= 54 && edad >= 26) {
					System.out.println("Usted es fijo");
				}else
					if(edad <= 25 && edad >= 18) {
						System.out.println("Usted opta por un contrato en prácticas");
					}else
						System.out.println("Podemos hacerle un contrato por horas");
		
		
		sc.close();
	}

}
