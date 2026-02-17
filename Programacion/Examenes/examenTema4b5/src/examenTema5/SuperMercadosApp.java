package examenTema5;

import java.util.Map;
import java.util.HashMap;

public class SuperMercadosApp {

	public static final int CANTIDADPRODUCTOCOMPRADA = 5;

	public static void main(String[] args) {

		// Variables

		double totalCompra = 0;

		// Inicio de Mapas

		Map<String, Double> carrefour = new HashMap<>();
		Map<String, Double> mercadona = new HashMap<>();
		Map<String, Double> barato = new HashMap<>();

		// Introducción de datos de Productos a los mapas

		introducirProductoPrecioCarrefour(carrefour);
		introducirProductoPrecioMercadona(mercadona);

		// Con este bucle sabremos cual es el precio mas barato. La clave y el producto
		// mas barato de las dos tiendas se alamcenará en un tercer mapa en donde
		// guardaremos los productos mas baratos

		for (String clave : carrefour.keySet()) {
			double precioProductoCarrefour = carrefour.get(clave);
			double precioProductoMercadona = mercadona.get(clave);

			if (precioProductoCarrefour > precioProductoMercadona) {
				barato.put(clave, precioProductoMercadona);
				System.out.println(clave + " es mas barato en Mercadona. El precio es de " + precioProductoMercadona);
			} else {
				barato.put(clave, precioProductoCarrefour);
				System.out.println(clave + " es mas barato en Carrefour. El precio es de " + precioProductoCarrefour);
			}
		}
		// Para separar los apartados un poco
		System.out.println("");
		// Tras tener los productos mas baratos de cada supermercado, compraremos un
		// numero fijo de productos.

		System.out.println("Si queremos comprar " + CANTIDADPRODUCTOCOMPRADA
				+ " unidades de cada producto tendremos que pagar lo siguiente");
		System.out.println();

		// Con esto calcularemos cuanto cuesta cada producto y el total de todos los
		// productos sumados

		for (String clave : barato.keySet()) {
			double costeProductoBarato = barato.get(clave);
			double costoProducto = costeProductoBarato * CANTIDADPRODUCTOCOMPRADA;
			totalCompra += costoProducto;
			System.out.println(clave + ": " + costoProducto);
		}
		System.out.println("Total: " + totalCompra);

	}

	// Métodos para introducir productos

	public static void introducirProductoPrecioCarrefour(Map<String, Double> mapa) {
		mapa.put("patatas", 2.5);
		mapa.put("zanahorias", 2.6);
		mapa.put("tomates", 4.75);
		mapa.put("coles", 1.20);
		mapa.put("lubina", 5.32);

	}

	public static void introducirProductoPrecioMercadona(Map<String, Double> mapa) {
		mapa.put("patatas", 8.5);
		mapa.put("zanahorias", 1.2);
		mapa.put("tomates", 2.23);
		mapa.put("coles", 4.45);
		mapa.put("lubina", 6.56);

	}

}
