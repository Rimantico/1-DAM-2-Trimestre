package actividad1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	// Constantes

	public static final int NUMEROEVENTOS = 10;
	public static final int NUMEROMINIMOESPECTADORES = 2225;
	public static final int NUMEROMAXIMOESPECTADORES = 10250;

	public static void main(String[] args) {

		// Creacion del archivo datosEvento.txt

		File datosEventos = new File("datosEvento.txt");
		
		// Crear Lista donde van los espectadores
		
		List<Integer> listaEspectadores = new ArrayList<Integer>();
		List<Integer> listaEventos = new ArrayList<Integer>();

		// Programa principal

		// Los PrintWriter que son los que hacen que se escriba  y los que leen van siempre alrededor de un try catch
		try {
			PrintWriter introducirDatos = new PrintWriter(new FileWriter("datosEvento.txt"));
			for (int i = 0; i < NUMEROEVENTOS; i++) {
				int numeroEspectadoresAleatorios = (int) (Math.random()
						* (NUMEROMAXIMOESPECTADORES - NUMEROMINIMOESPECTADORES + 1) + NUMEROMINIMOESPECTADORES);

				

				introducirDatos.println(i + "," + numeroEspectadoresAleatorios);

			}
			introducirDatos.close();

		} catch (IOException e) {

			e.printStackTrace();
		} 
		
		// Apartado B
		
		// Una vez que tenemos todos los valores introducidos en el archivo, tendremos que recorrerlos
		
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("datosEvento.txt"));
			String linea;
			 while ((linea = br.readLine()) != null) {
		            String[] partes = linea.split(",");
		            
		            int id = Integer.parseInt(partes[0]);
		            int espectadores = Integer.parseInt(partes[1]);
		            listaEspectadores.add(espectadores);
		            listaEventos.add(id);
		        }

		        br.close();

		} catch (IOException | NumberFormatException e) {
			
			e.printStackTrace();
		}
		System.out.println();


		
		// Como lo hemos ordenado cogeremos el primero y el ultimo
		int numeroEspectadoresMenor =listaEspectadores.getFirst();
		int numeroEspectadoresMayor = listaEspectadores.getLast();
		double mediaEspectadores = 0;
		
		for(int lista : listaEspectadores) {
			mediaEspectadores+= lista;
		}
		
		mediaEspectadores = mediaEspectadores / NUMEROEVENTOS;
		
		File resultados = new File("resultado.txt");
		
		try {
			PrintWriter escribirResultados = new PrintWriter(new FileWriter("resultado.txt"));
			
			escribirResultados.println("Mayor número de espectadores: " + numeroEspectadoresMayor);
			escribirResultados.println("Menor número de espectadores: " + numeroEspectadoresMenor);
			escribirResultados.println("Media de espectadores: " + mediaEspectadores);
			
			escribirResultados.close();
		} catch (IOException e) {
			System.out.println("Error al introducirse los resultados");
		}

       
	}

}
