package actividad607c;

import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class JuegoPalabrasIngles {

	public static void main(String[] args) {

		// Objects and Variables

		Scanner sc = new Scanner(System.in);
		Map<String, String> traductor = new HashMap<>();
		Random r = new Random();
		meterPalabras(traductor);
		List<String> ingles = new ArrayList<>(traductor.keySet());
		int acierto = 0;
		int fallo = 0;

		// Main Program
		System.out.println("¿Cuanto sabes de inglés?");
		for (int i = 0; i < 5; i++) {
			String palabraAleatoria = ingles.get(r.nextInt(ingles.size()));
			String palabraCorrecta = traductor.get(palabraAleatoria).toLowerCase();
			System.out.print(
					"Palabra nº" + (i + 1) + ". Dime cual es la taducción al español de " + palabraAleatoria + ": ");
			String palabraIntroducida = sc.nextLine().toLowerCase();
			if (palabraIntroducida.equals(palabraCorrecta)) {
				System.out.println("¡ACERTASTE!");
				acierto++;
			} else {
				System.out.println("¡FALLASTE!. la palabra correcta era " + palabraCorrecta);
				fallo++;
			}
		}
		System.out.println("Has tenido los siguientes aciertos: " + acierto);
		System.out.println("Has tenido los siguientes fallos: " + fallo);

		sc.close();
	}

	public static void meterPalabras(Map<String, String> traductor) {
		traductor.put("spin", "girar");
		traductor.put("surprise", "sorpresa");
		traductor.put("pot", "maceta");
		traductor.put("historian", "historiador");
		traductor.put("rinse", "enjuagar");
		traductor.put("square", "casilla");
		traductor.put("sign", "signo");
		traductor.put("import", "importar");
		traductor.put("professional", "profesional");
		traductor.put("piece", "ficha");
		traductor.put("skates", "patines");
		traductor.put("history", "historia");
		traductor.put("screw", "tornillo");
		traductor.put("singer", "cantante");
		traductor.put("insult", "insulto");
		traductor.put("lettuce", "lechuga");
		traductor.put("chalk", "tiza");
		traductor.put("adopt", "adoptar");
		traductor.put("battery", "pila");
		traductor.put("city", "ciudad");
		traductor.put("rail", "rail");
		traductor.put("border", "frontera");
		traductor.put("prisioner", "prisionero");
		traductor.put("cocoon", "capullo");
		traductor.put("anchovy", "anchoa");
		traductor.put("opinion", "opinion");
		traductor.put("leg", "pierna");
		traductor.put("habit", "hábito");
		traductor.put("bone", "hueso");
	}

}
