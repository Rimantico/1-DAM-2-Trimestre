package actividad2;

public class Cliente implements Metodos{
	
	
	// Clase hecha por Juan Gómez Ruiz

	
	public enum MetodoPago{
		METALICO,TARJETA;
	}
	
	private String nombre;
	private String DNI;
	private MetodoPago metodoPago;
	
	

	public Cliente(String nombre, String DNI, MetodoPago metodoPago) throws ValidarDNIException {
		super();
		this.nombre = nombre;
		validarDNI(DNI);
		this.DNI = DNI;
		this.metodoPago = metodoPago;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public MetodoPago getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(MetodoPago metodoPago) {
		this.metodoPago = metodoPago;
	}
	
	// Metodos 
	
	public void validarDNI(String DNI) throws ValidarDNIException {
		String regex = "^[0-9]{8}[A-Za-z]$";
		
		if(!DNI.matches(regex)) {
			throw new ValidarDNIException("DNI Invalido");
		}else
			System.out.println("DNI CREADO");
		
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", DNI=" + DNI + ", metodoPago=" + metodoPago + "]";
	}
	
	@Override
	public void acercaDe() {
		System.out.println("Autocares Juan");
		System.out.println("AP1231");	
	}
	
	
	

	

}
