package actividad408act6;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Variables

		int opcion;
		String dia;
		int numDias = 0;
		LocalTime horaEntrada = null;
		String entrada;
		String salida;
		LocalTime horaSalida = null;

		// Programa hecho por Juan Gómez Ruiz
		System.out.println("Aplicación de Parking");

		System.out.println("Menu");
		do {
			System.out.println(
					"1. Introducir hora de entrada a Parking\n2. Inroducir hora salida del parking\n3. Total a pagar \n4. Salir");
			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 1:
				System.out.println("Por favor introduzca la hora de entrada a el parking.Formato:(xx:xx)");
				entrada = sc.nextLine();
				horaEntrada = LocalTime.parse(entrada);
				break;
			case 2:
				System.out.println("Ha estado su coche mas de un día en el parking?(S o N para contestar)");
				dia = sc.nextLine().toUpperCase();
				if (dia.equals("S")) {
					System.out.println("¿Cuantos dias se ha quedado?");
					numDias = Integer.parseInt(sc.nextLine());
					System.out.println("Por favor introduzca la hora de salida del parking.Formato:(xx:xx)");
					salida = sc.nextLine();
					horaSalida = LocalTime.parse(salida);
				} else {
					numDias = 0;
					System.out.println("Por favor introduzca la hora de salida del parking.Formato:(xx:xx)");
					salida = sc.nextLine();
					horaSalida = LocalTime.parse(salida);
				}
				break;
			case 3:
				int minutosEntrada = horaEntrada.getHour() * 60 + horaEntrada.getMinute();
				int minutosSalida = horaSalida.getHour() * 60 + horaSalida.getMinute();
				int totalMinutos = (numDias * 24 * 60) + minutosSalida - minutosEntrada;
				int minutosPorDia = 24 * 60;
				int diasCompletos = totalMinutos / minutosPorDia;
				int restoMinutos = totalMinutos % minutosPorDia;

				double precio = 0.0;

				// 1️ Días completos
				precio += diasCompletos * 18.0;

				// 2️ Resto del tiempo
				if (restoMinutos > 0) {

					int horas = restoMinutos / 60;
					int minutos = restoMinutos % 60;

					precio += horas * 2.5;
					precio += minutos * 0.15;
				}

				// 3️ Precio mínimo
				if (precio < 0.55) {
					precio = 0.55;
				}

				System.out.println("El precio total es de: " + precio);

			}

		} while (opcion != 4);

		sc.close();
	}

}
