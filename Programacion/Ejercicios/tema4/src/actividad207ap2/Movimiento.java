package actividad207ap2;

import modelo.Vehiculo;

public class Movimiento extends Vehiculo {
	
	// ATRIBUTOS
	
	private String aceleracion;
	private String tipoVehiculo;
	
	// CONSTRUCTOR
	
	public Movimiento(String matricula, String marca, int velocidad, String aceleracion, String tipoVehiculo) {
		super(matricula,marca,velocidad);
		this.aceleracion = aceleracion;
		this.tipoVehiculo = tipoVehiculo;
	}
	
	public void metodoAcelerar() {
		switch(aceleracion) {
		case "Motor":
			System.out.println("Este vehiculo va con motor");
		case "Sin Motor":
			System.out.println("Este vehiculo va sin motor");
		case "Traccion Animal":
			System.out.println("Este vehiculo va con tracción animal");
		default:
			System.out.println("No se ha especificado");
		}
	}
	
	public void tipoVehiculo() {
		switch(tipoVehiculo) {
		case "Tierra":
			System.out.println("Este vehículo va por la tierra");
		case "Aire":
			System.out.println("Este vehiculo va por el aire");
		case "Mar":
			System.out.println("Este vehiculo va por el mar");
		default:
			System.out.println("No se ha especificado");
		}
	}

}
