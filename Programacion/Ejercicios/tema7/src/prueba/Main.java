package prueba;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		 try {
	            // Crear archivo
	            File archivo = new File("archivo.txt");
	            archivo.createNewFile();

	            // Escribir
	            PrintWriter pw = new PrintWriter(new FileWriter("archivo.txt"));
	            pw.println("Primera linea");
	            pw.close();

	            // Añadir
	            pw = new PrintWriter(new FileWriter("archivo.txt", true));
	            pw.println("Tercera linea");
	            pw.close();

	            // Leer
	            BufferedReader br = new BufferedReader(new FileReader("archivo.txt"));
	            String linea;

	            while ((linea = br.readLine()) != null) {
	                System.out.println(linea);
	            }

	            br.close();

	        } catch (IOException e) {
	            System.out.println("Error");
	        }
	}

}
