package actividad407act4;

import actividad406.Vehiculo;

public class Movimiento extends Vehiculo{
	
	public enum Traccion{
		MOTOR,
		SINMOTOR,
		TRACCIONANIMAL
	}
	
	public enum ModoTransporte{
		MAR,
		TIERRA,
		AIRE
	}
	// Attributes
	
	private Traccion traccion;
	private ModoTransporte modoTransporte;
	
	// Constructor
	
	public Movimiento(String matricula, String marca, String modelo , int anoMatriculacion, Traccion traccion, ModoTransporte modoTransporte) {
		super(matricula,marca,modelo,anoMatriculacion);
		this.traccion = traccion;
		this.modoTransporte = modoTransporte;
	}
	
	// Methods
	
	public void comprobarAire() {
		if(traccion== Traccion.SINMOTOR || modoTransporte== ModoTransporte.AIRE) {
			System.out.println("No puedes volar sin un motor");
		}else
			if(traccion == Traccion.TRACCIONANIMAL || modoTransporte== ModoTransporte.AIRE) {
				System.out.println("No puedes volar con las aves como medio de traccion");
			}else
				System.out.println("El vehículo puede volar");
	}

}
