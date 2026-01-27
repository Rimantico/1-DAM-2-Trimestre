package actividad407act1;

import clasePersona.Persona;

public class Trabajador extends Persona {
	
	// Attributes
	
	protected String cargoEmpresa;
	protected String afiliacionSS;
	protected int sueldoBase;
	
	// Constructor
	
	public Trabajador(String dni, String nombre, int edad, String cargoEmpresa, String afiliacionSS, int sueldoBase) {
		super(dni,nombre,edad);
		this.cargoEmpresa = cargoEmpresa;
		this.afiliacionSS = afiliacionSS;
		this.sueldoBase = sueldoBase;
	}
	
	// Getters and Setters
	
	public String getCargoEmpresa() {
		return cargoEmpresa;
	}



	public void setCargoEmpresa(String cargoEmpresa) {
		this.cargoEmpresa = cargoEmpresa;
	}



	public String getAfiliacionSS() {
		return afiliacionSS;
	}



	public void setAfiliacionSS(String afiliacionSS) {
		this.afiliacionSS = afiliacionSS;
	}



	public int getSueldoBase() {
		return sueldoBase;
	}



	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	// Methods

	public void verCargo() {
		System.out.println("EL cargo de la persona" + nombre + " es " + cargoEmpresa);
	}
	public void verAfiliacion() {
		System.out.println("La afiliación a la Seguridad Social de " + nombre + " es: " + afiliacionSS);
	}
	public void verSuedoBase() {
		System.out.println("El sueldo base de " + nombre + " es de " + sueldoBase +"€");
	}
	
	
}
