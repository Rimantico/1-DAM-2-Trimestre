package act16;

import java.util.ArrayList;
import java.util.List;

public final class MiCiudad extends Ciudad{
	
	private String codigoCiudad;
	private List<LugarInteres> interes = new ArrayList<>();
	private List<Alojamiento> alojamiento = new ArrayList<>();
	
	
	public MiCiudad(String nombre, String pais, String continente, String codigoCiudad,
			LugarInteres interes, List<Alojamiento> alojamiento) {
		super(nombre, pais, continente);
		this.codigoCiudad = codigoCiudad;
		this.interes = interes;
		this.alojamiento = alojamiento;	
	}
		
	
	
	public void introducirDestino(String nombrePais, String pais,String continente, String codigoCiudad , LugarInteres interes, List<Alojamiento> alojamiento) {
		
		System.out.println("¿Que quieres introducir?: ");
		
	}
	
	
}
