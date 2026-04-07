package actividadExamen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveManager{
	
	public static void guardarProgreso(Jugador jugador) {
		File partida = new File("partida.txt");
		
		 try {
			PrintWriter guardarPartida = new PrintWriter(new FileWriter("partida.txt",true));
			
			guardarPartida.println(jugador.getNombre()+ ";"+jugador.getNivel()+";"+jugador.getOro());
			
			guardarPartida.close();
			
		} catch (IOException e) {
			System.out.println("Error al guardar la partida");
		}
	}

}
