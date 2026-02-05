package actividad408act8;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alimento;

		System.out.println("¿Cual es su alimento?");
		do {

			System.out.println(
					"1. Fruta\n2. Lácteos envasados\n3. Verduras\n4. Lácteos no refrigerados\n5. Otros\n6. Salir del programa");
			alimento = Integer.parseInt(sc.nextLine());
			System.out.println("Dime el dia que quieres comprobar (dd/MM/yyyy)");
			String introducirFecha = sc.nextLine();

			DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate fecha = LocalDate.parse(introducirFecha, formateador);
			LocalDate caducidad = null;

			switch (alimento) {
			case 1:
				caducidad = fecha.plusDays(7);
				System.out.println("La fruta caduca en esta fecha: " + caducidad + " (7 Dias)");
				break;
			case 2:
				caducidad = fecha.plusDays(21);
				System.out.println("Los lacteos envasados caducan en esta fecha: " + caducidad + " (21 dias)");
				break;
			case 3:
				caducidad = fecha.plusDays(10);
				System.out.println("Las verduras caducan en esta fecha: " + caducidad + ("(10 Dias)"));
				break;
			case 4:
				caducidad = fecha.plusDays(1);
				System.out.println("Los lacteos no refrigerados caducan en esta fecha: " + caducidad + "(1 Día)");
				break;
			case 5:
				caducidad = fecha.plusMonths(6);
				System.out.println("El resto de alimentos caducan en esta fecha: " + caducidad + "(6 Meses)");
				break;
			case 6:
				System.out.println("Saliendo del programa...");
			default:
				System.out.println("Por favor introduzca un valor correcto");
			}
		} while (alimento != 6);
		sc.close();
	}

}
