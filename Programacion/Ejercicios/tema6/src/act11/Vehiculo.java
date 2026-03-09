package act11;

public abstract class Vehiculo implements Conducible{
	
	// Attributes
	
	protected String marca;
	protected int velocidadActual = 0;
	
	// Constructor
	
	public Vehiculo(String marca, int velocidadActual) throws VelocidadNoValidaException {
		this.marca = marca;
		if(velocidadActual < 0 ) {
			throw new VelocidadNoValidaException("Introduzca una velocidad válida");
		}else
			this.velocidadActual = velocidadActual;
	}
	
	// Methods
	
	

	public abstract void tipoCombustible();
	
	@Override
	public void acelerar(int cantidad) {
		velocidadActual = velocidadActual + cantidad;
		System.out.println(" El vehiculo a alcanzado los " + velocidadActual + " kilometros por hora");
	}
	
	@Override
	public void frenar(int cantidad) throws VelocidadNoValidaException {
		if(velocidadActual < 0 || velocidadActual < cantidad ) {
			throw new VelocidadNoValidaException("No puedes alcanzar esa velocidad");
		}
	}
	
}
