package actividadExamen;

public class Main {

	public static void main(String[] args) {
		Jugador jugador = new Jugador("Juan",4,3);
		
		jugador.toString();
		SaveManager.guardarProgreso(jugador);

	}

}
