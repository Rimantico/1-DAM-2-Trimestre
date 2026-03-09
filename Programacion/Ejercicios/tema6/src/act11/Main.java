package act11;

public class Main {

	public static void main(String[] args) {
		try {
			Coche coche = new Coche("BMW" , 6);
		} catch (VelocidadNoValidaException e) {
			e.printStackTrace();
		}

	}

}
