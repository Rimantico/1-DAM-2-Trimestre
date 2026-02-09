package actividad603b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import actividad603a.Libro;

public class GestionaPublicacionesApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Variables
		int opcion;
		List<Libro> libros = new ArrayList<>();
		List<Revista> revistas = new ArrayList<>();

		do {
			System.out.println("GESTIÓN DE PUBLICACIONES");
			System.out.println("-------------------------");
			System.out.println("(1) Agregar publicación");
			System.out.println("(2) Mostrar todas las publicaciones");
			System.out.println("(3) Buscar publicación por título");
			System.out.println("(4) Buscar publicación por año de publicación");
			System.out.println("(0) Salir de la aplicación");
			System.out.print("Introduzca una opcion (0-4): ");
			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 0:
				System.out.println("Saliendo de la aplicación...");
				break;
			case 1:
				System.out.println("AGREGAR PUBLICACIÓN");
				System.out.println("--------------------");
				System.out.print("¿Qué tipo de publicación quiere crear, libro o revista? (l/r): ");
				String eleccion = sc.nextLine().toLowerCase();
				if (eleccion.equals("r")) {
					libros.add(agregarLibro(sc));
				} else if (eleccion.equals("l")) {
					revistas.add(agregarRevista(sc));
				} else
					System.out.println("Por favor introduzca una letra válida");
				break;
			case 2:
				mostrarPublicacion(libros,revistas);
				break;
			case 3:
				buscarTitulo(sc,libros,revistas);
				break;
			case 4:
				buscarAnoPublicacion(libros, sc , revistas);
				break;
			}
		} while (opcion != 0);

		sc.close();
	}

	public static Libro agregarLibro(Scanner sc) {
		System.out.print("Introduzca el título del libro: ");
		String tituloLibro = sc.nextLine();
		System.out.print("Introduzca el nombre del autor del libro: ");
		String nombreAutor = sc.nextLine();
		System.out.print("Introduzca el año de publicación del libro: ");
		int anoPublicacion = Integer.parseInt(sc.nextLine());
		Libro libro = new Libro(tituloLibro, nombreAutor, anoPublicacion);
		return libro;
	}

	public static Revista agregarRevista(Scanner sc) {
		System.out.print("Introduzca el título de la revista: ");
		String tituloRevista = sc.nextLine();
		System.out.print("Introduzca el número de la revista: ");
		int numeroRevista = Integer.parseInt(sc.nextLine());
		System.out.print("Introduzca el año de publicación de la revista: ");
		int anoPublicacion = Integer.parseInt(sc.nextLine());
		Revista revista = new Revista(tituloRevista, anoPublicacion, numeroRevista);
		return revista;
	}
	public static void mostrarPublicacion(List<Libro> libros, List<Revista> revistas) {
		System.out.println("MOSTRAR PUBLICACIONES");
		System.out.println("----------------------");
		for(Libro l : libros) {
			System.out.println(l);
		}
		for(Revista r : revistas) {
			System.out.println(r);
		}
	}
	public static void buscarTitulo(Scanner sc, List<Libro> biblioteca, List<Revista> revistas) {
		int contador = 0;
		boolean encontrado = false;
		System.out.println("BUSCAR PUBLICACIÓN POR TÍTULO");
		System.out.println("------------------------");
		System.out.print("Introduzca el texto de búsqueda (Es sensible a mayusculas):  ");
		String buscarLibro = sc.nextLine();
		for (Libro l : biblioteca) {
			if (l.getTitulo().contains(buscarLibro)) {
				encontrado = true;
				System.out.println(l);
				contador++;
			}
		}
		for (Revista r : revistas) {
			if (r.getTitulo().contains(buscarLibro)) {
				encontrado = true;
				System.out.println(r);
				contador++;
			}
		}
		if (encontrado == true) {
			System.out.println("Se encontraron " + contador + " coincidencias");
		} else
			System.out.println("No se encontraron ninguna coincidencia");
	}
	public static void buscarAnoPublicacion(List<Libro> biblioteca, Scanner sc , List<Revista> revista) {
		int contador = 0;
		boolean encontrado = false;
		System.out.println("BUSCAR PUBLICACIÓN POR AÑO DE PUBLICACIÓN");
		System.out.println("-----------------------------------------");
		System.out.print("Introduzca el año de publicación a buscar: ");
		int buscarAno = Integer.parseInt(sc.nextLine());
		for (Libro l : biblioteca) {
			if (l.getAnoPublicacion() == buscarAno) {
				encontrado = true;
				System.out.println(l);
				contador++;
			}
		}
		for (Revista r : revista) {
			if (r.getAnoPublicacion() == buscarAno) {
				encontrado = true;
				System.out.println(r);
				contador++;
			}
		
		}
		if (encontrado == true) {
			System.out.println("Se encontraron " + contador + " coincidencias");
		} else
			System.out.println("No se encontraro ninguna coincidencia");
	}
}
