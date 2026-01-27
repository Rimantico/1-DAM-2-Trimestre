package clasePersona;

public class Persona {
	protected String dni;
	protected String nombre;
	protected int edad;
	protected String lugarNacimiento;

	/**
	 * @param dni
	 * @param nombre
	 * @param edad
	 */
	public Persona(String dni, String nombre, int edad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona(String dni, String nombre, int edad, String lugarNacimento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.lugarNacimiento = lugarNacimento;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the lugarNacimiento
	 */
	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	/**
	 * @param lugarNacimiento the lugarNacimiento to set
	 */
	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	@Override
	public String toString() {
		System.out.println("DNI de la persona: " + dni);
		System.out.println("Nombre de la persona: " + nombre);
		System.out.println("Edad de la persona: " + edad);
		System.out.println("Lugar de nacimiento de la persona: " + lugarNacimiento);
		return super.toString();
	}

}
