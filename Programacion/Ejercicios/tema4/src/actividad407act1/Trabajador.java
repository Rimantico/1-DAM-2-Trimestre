package actividad407act1;

import actividad406.Persona;

public class Trabajador extends Persona {
	
	// Attributes
	
	private String cargoEmpresa;
	private String afiliacionSS;
	private int sueldoBase;
	
	// Constructor
	
	public Trabajador(String dni, String nombre , int edad , String cargoEmpresa, String afiliacionSS, int sueldoBase) {
		super(dni,nombre,edad);
		this.cargoEmpresa = cargoEmpresa;
		this.afiliacionSS = afiliacionSS;
		this.sueldoBase = sueldoBase;
	}
	
	// Metodos
	
	public void verCargo() {
		System.out.println("El cargo de " + getNombre() + " es: " + cargoEmpresa);
	}
	public void verAfiliacion() {
		System.out.println("La afiliacion de la Seguridad Social de "+ getNombre() + " es: " + afiliacionSS);
	}
	
	public void verSueldoBase() {
		System.out.println("El sueldo base de " + getNombre() + " es: " + sueldoBase);
	}
	
}
