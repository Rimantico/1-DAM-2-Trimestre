package actividad3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class EscribeFicheroTextoApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Main Program
		
		System.out.print("Introduce la ruta al archivo a crear: ");
		String ruta = sc.nextLine();
		
		File archivo = new File(ruta);
		try {
			archivo.createNewFile();
			
			if(archivo.createNewFile()) {
				System.out.println("Archivo creado");
			}else
				System.out.println("Arhivo ya creado");
		} catch (IOException e) {
			System.out.println("Error");
		}
		
		sc.close();
	}

}
