package actividad408act2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		EstadoTarea tarea = EstadoTarea.PENDIENTE;
		
		System.out.println("¿En que estado esta la tarea?");
		System.out.println("1. Pendiente\n2. En Proceso\n3. Completada");
		System.out.println("Eliga una opcion:");
		opcion = Integer.parseInt(sc.nextLine());
		if(opcion != 3){
			do {
				System.out.println("Actualmente la tarea tiene este estado: " + tarea);
				System.out.println("¿En que estado se encuentra ahora?");
				System.out.println("1. Pendiente\n2. En Proceso\n3. Completada");
				System.out.println("Eliga una opcion:");
				opcion = Integer.parseInt(sc.nextLine());
				switch(opcion) {
				case 1:
					System.out.println("La tarea sigue pendiente");
					tarea = EstadoTarea.PENDIENTE;
					break;
				case 2:
					System.out.println("La tarea esta en proceso");
					tarea = EstadoTarea.PENDIENTE;
					break;
				case 3:
					System.out.println("La tarea ha terminado");
					tarea = EstadoTarea.COMPLETADA;
				}
			}while(opcion != 3);
		}else
			System.out.println("La tarea ha terminado");
		
		
		
		
		sc.close();
	}

}
