package actividad605h;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import actividad605g.Alumno;

public class GestionAlumnosConCalificacionesApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		List<Alumno> alumno = new ArrayList<>();

		do {
			System.out.println("MENÚ PRINCIPAL");
			System.out.println("--------------");
			System.out.println("1.- Añadir alumno");
			System.out.println("2.- Listar alumnos existentes");
			System.out.println("3.- Eliminar alumno");
			System.out.println("4.- ");
			System.out.println("0.- Salir de la aplicación");
			System.out.print("Elija una opción (0-5):");
			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			default:
				System.out.println("Opción elegida incorrecta. Las opciones válidas son entre 0 y 3");
				break;
			case 0:
				System.out.println("Saliendo de la aplicación");
				break;
			case 1:
				alumno.add(introducirAlumno(sc));
				break;
			case 2:
				mostrarAlumnos(alumno);
				break;
			case 3:
				eliminarAlumno(alumno, sc);
				break;
			}

		} while (opcion != 0);

		sc.close();
	}

	public static Alumno introducirAlumno(Scanner sc) {

		System.out.println("AÑADIR ALUMNO");
		System.out.println("---------------");
		System.out.print("Introduzca el DNI del alumno (9 caracteres): ");
		String introducirDNI = sc.nextLine().toUpperCase();
		System.out.print("Introduzca el nombre del alumno (no puede dejarse en blanco): ");
		String introducirNombre = sc.nextLine();
		System.out.print("Introduzca la edad del alumno(Debe de ser mayor o igual a cero): ");
		int introducirEdad = Integer.parseInt(sc.nextLine());

		Alumno alumno = new Alumno(introducirDNI, introducirNombre, introducirEdad);

		return alumno;
	}

	public static void mostrarAlumnos(List<Alumno> alumno) {
		System.out.println("LISTAR ALUMNOS");
		System.out.println("---------------");
		if (alumno.isEmpty()) {
			System.out.println("No hay ningun alumno actualmente");
		} else
			for (Alumno l : alumno)
				System.out.println(l);

	}

	public static void eliminarAlumno(List<Alumno> alumno, Scanner sc) {
		System.out.println("ELIMINAR ALUMNO");
		System.out.println("----------------");
		System.out.print("Introduzca el DNI del alumno a eliminar: ");
		String introducirDNI = sc.nextLine().toUpperCase();
		for (int i = 0; i < alumno.size(); i++) {
			if (alumno.get(i).getDni().equals(introducirDNI)) {
				alumno.remove(i);
				System.out.println("El usuario con el DNI " + introducirDNI + " ha sido eliminado correctamente");
			} else
				System.out.println("El DNI introducido no ha sido encontrado");
		}
	}

}
