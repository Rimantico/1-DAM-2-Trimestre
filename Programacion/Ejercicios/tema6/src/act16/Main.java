package act16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Variables

		int opcion;
		List<MiCiudad> ciudades = new ArrayList<>();
		List<Alojamiento> alojamiento = new ArrayList<>();
		List<LugarInteres> lugarInteres = new ArrayList<>();
		do {

			System.out.println("CIUDADES VISITADAS");
			System.out.println("1. Añadir destino");
			System.out.println("2. Añadir lugar de interes");
			System.out.println("3. Añadir alojamientos");
			System.out.println("4. Mostrar Destinos");
			System.out.println("5. Ciudades Visitadas");
			System.out.println("6. Busqueda por paises");
			System.out.println("7. Busqueda por alojamientos");
			System.out.println("8. Busqueda por lugar de interés");
			System.out.println("9. Visita a Ciudad Realizada");
			System.out.println("10. Salir del programa");

			System.out.println();
			System.out.print("Introduzca una opcion: ");
			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 1:
				try {
					introducirDestino(sc, ciudades);
				} catch (ComprobarCodigoCiudadException e) {
					e.printStackTrace();
				}
				break;
			case 2:
				introducirLugarInteres(sc, lugarInteres, ciudades);
				break;
			case 3:
				introducirAlojamiento(sc, alojamiento, ciudades);
				break;
			case 4:
				mostrarDestino(ciudades);
				break;
			case 5:
				mostrarCiudadesVisitadas(ciudades);
				break;
			}

		} while (opcion != 10);
		sc.close();
	}

	private static void mostrarCiudadesVisitadas(List<MiCiudad> ciudades) {
		for(MiCiudad ciudad : ciudades) {
			if(ciudad.isVisitado() == true) {
				System.out.println(ciudad);
			}else
				System.out.println("La ciudad " + ciudad.getNombreCiudad() + " todavia no se ha visitado");
		}
		
	}

	private static void mostrarDestino(List<MiCiudad> ciudades) {
		for (MiCiudad ciudad : ciudades) {
			if (ciudad.getLugarInteres().size() > 3 && ciudad.getAlojamiento().size() > 3) {
				System.out.println(ciudad);
			} else
				System.out.println("Para que se muestre la ciudad de " + ciudad.getNombreCiudad()
						+ " debe de tener al menos 3 lugares de interes y 3 alojamientos");
		}

	}

	private static void introducirAlojamiento(Scanner sc, List<Alojamiento> alojamiento, List<MiCiudad> ciudades) {
		System.out.println("Has elegido introducir alojamiento");
		System.out.print("Introduzca el nombre del Alojamiento: ");
		String nombreAlojamiento = sc.nextLine();
		System.out.print("Introduzca el nombre de la ciudad donde se encuentra el alojamiento: ");
		String ciudadAlojamiento = sc.nextLine().toUpperCase();
		boolean ciudadEncontrada = false;

		for (MiCiudad ciudad : ciudades) {
			if (ciudad.getNombreCiudad().equalsIgnoreCase(ciudadAlojamiento)) {
				Alojamiento introducirLugarInteres = new Alojamiento(nombreAlojamiento, ciudadAlojamiento);
				ciudad.getAlojamiento().add(introducirLugarInteres);
				ciudadEncontrada = true;
				System.out.println("Alojamiento añadido correctamente");
				break;
			}
			if (!ciudadEncontrada) {
				System.out.println("Ciudad no encontrada");
			}

		}
	}

	private static void introducirDestino(Scanner sc, List<MiCiudad> ciudades) throws ComprobarCodigoCiudadException{
		System.out.println("Has elegido introducir destino");
		System.out.print("Introduzca el nombre de la ciudad: ");
		String nombreCiudad = sc.nextLine().toUpperCase();
		System.out.print("Introduzca el nombre del pais en el que se encuentra la ciudad: ");
		String nombrePais = sc.nextLine().toUpperCase();
		System.out.print("Introduzca el continente en el que se encuentra la ciudad: ");
		String nombreContinente = sc.nextLine().toUpperCase();
		System.out.print("Introduzca el codigo de ciudad: ");
		String codigoCiudad = sc.nextLine().toUpperCase();
		System.out.print("¿Has visitado esta ciudad?(S o N): ");
		String visita = sc.nextLine().toUpperCase();
		boolean visitado = false;
		if (visita.equals("S")) {
			visitado = true;
		} else if(visita.equals("N")) {
			visitado = false;
		}else
			System.out.println("No has introducido el dato correcto. Por defecto no has visitado este destino");
			
			
		MiCiudad ciudad = new MiCiudad(nombreCiudad, nombrePais, nombreContinente, codigoCiudad, visitado);
		ciudades.add(ciudad);
	}

	private static void introducirLugarInteres(Scanner sc, List<LugarInteres> lugarInteres, List<MiCiudad> ciudades) {
		System.out.println("Has elegido introducir el lugar de Interes");
		System.out.print("Introduzca el nombre del lugar de interes: ");
		String nombreLugarInteres = sc.nextLine().toUpperCase();
		System.out.print("Introduzca el nombre de la ciudad donde se encuentra el lugar de interes: ");
		String ciudadLugarInteres = sc.nextLine().toUpperCase();
		boolean ciudadEncontrada = false;

		for (MiCiudad ciudad : ciudades) {
			if (ciudad.getNombreCiudad().equalsIgnoreCase(ciudadLugarInteres)) {
				LugarInteres introducirLugarInteres = new LugarInteres(nombreLugarInteres, ciudadLugarInteres);
				ciudad.getLugarInteres().add(introducirLugarInteres);
				ciudadEncontrada = true;
				System.out.println("Lugar añadido correctamente");
				break;
			}
			if (!ciudadEncontrada) {
				System.out.println("Ciudad no encontrada");
			}

		}
	}

}
