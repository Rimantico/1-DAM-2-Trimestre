package modelo;

public class Main {

	public static void main(String[] args) {
		Vehiculo vehiculo = new Vehiculo("231321F","BMW",55);
		Coche coche1 = new Coche("313123R","Mercedes",120,4);
		CocheElectrico cocheElectrico = new CocheElectrico("48181818C","Aston Martin",120,4,75);
		
		System.out.println("--- ¿Como arrancan los coches?---");
		vehiculo.arrancar();
		coche1.arrancar();
		cocheElectrico.arrancar();
		System.out.println("--- Metodos Propios ---");
		coche1.tocarClaxon();
		cocheElectrico.cargarBateria();

	}

}
