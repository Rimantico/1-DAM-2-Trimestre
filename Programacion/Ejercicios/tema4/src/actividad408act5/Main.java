package actividad408act5;

import java.time.LocalTime;
import java.time.Duration;
import java.util.Scanner;

public class Main {

	public static final int SALARIOBASE = 100;
	public static final int HORAEXTRA = 15;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcion;
		int vecesEntrada = 0;
		int vecesSalida = 0;
		int contador = 0;

		// Para separar las horas
		int horaEntrada1;
		int minutoEntrada1;
		int horaSalida1;
		int minutoSalida1;
		int horaEntrada2;
		int minutoEntrada2;
		int horaSalida2;
		int minutoSalida2;

		// Variables Time

		LocalTime entrada1 = null;
		LocalTime entrada2 = null;
		LocalTime salida1 = null;
		LocalTime salida2 = null;

		// Variables duracion

		Duration turno1;
		Duration turno2;
		long horasTurno1 = 0;
		long minutosTurno1 = 0 ;
		long horasTurno2 = 0;
		long minutosTurno2 = 0;

		do {
			System.out.println("Programa de registro de entrada/salida");
			System.out.println("1. Entrada\n2. Salida");
			System.out.println("Introduzca una opción:");
			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 1:
				vecesEntrada++;
				if (vecesEntrada > 2) {
					System.out.println("Ya has entrado 2 veces al trabajo hoy");
				} else if (vecesEntrada == 1) {
					System.out.println("Turno de mañana");
					horaEntrada1 = hora(sc);
					minutoEntrada1 = minuto(sc);
					entrada1 = tiempo(horaEntrada1, minutoEntrada1);
				} else {
					System.out.println("Turno de tarde");
					horaEntrada2 = hora(sc);
					minutoEntrada2 = minuto(sc);
					entrada2 = tiempo(horaEntrada2, minutoEntrada2);
				}
				break;
			case 2:
				vecesSalida++;
				if (vecesSalida > 2) {
					System.out.println("No puedes salir mas de dos veces del trabajo");
				} else if (vecesSalida == 1) {
					System.out.println("Turno de mañana");
					horaSalida1 = hora(sc);
					minutoSalida1 = minuto(sc);
					salida1 = tiempo(horaSalida1, minutoSalida1);
				} else {
					System.out.println("Turno de tarde");
					horaSalida2 = hora(sc);
					minutoSalida2 = minuto(sc);
					salida2 = tiempo(horaSalida2, minutoSalida2);
				}
				break;
			}
		} while (vecesEntrada < 2 || vecesSalida < 2);

		sc.close();

		// Comprobación de las horas realizadas

		System.out.println("Turno de mañana");
		if(salida1.isAfter(entrada1)) {
			turno1 = Duration.between(entrada1, salida1);			
			 horasTurno1 = turno1.toHours();
			 minutosTurno1 = turno1.toMinutes() % 60;
		}
		else
			System.out.println("No puedes introducir a a");

		

		System.out.println("Ha echado un total de " + horasTurno1 + "horas  y " + minutosTurno1 + " minutos");

		System.out.println("Turno de tarde");

		turno2 = Duration.between(entrada2, salida2);

		 horasTurno2 = turno2.toHours();
		 minutosTurno2 = turno2.toMinutes() % 60;

		System.out.println("Ha echado un total de " + horasTurno2 + "horas y " + minutosTurno2 + " minutos");

		// Suma de las horas

		long totalHoras = horasTurno1 + horasTurno2;
		long totalMinutos = minutosTurno1 + minutosTurno2;

		// Comprobacion y suma de dinero

		int salarioPercibir;

		if (totalMinutos >= 60) {
			totalHoras++;
			totalMinutos = totalMinutos - 60;
		}

		if (totalHoras == 5) {
			System.out.println("Horas semanales completadas");
			salarioPercibir = SALARIOBASE;
		} else {
			salarioPercibir = SALARIOBASE;
			System.out.println("No has cumplido las horas establecidas se te restará dinero de tu salario semanal");
			for (long i = totalHoras; i <= 5; i++)
				contador++;
			salarioPercibir = salarioPercibir - (contador * HORAEXTRA);

		}

		if (totalHoras > 5) {
			long horasExtra = totalHoras - 5;
			System.out.println("Percibe una paga extra");
			for (long i = totalHoras; i <= horasExtra; i++)
				contador++;
			salarioPercibir = salarioPercibir + (contador * HORAEXTRA);
		}

	}

	public static int minuto(Scanner sc) {
		System.out.println("Introduce los minutos");
		int minuto = Integer.parseInt(sc.nextLine());
		return minuto;
	}

	public static int hora(Scanner sc) {
		System.out.println("Introduce la hora");
		int hora = Integer.parseInt(sc.nextLine());
		return hora;
	}

	public static LocalTime tiempo(int hora, int minutos) {
		LocalTime tiempo = LocalTime.of(hora, minutos);
		return tiempo;

	}

}
