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

public class Main2 {
	
	public static final int TOTALEVENTOS = 10;
	public static final int MINESPECTADORES = 2225;
	public static final int MAXESPECTADORES = 10250;

	public static void main(String[] args) {
		
		List<Evento> eventos = new ArrayList<Evento>();
		List<Integer> idEvento = new ArrayList<Integer>();
		List<Integer> espectadoresEvento = new ArrayList<Integer>();
		
		for(int i = 0 ; i<TOTALEVENTOS ; i++) {
			int aleatorio = (int)(Math.random() * (MAXESPECTADORES - MINESPECTADORES + 1) + MINESPECTADORES);
			
			Evento evento = new Evento(i, aleatorio);
			
			eventos.add(evento);
		}
		
		File archivoEvento = new File("archivoEvento.txt");
		
		try {
			PrintWriter introducirEvento = new PrintWriter(new FileWriter("archivoEvento.txt"));
			for(Evento evento : eventos) {
				int id = evento.getId();
				int espectadores = evento.getEspectadores();
				
				introducirEvento.println(id + "," + espectadores);
			}
			
			introducirEvento.close();
		} catch (IOException e) {
			System.out.println("Error en la introducción");
		}

		try {
			BufferedReader leerArchivoEvento = new BufferedReader(new FileReader("archivoEvento.txt"));
			String linea;
			 while ((linea = leerArchivoEvento.readLine()) != null) {
	               String[] partes = linea.split(",");
	              int idEventos = Integer.parseInt(partes[0]);
	              int espectadoresEventos = Integer.parseInt(partes[1]);
	              
	              idEvento.add(idEventos);
	              espectadoresEvento.add(espectadoresEventos);
	            }
		} catch (IOException e) {
			System.out.println("Error en la lectura");
		}
		
		int numeroEspectadoresMaximo = Integer.MIN_VALUE;
		int numeroEspectadoresMinimo = Integer.MAX_VALUE;
		
		int numeroIdMax = idEvento.get(0);
		int numeroIdMin = idEvento.get(0);
		
		for (int i = 0; i < espectadoresEvento.size(); i++) {
		    if (espectadoresEvento.get(i) > numeroEspectadoresMaximo) {
		    	numeroEspectadoresMaximo = espectadoresEvento.get(i);
		    	numeroIdMax = numeroIdMax.get(i);
		    }
		}

		
	}

}
