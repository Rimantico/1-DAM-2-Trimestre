package actividad605g;

import java.util.Scanner;

public class GestionaAlumnosApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("MENÚ PRINCIPAL");
			System.out.println("--------------");
			System.out.println("1.- Añadir alumno");
			System.out.println("2.- Listar alumnos existentes");
			System.out.println("3.- Eliminar alumno");
			System.out.println("0.- Salir de la aplicación");
			System.out.println("Elija una opción (0-3):");
			opcion = Integer.parseInt(sc.nextLine());
			
			switch(opcion) {
			default:
				System.out.println("Opción elegida incorrecta. Las opciones válidas son entre 0 y 3");
			case 0:
				System.out.println("Saliendo de la aplicación");
			case 1:
				System.out.println("AÑADIR ALUMNO");
				System.out.println("--------------");
			}

		} while (opcion != 0);

		sc.close();
	}
	

}
