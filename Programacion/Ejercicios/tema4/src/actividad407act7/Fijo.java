package actividad407act7;

import actividad407act1.Trabajador;

public class Fijo extends Trabajador{
	
	// Statics
	
	public static final int SALARIOBASENORMAL = 1200;
	public static final int SALARIOBASESUPERIOR = 1350;
	public static final int HORASEXTRANORMAL = 15;
	public static final int HORASEXTRASUPERIRO = 22;
	
	// Enumerator
	public enum Puesto{
		NORMAL, SUPERIOR
	}
	
	// Attributes
	
	private Puesto puesto;
	
	
	// Constructor
	
	public Fijo(String dni, String nombre, int edad, String cargoEmpresa, String afiliacionSS, int sueldoBase, Puesto puesto){
		super(dni, nombre, edad, cargoEmpresa, afiliacionSS,sueldoBase);
		this.puesto = puesto;
	}

}
