package actividad408act4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		RolUsuario rol = null;
		String introducirRol;
		
		do {
			System.out.println("El rol actual es:" + rol);
			System.out.println("Roles Disponibles:");
			System.out.println("Administrador\nUsuario\nInvitado\nSalir");
			System.out.println("Eliga un rol para ver sus características:");
			introducirRol = sc.nextLine().toUpperCase();
			
			switch(introducirRol) {
			case "ADMINISTRADOR":
				System.out.println("El administrador tiene acceso a todo el sistema");
				rol = RolUsuario.ADMIN;
				break;
			case "USUARIO":
				System.out.println("El usuario tienen limitado acceso a las funciones principales");
				rol = RolUsuario.USUARIO;
				break;
			case "INVITADO":
				System.out.println("El invitado solo puede leer");
				rol = RolUsuario.INVITADO;
			case "SALIR":
				System.out.println("Saliendo del programa...");
			}
			
		}while(!introducirRol.equals("SALIR"));
		
		sc.close();
	}

}
