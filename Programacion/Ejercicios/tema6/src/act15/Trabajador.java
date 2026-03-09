package act15;

import java.time.LocalDate;
import java.time.Period;

public class Trabajador  extends Persona{
	
	// Enumerators
	
	public enum CargoEmpresa{
		SENIOR,JUNIOR,JEFE
	}
	
	// Attributes
	
	private int sueldoBase;
	private CargoEmpresa cargoEmpresa;
	private LocalDate fechaInicio;
	
	public Trabajador(Nombre nombre, Direccion direccion, Telefono telefono, DNI dni , int sueldoBase, CargoEmpresa cargoEmpresa, LocalDate fechaInicio) {
		super(nombre,direccion,telefono,dni);
		this.sueldoBase = sueldoBase;
		this.cargoEmpresa = cargoEmpresa;
		this.fechaInicio = fechaInicio;
	}
	
	// Getters and Setters

	public int getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public CargoEmpresa getCargoEmpresa() {
		return cargoEmpresa;
	}

	public void setCargoEmpresa(CargoEmpresa cargoEmpresa) {
		this.cargoEmpresa = cargoEmpresa;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	// Methods
	
	public Period comprobarAntiguedad(LocalDate fechaInicio) {
		LocalDate fechaHoy = LocalDate.now();
		Period antiguedad = Period.between(fechaInicio, fechaHoy);
		return antiguedad;
	}
	

}
