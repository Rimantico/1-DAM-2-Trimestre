package actividad407act4;

import claseVehiculo.Vehiculo;

public class VehiculoEspecificado extends Vehiculo{

	
	// Enumerators
	
	public enum MedioDesplazamiento{
		TIERRA,MAR,AIRE
	}
	
	public enum TipoPropulsion{
		MOTOR,TRACCIONANIMAL,SINMOTOR
	}
	
	// Attributes
	
	private MedioDesplazamiento desplazamiento;
	private TipoPropulsion propulsion;
	
	// Constructor
	
	public VehiculoEspecificado(String matricula, String marca, String modelo, int anoMatriculacion, MedioDesplazamiento desplazamiento, TipoPropulsion propulsion) {
		super(matricula,marca,modelo,anoMatriculacion);
		this.desplazamiento = desplazamiento;
		this.propulsion = propulsion;
	}
	
	// Methods
	
	public boolean esEcologico() {
		if(propulsion == TipoPropulsion.SINMOTOR || propulsion == TipoPropulsion.TRACCIONANIMAL) {
			return true;
		}else
			return false;
	}
}
