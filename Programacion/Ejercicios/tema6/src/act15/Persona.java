package act15;

public abstract class Persona {

	// Attributes

	protected Nombre nombre;
	protected Direccion direccion;
	protected Telefono telefono;
	protected DNI dni;
	
	// Constructor 
	
	public Persona(Nombre nombre, Direccion direccion, Telefono telefono, DNI dni) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.dni = dni;
	}
	
	// Getters and Setters

	public Nombre getNombre() {
		return nombre;
	}

	public void setNombre(Nombre nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Telefono getTelefono() {
		return telefono;
	}

	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}

	public DNI getDni() {
		return dni;
	}

	public void setDni(DNI dni) {
		this.dni = dni;
	}
	
	

}
