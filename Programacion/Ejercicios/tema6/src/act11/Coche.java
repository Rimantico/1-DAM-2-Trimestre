package act11;

public class Coche extends Vehiculo{
	
	public Coche(String marca, int velocidadActual) throws VelocidadNoValidaException {
		super(marca,velocidadActual);
	}

	
	@Override
	public void tipoCombustible() {
		System.out.println("Los coches pueden ser de gasolina, gasoil o eléctricos");
	}
	

}
