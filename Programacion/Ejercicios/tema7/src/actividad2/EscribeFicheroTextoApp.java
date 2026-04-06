package actividad2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EscribeFicheroTextoApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		// Main program
		
		
		System.out.print("Introduce la ruta al archivo a mostrar: ");
		String ubicacion = sc.nextLine();
		
		try {
			BufferedReader leer = new BufferedReader(new FileReader(ubicacion));
			String linea;
		
			
			  while ((linea = leer.readLine()) != null) {
		            System.out.println(linea);
		        }

		        leer.close();
					
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo");
		}catch(IOException e) {
			System.out.println("Ha habido un error");
		}

      
		sc.close();
	}

}
