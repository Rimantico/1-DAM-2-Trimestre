package parte2;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class GestionSupermercados {

	public static void main(String[] args) {

		// SCANNER
		Scanner sc = new Scanner(System.in);

		// CREAR MAPAS Y LISTA
		Map<String, Double> productoPrecioCarrefour = new HashMap();
		Map<String, Double> productoPrecioMercadona = new HashMap();
		Map<String, Double> productoCantidadSupermercados = new HashMap();
		List<Double> preciosMenores = new ArrayList();

		// CREAR VARIABLE
		double min = Double.MAX_VALUE;

		// INTRODUCIR PRODUCTOS EN LOS MAPAS
		introducirProductosCarrefour(productoPrecioCarrefour);
		introducirProductosMercadona(productoPrecioMercadona);

		// MOSTRAR DATOS
		System.out.println("GESTION DE PRODUCTOS DE SUPERMERCADO");
		System.out.println("Los productos actuales de Carrefour son: ");
		for (Map.Entry<String, Double> e : productoPrecioCarrefour.entrySet()) {
			System.out.println(e);
		}
		System.out.println("Los productos actuales de Mercadona son: ");
		for (Map.Entry<String, Double> e : productoPrecioMercadona.entrySet()) {
			System.out.println(e);
		}
		
		// INTRODUCIR DATOS
		

		// BUSCAR PRECIOS MÁS BAJOS
		System.out.println("El precio más bajo de Carrefour es: " + buscarPrecioMasBajo(productoPrecioCarrefour, min));
		System.out.println("El precio más bajo de Mercadona es: " + buscarPrecioMasBajo(productoPrecioMercadona, min));

		// VALORES MÁS BAJOS
		guardarPrecioMasBajo(productoPrecioMercadona,preciosMenores,min);
		sc.close();
	}

	public static void introducirProductosCarrefour(Map<String, Double> productoPrecioCarrefour) {
		productoPrecioCarrefour.put("patatas", 2.25);
		productoPrecioCarrefour.put("pepinos", 3.14);
		productoPrecioCarrefour.put("leche", 1.80);
		productoPrecioCarrefour.put("huevos", 3.10);
		productoPrecioCarrefour.put("lechuga", 1.25);
	}

	public static void introducirProductosMercadona(Map<String, Double> productoPrecioMercadona) {
		productoPrecioMercadona.put("patatas", 2.30);
		productoPrecioMercadona.put("pepinos", 2.14);
		productoPrecioMercadona.put("leche", 0.80);
		productoPrecioMercadona.put("huevos", 2.10);
		productoPrecioMercadona.put("lechuga", 0.95);
	}
	
	public static void productoCantidadSupermercados(Map<String, Double> productoCantidadSupermercados) {
		productoCantidadSupermercados.put("patatas", 3.5);
		productoCantidadSupermercados.put("pepinos", 2.0);
		productoCantidadSupermercados.put("leche", 1.3);
		productoCantidadSupermercados.put("huevos", 1.10);
		productoCantidadSupermercados.put("lechuga", 1.0);
	}
	
	public static double buscarPrecioMasBajo(Map<String, Double> mapa, Double min) {

		for (Map.Entry<String, Double> e : mapa.entrySet()) {
			if (e.getValue() < min) {
				min = e.getValue();
			}
		}
		return min;
	}

	public static void guardarPrecioMasBajo(Map<String, Double> mapa,List<Double> preciosMenores, Double min) {

		for (Map.Entry<String, Double> e : mapa.entrySet()) {
			if (e.getValue() < min) {
				min = e.getValue();
			}
		}
		
		for (Double l : preciosMenores) {
			l = min;
			System.out.println(l);
		}
		
	}
	
	public static void calcularCantidadYPrecio(Map<String, Double> productoPrecioCarrefour,Map<String, Double> productoPrecioMercadona,Map<String, Double> productoCantidadSupermercados) {
		
		for (Map.Entry<String, Double> e : productoPrecioCarrefour.entrySet()) {
			productoCantidadSupermercados.put(e.getKey(), e.getValue());
		}
		
		for (Map.Entry<String, Double> e : productoPrecioCarrefour.entrySet()) {
			productoCantidadSupermercados.put(e.getKey(), e.getValue());
		}
		
	}

}
