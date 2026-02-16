package actividad607c;

import java.util.HashMap;
import java.util.Map;

public class DiccionarioSpanishEnglish {
	private Map<String, String> traductor ;
	
	public DiccionarioSpanishEnglish() {
		traductor = new HashMap<>();
		traductor.put("girar", "spin");
		traductor.put("sorpresa", "surprise");
		traductor.put("maceta", "pot");
		traductor.put("historiador", "historian");
		traductor.put("enjuagar", "rinse");
		traductor.put("casilla", "square");
		traductor.put("signo", "sign");
		traductor.put("importar", "import");
		traductor.put("profesional", "professional");
		traductor.put("ficha", "piece");
		traductor.put("patines", "skates");
		traductor.put("historia", "history");
		traductor.put("tornillo", "screw");
		traductor.put("cantante", "singer");
		traductor.put("insulto", "insult");
		traductor.put("firma", "sign");
		traductor.put("lechuga", "lettuce");
		traductor.put("tiza", "chalk");
		traductor.put("adoptar", "adopt");
		traductor.put("pila", "battery");
		traductor.put("ciudad", "city");
		traductor.put("rail", "rail");
		traductor.put("frontera", "border");
		traductor.put("prisionero", "prisioner");
		traductor.put("capullo", "cocoon");
		traductor.put("anchoa", "anchovy");
		traductor.put("opinion", "opinion");
		traductor.put("pierna", "leg");
		traductor.put("hábito", "habit");
		traductor.put("hueso", "bone");

	}
	
	public void getPalabrasSpanish() {
		for(String palabra : traductor.keySet()) 
			System.out.println(palabra);
	}
	
	public void traducir(String palabra) {
		String traduccion = traductor.get(palabra);
		
		if(traduccion != null) {
			System.out.println("La traducción de " + palabra + "es " + traduccion);
		}else
			System.out.println("La palabra no está en el diccionario");
	}

	public void getValoresEnglish() {
	    for(String valor : traductor.values()) {
	        System.out.println(valor);
	    }
	}

		
	
	


}
