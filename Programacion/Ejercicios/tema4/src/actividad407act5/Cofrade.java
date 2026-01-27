package actividad407act5;

import clasePersona.Persona;

public class Cofrade extends Persona {

	// Attributes of the Class
	
	public static int portadorCristo = 100;
	public static int portadorVirgen = 120;
	public static int nazarenoCristo = 200;
	public static int nazarenoVirgen = 200;


	// Enumerators

	public enum Procesion {
		CRISTO, VIRGEN
	}

	public enum Puesto {
		PORTADOR, NAZARENO
	}

	// Attributes

	protected Procesion procesion;
	protected Puesto puesto;

	// Constructor

	public Cofrade(String dni, String nombre, int edad, Procesion procesion, Puesto puesto) {
		super(dni, nombre, edad);
		this.procesion = procesion;
		this.puesto = puesto;
		ponerCofrade();
	}

	// Methods

	public void cambiarCristo() {
		procesion = Procesion.CRISTO;
	}

	public void cambiarVirgen() {
		procesion = Procesion.VIRGEN;
	}

	public void cambiarPortador() {
		puesto = Puesto.PORTADOR;
	}

	public void cambiarNazareno() {
		puesto = Puesto.NAZARENO;
	}
	
	public void ponerCofrade() {
		if(procesion == Procesion.CRISTO || puesto == Puesto.PORTADOR) {
			portadorCristo--;
		}else
			if(procesion == Procesion.VIRGEN || puesto == Puesto.PORTADOR) {
				portadorVirgen--;
			}else
				if(procesion == Procesion.VIRGEN || puesto == Puesto.NAZARENO) {
					nazarenoVirgen--;
				}else
					nazarenoCristo--;
	}

	public void visualizarCofrade() {
		System.out.println("DNI: " + dni);
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad " + edad);
		System.out.println("Procesion: " + procesion);
		System.out.println("Puesto: " + puesto);
	}

}
