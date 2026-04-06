package excecionesPamini;

public class Main {

	public static void main(String[] args) {
		try {
			DNI dni = new DNI("2679055B");
			System.out.println("DNI Correcto");
		} catch (ValidarDNIException e) {
			
			e.printStackTrace();
		}

	}

}
