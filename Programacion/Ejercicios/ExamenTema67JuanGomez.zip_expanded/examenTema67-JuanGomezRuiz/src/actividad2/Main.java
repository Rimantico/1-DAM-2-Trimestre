package actividad2;

import java.util.Scanner;

import actividad2.Cliente.MetodoPago;
import actividad2.Vehiculo.Modelo;

public class Main {

	public static void main(String[] args) {

		// El Main esta un poco caotico pero la primera parte es para comprobar que todo
		// se crea de manera correcta y que no hay problemas a la hora de buscar el
		// código o DNI.
		
		// Como ya he dicho dentro de la clase factura, los calculos no estan del todo correctos pero todo se ejecuta
		Scanner sc = new Scanner(System.in);
		// Creacion de objetos
		Vehiculo vehiculo = null;
		try {
			vehiculo = new Vehiculo("MA-00AB1234", "31231BFC", "Seat", Modelo.COCHE, "Seat", 2000);
			System.out.println(Vehiculo.getCantidadTotalCoches());
		} catch (ValidarCodigoException e) {

			e.printStackTrace();
		}
		Cliente cliente = null;
		try {
			cliente = new Cliente("Juan", "26791055B", MetodoPago.METALICO);
		} catch (ValidarDNIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cliente.toString();
		Factura factura = null;
		try {
			factura = new Factura(123456, vehiculo, cliente);
			factura.acercaDe();
			System.out.println(factura.toString());
		} catch (ValidarCodigoException e) {
			e.printStackTrace();
		}

		try {
			PersonaContacto personaContacto = new PersonaContacto("Juan", "Empleado", null, 688721365, "jgomrui1410@gmail.com");
			System.out.println(personaContacto.toString());
		} catch (ValidarEmailException e) {
			e.printStackTrace();
		}
		int opcion;
		do {
			System.out.println("1. DNI");
			System.out.println("2. Código");
			System.out.println("3. Salir");
			opcion = Integer.parseInt(sc.nextLine());
			switch (opcion) {
			case 1:
				buscarFacturaDNI(sc, factura);
			case 2:
				buscarFacturaCodigo(sc, factura);
			}

		} while (opcion != 3);

		sc.close();
	}

	private static void buscarFacturaCodigo(Scanner sc, Factura factura) {
		System.out.println("Introduzca el código de la factura");
		int codigo = Integer.parseInt(sc.nextLine());
		if (codigo == factura.getIdentificador()) {
			System.out.println(factura);
		} else
			System.out.println("Codigo no encontrado");

	}

	private static void buscarFacturaDNI(Scanner sc, Factura factura) {
		System.out.println("Introduzca el DNI: ");
		String dni = sc.nextLine();

		if (dni.equals(factura.getCliente().getDNI())) {
			System.out.println(factura);
		} else
			System.out.println("Factura no encontrada");

	}

}
