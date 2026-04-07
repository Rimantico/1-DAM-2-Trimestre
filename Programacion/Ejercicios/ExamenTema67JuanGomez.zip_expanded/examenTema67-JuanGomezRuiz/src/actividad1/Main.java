package actividad1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	// Hecho por Juan Gomez Ruiz

	public static final int NUMEROALUMNOS = 5;
	public static final int NUMERONOTAS = 3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Creacion del fichero de las notas

		File notas = new File("notas.txt");
		
		// Creamos listas para todas las partes de la linea
		
		List<Double> listaNota1 = new ArrayList<Double>();
		List<Double> listaNota2 = new ArrayList<Double>();
		List<Double> listaNota3 = new ArrayList<Double>();
		List<String> listaNombres = new ArrayList<String>();
		
		
		// Esto nos sirve para poder escribir dentro del archivo de notas

		try {
			PrintWriter escribir = new PrintWriter(new FileWriter("notas.txt"));
			for (int i = 0; i < NUMEROALUMNOS; i++) {
				System.out.println("Dime el nombre del " + (i+1) + " alumno");
				String nombre = sc.nextLine();
				double randomNum1 = (double) (Math.random() * (0 - 10 + 1) + 10);
				double randomNum2 = (double) (Math.random() * (0 - 10 + 1) + 10);
				double randomNum3 = (double) (Math.random() * (0 - 10 + 1) + 10);
				
				escribir.println(nombre + "," + randomNum1 + ","+ randomNum2 +","+ randomNum3);
				System.out.println("Numeros Introducidos correctamente");
			}
			escribir.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
        try {
			BufferedReader br = new BufferedReader(new FileReader("notas.txt"));
			String linea;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                
                double nota1 = Double.parseDouble(partes[1]);
                double nota2 = Double.parseDouble(partes[2]);
                double nota3 = Double.parseDouble(partes[3]);
                String nombres = partes[0];
                
                listaNota1.add(nota1);
                listaNota2.add(nota2);
                listaNota3.add(nota3);
                listaNombres.add(nombres);
                
            }

            br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
        
        for(double notasVer : listaNota1) {
        	System.out.println(notasVer);
        }
        
       calculoNotas(listaNota1,listaNota2,listaNota3,listaNombres);


		sc.close();
	}
	
	public static void calculoNotas(List<Double> listaNota1 , List<Double> listaNota2, List<Double> listaNota3, List<String> listaNombres) {
		File notasFinales = new File("notasFinales.txt");
		
		  try {
			PrintWriter escribirNotaFinal = new PrintWriter(new FileWriter("notasFinales.txt"));
			for(int i = 0 ; i<NUMEROALUMNOS ; i++) {
				double media = 0;
				media = listaNota1.get(i) + listaNota2.get(i) + listaNota3.get(i);
				media = media /3;
				
				escribirNotaFinal.println(listaNombres.get(i) + ":" + media);
				System.out.println("Media calculada correctamente");
			}
			
			escribirNotaFinal.close();
		} catch (IOException e) {
			System.out.println("Error en el calculo de medias");
		}

		
	}

}
