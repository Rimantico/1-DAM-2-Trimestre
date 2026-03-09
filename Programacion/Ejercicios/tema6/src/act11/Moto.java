package act11;

public class Moto extends Vehiculo{
	
	public Moto(String marca , int velocidadActual)throws VelocidadNoValidaException {
		super(marca,velocidadActual);
	}

	@Override
	public void tipoCombustible() {
		System.out.println("Las motos pueden utilizar gasoil, diesel, etc");	
	}
	
	

}
