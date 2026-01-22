package actividad407act5;

import actividad406.Persona;

public class Cofrade extends Persona {
	
	// Class Attributes
	
	public static int numeroPortadoresCristo = 100;
	public static int numeroPortadoresVirgen = 120;
	public static int numeroNazarenosCristo = 200;
	public static int numeroNazarenosVirgen= 200;

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
		quitarPlaza();
	}

	// Methods

	public void cambiarProcesionCristo() {
		procesion = Procesion.CRISTO;
	}

	public void cambiarprocesionVirgen() {
		procesion = Procesion.VIRGEN;
	}

	public void cambiarPuestoPortador() {
		puesto = Puesto.PORTADOR;
	}

	public void cambiarPuestoNazareno() {
		puesto = Puesto.NAZARENO;
	}
	
	public void quitarPlaza() {
		if(procesion == Procesion.CRISTO || puesto == Puesto.PORTADOR) {
			numeroPortadoresCristo--;
		}else
			if(procesion == Procesion.CRISTO || puesto == Puesto.NAZARENO) {
				numeroNazarenosCristo--;
			}else
				if(procesion == Procesion.VIRGEN || puesto == Puesto.PORTADOR) {
					numeroPortadoresVirgen--;	
				}else
					numeroNazarenosVirgen--;
	}
}
