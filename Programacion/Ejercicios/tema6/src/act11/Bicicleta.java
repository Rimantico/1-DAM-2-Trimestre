package act11;

public final class Bicicleta extends Vehiculo {
	
	public Bicicleta(String marca, int velocidadActual)throws VelocidadNoValidaException {
		super(marca,velocidadActual);
	}

	@Override
	public void tipoCombustible() {
		System.out.println("no utilizan ningun combustible pero hay algunas eléctricas");
	}
	
	
	
}
