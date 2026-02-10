package actividad603a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionaLibrosApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Variables for the program
		int opcion;
		List<Libro> biblioteca = new ArrayList<>();
		
		// Main Program

		do {
			System.out.println("GESTIÓN DE LIBROS\n-----------------");
			System.out.println("1. Añadir Libro");
			System.out.println("2. Mostrar todos los libros");
			System.out.println("3. Buscar libro por título");
			System.out.println("4. Buscar libro por año de publicación");
			System.out.println("0. Salir de la aplicación");
			System.out.print("Introduzca una opción (0-4): ");
			opcion = Integer.parseInt(sc.nextLine());
			System.out.println("");

			switch (opcion) {
			case 0:
				System.out.println("Saliendo del programa...");
				break;
			case 1:
				biblioteca.add(agregarLibro(sc));
				break;
			case 2:
				mostrarLibros(biblioteca);
				break;
			case 3:
				buscarTitulo(sc ,biblioteca);
				break;

			case 4:
				buscarAnoPublicacion(biblioteca, sc);
				break;
			}
		} while (opcion != 0);

		sc.close();
	}
	
	// Methods

	public static Libro agregarLibro(Scanner sc) {
		System.out.println("AGREGAR LIBRO");
		System.out.println("-------------");
		System.out.print("Introduzca el nombre del libro: ");
		String nombreLibro = sc.nextLine().toUpperCase();
		System.out.print("Introduzca el nombre del autor del libro: ");
		String nombreAutor = sc.nextLine();
		System.out.print("Introduzca el año de publicación del libro: ");
		int anoPublicacion = Integer.parseInt(sc.nextLine());

		Libro libro = new Libro(nombreLibro, nombreAutor, anoPublicacion);
		return libro;
	}
	public static void mostrarLibros(List<Libro> biblioteca) {
		System.out.println("MOSTRAR LIBROS");
		System.out.println("--------------");
		for (Libro l : biblioteca) {
			System.out.println(l);
			System.out.println("");
		}
	}
	
	public static void buscarTitulo(Scanner sc, List<Libro> biblioteca) {
		int contador = 0;
		boolean encontrado = false;
		System.out.println("BUSCAR LIBRO POR TÍTULO");
		System.out.println("------------------------");
		System.out.print("Introduzca el texto de búsqueda (Es sensible a mayusculas):  ");
		String buscarLibro = sc.nextLine().toUpperCase();
		for (Libro l : biblioteca) {
			if (l.getTitulo().contains(buscarLibro)) {
				encontrado = true;
				System.out.println(l);
				contador++;
			}
		}
		if (encontrado == true) {
			System.out.println("Se encontraron " + contador + " coincidencias");
		} else
			System.out.println("No se encontraron ninguna coincidencia");
	}
	public static void buscarAnoPublicacion(List<Libro> biblioteca, Scanner sc) {
		int contador = 0;
		boolean encontrado = false;
		System.out.println("BUSCAR LIBRO POR AÑO DE PUBLICACIÓN");
		System.out.println("-------------------------------------");
		System.out.print("Introduzca el año de publicación a buscar: ");
		int buscarAno = Integer.parseInt(sc.nextLine());
		for (Libro l : biblioteca) {
			if (l.getAnoPublicacion() == buscarAno) {
				encontrado = true;
				System.out.println(l);
				contador++;
			}
		}
		if (encontrado == true) {
			System.out.println("Se encontraron " + contador + " coincidencias");
		} else
			System.out.println("No se encontraro ninguna coincidencia");
	}
}
