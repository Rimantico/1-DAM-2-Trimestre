package actividad607d;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class TerminalVentaApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String producto;
		
		double descuentoAplicable = 0;
		int introducirCantidad;
		double total = 0;
		double descuentoTotal = 0;
		String descuento;
		Map<String, Double> venta = new HashMap<>();
		introducirProductos(venta);
		Map<String, Integer> cantidad = new HashMap<>();
		introducirCantidad(cantidad);

		System.out.println("TERMINAL DE PUNTO DE VENTA");

		do {
			System.out.print("Introduza el nombre del producto (vacío para terminar): ");
			producto = sc.nextLine().toLowerCase();
			if (producto.isEmpty()) {
				break;
			} else {
				if(venta.containsKey(producto)) {
					System.out.print("Introduzca la cantidad: ");
					introducirCantidad = Integer.parseInt(sc.nextLine());
					meterCantidadProductos(producto, introducirCantidad, cantidad);
				}else
					System.out.println("Producto no valido");
				
			}

		} while (!producto.isEmpty());
		System.out.print("Introduzca el código de descuento (vacío para terminar): ");
		descuento = sc.nextLine();
		if (descuento.equals("ECODTO")) {
			descuentoAplicable = 0.10;
		} else if(!descuento.isEmpty()) {
			System.out.println("Código erroneo");
		}

		System.out.println("Producto Precio Cantidad Subtotal");
		for (String p : venta.keySet()) {
			int cant = cantidad.get(p);
			if(cant > 0) {
				
				double precio = venta.get(p);
				double subtotal = cant * precio;
				total += subtotal;
				System.out.println(p +venta.get(p) +cantidad.get(p) +subtotal);
			}
			
		}
		
		descuentoTotal = descuentoAplicable *total;
		System.out.println("--------------------");
		System.out.println("Subototal: " +  total);	
		System.out.println("Descuento: " + descuentoTotal );
		System.out.println("---------------------");
		System.out.println("Total: " + (total-descuentoTotal));
		
		
		
		sc.close();
	}

	public static void introducirProductos(Map<String, Double> venta) {
		venta.put("avena", 2.21);
		venta.put("garbanzos", 2.39);
		venta.put("tomate", 1.59);
		venta.put("jengibre", 3.13);
		venta.put("quinoa", 4.50);
		venta.put("guisantes", 1.60);

	}

	public static void introducirCantidad(Map<String, Integer> venta) {
		venta.put("avena", 0);
		venta.put("garbanzos", 0);
		venta.put("tomate", 0);
		venta.put("jengibre", 0);
		venta.put("quinoa", 0);
		venta.put("guisantes", 0);
	}

	public static void meterCantidadProductos(String producto, int productoSumado, Map<String, Integer> cantidad) {
		if (cantidad.containsKey(producto)) {
			int actual = cantidad.get(producto);
			cantidad.put(producto, actual + productoSumado);
		} else
			System.out.println("Producto no válido");
	}
}
