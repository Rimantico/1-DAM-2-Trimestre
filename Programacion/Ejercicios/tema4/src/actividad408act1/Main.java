package actividad408act1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		// Declaracion Scanner
		
		Scanner sc = new Scanner(System.in);
		
		
		String diaIntroducido;
		
		System.out.println("Introduce un día para ver si es laborable o no");
		diaIntroducido = sc.nextLine().toUpperCase();
		
		DiasSemana dia = DiasSemana.valueOf(diaIntroducido);
		
		switch(dia) {
		case SABADO:
		case DOMINGO:
			System.out.println("Es fin de semana");
			break;
		default:
			System.out.println("Es un día laborable");
		}
		sc.close();
	}

}
