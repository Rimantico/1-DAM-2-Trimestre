package actividad207ap2;

import actividad406.Vehiculo;

public class Movimiento extends Vehiculo {
	
	// ATRIBUTOS
	
	private String aceleracion;
	private String tipoVehiculo;
	
	// CONSTRUCTOR
	
	public Movimiento(String matricula, String marca, int velocidad,String modelo, int anoMatriculacion ,String aceleracion, String tipoVehiculo) {
		super(matricula,marca,modelo,anoMatriculacion);
		this.aceleracion = aceleracion;
		this.tipoVehiculo = tipoVehiculo;
	}
	
	public void metodoAcelerar() {
		switch(aceleracion) {
		case "Motor":
			System.out.println("Este vehiculo va con motor");
			break;
		case "Sin Motor":
			System.out.println("Este vehiculo va sin motor");
			break;
		case "Traccion Animal":
			System.out.println("Este vehiculo va con tracción animal");
			break;
		default:
			System.out.println("No se ha especificado");
			break;
		}
	}
	
	public void tipoVehiculo() {
		switch(tipoVehiculo) {
		case "Tierra":
			System.out.println("Este vehículo va por la tierra");
			break;
		case "Aire":
			comprobacionAire();
			break;
		case "Mar":
			System.out.println("Este vehiculo va por el mar");
			break;
		default:
			System.out.println("No se ha especificado");
		}
	}
	
	public void comprobacionAire() {
		if(tipoVehiculo.equals("Aire") || aceleracion.equals("Sin Motor")) {
			System.out.println("No puedes viajar por aire sin un motor");
		}else
			if(tipoVehiculo.equals("Aire") || aceleracion.equals("Traccion Animal")) {
				System.out.println("No puedes volar por el aire tirado de pajaros");
			}else
				System.out.println("Este vehiculo va por el aire");
	}
	
	
	}


