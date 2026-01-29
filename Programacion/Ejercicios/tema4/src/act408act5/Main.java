package act408act5;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		int vecesEntrada = 0;
		int vecesSalida = 0;
		LocalTime hora = null;
		
		// Para separar las horas
		int horaEntrada1;
		int minutoEntrada1;
		int horaSalida1;
		int minutoSalida1;
		int horaEntrada2;
		int minutoEntrada2;
		int horaSalida2;
		int minutoSalida2;
		
		do {
			System.out.println("Programa de registro de entrada/salida");
			System.out.println("1. Entrada\n2. Salida");
			System.out.println("Introduzca una opción:");
			opcion = Integer.parseInt(sc.nextLine());
			
			switch(opcion) {
			case 1:
				vecesEntrada++;
				if(vecesEntrada > 2) {
					System.out.println("Ya has entrado 2 veces al trabajo hoy");
				}else
					if(vecesEntrada == 1) {
						System.out.println("Turno de mañana");
						horaEntrada1 = hora(sc);
						minutoEntrada1 = minuto(sc);
						tiempo(horaEntrada1,minutoEntrada1);
					}else {
						System.out.println("Turno de tarde");
						horaEntrada2 = hora(sc);
						minutoEntrada2 = minuto(sc);
						tiempo(horaEntrada2,minutoEntrada2);
					}
				break;
			case 2:
				vecesSalida++;
				if(vecesSalida >= 2) {
					System.out.println("No puedes salir mas de dos veces del trabajo");
				}else
					if(vecesSalida == 1) {
						System.out.println("Turno de mañana");
						horaSalida1 = hora(sc);
						minutoSalida1 = minuto(sc);
						tiempo(horaSalida1,minutoSalida1);
					}else {
						System.out.println("Turno de tarde");
						horaSalida2 = hora(sc);
						minutoSalida2 = minuto(sc);
						tiempo(horaSalida2,minutoSalida2);
					}
				break;
			}
		}while(vecesEntrada != 2 || vecesSalida != 2);
		
		sc.close();
	}
	public static int minuto(Scanner sc){
		System.out.println("Introduce los minutos");
		int minuto = Integer.parseInt(sc.nextLine());
		return minuto;
	}
	
	public static int hora(Scanner sc){
		System.out.println("Introduce la hora");
		int hora = Integer.parseInt(sc.nextLine());
		return hora;
	}
	public static LocalTime tiempo(int hora, int minutos) {
		LocalTime tiempo = LocalTime.of(hora, minutos);
		return tiempo;
		
	}

}
