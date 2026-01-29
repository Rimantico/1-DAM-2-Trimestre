package actividad408act3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Color color = null;
		String elegirColor;

		do {
			System.out.println("El color actual es: " + color);
			System.out.println("Rojo\nVerde\nAzul\nSalir");
			System.out.println("Por favor elija un color");
			elegirColor = sc.nextLine().toUpperCase();
			
			switch(elegirColor) {
			case "ROJO":
				System.out.println("Has elegido el color rojo");
				color = Color.ROJO;
				break;
			case "AZUL":
				System.out.println("Has elegido el color azul");
				color = Color.AZUL;
				break;
			case "VERDE":
				System.out.println("Has elegido el color verde");
				color = Color.VERDE;
				break;
			case "SALIR":
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Por favor introduzca un color válido");
			}

		} while (!elegirColor.equals("SALIR"));

		sc.close();
	}

}
