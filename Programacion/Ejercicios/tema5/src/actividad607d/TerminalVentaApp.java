package actividad607d;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class TerminalVentaApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String producto;
		Map<String, Double> venta = new HashMap<>();
		introducirProductos(venta);
		
		System.out.println("TERMINAL DE PUNTO DE VENTA");
		
		do {
			System.out.print("Introduza el nombre del producto (vacío para terminar): ");
			producto = sc.nextLine();
			System.out.println("Introduzca la cantidad");
			
		}while(!producto.isEmpty() || !producto.isBlank());
		
		sc.close();
	}
	
	public static void introducirProductos(Map<String,Double> venta) {
		venta.put("avena", 2.21);
		venta.put("garbanzos", 2.39);
		venta.put("tomate", 1.59);
		venta.put("jengibre", 3.13);
		venta.put("quinoa", 4.50);
		venta.put("guisantes", 1.60);
		
	}

}
