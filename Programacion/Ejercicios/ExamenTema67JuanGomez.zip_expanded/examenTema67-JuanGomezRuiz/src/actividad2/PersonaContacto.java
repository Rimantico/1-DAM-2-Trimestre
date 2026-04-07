package actividad2;

public class PersonaContacto implements Metodos {
	
	// Clase hecha por Juan Gómez Ruiz
	
	// Atributos
	
	private String nombre;
	private String cargoEmpresa;
	private String comentarios;
	private int telefono;
	private String email;
	
	// Constructor
	public PersonaContacto(String nombre, String cargoEmpresa, String comentarios, int telefono, String email) throws ValidarEmailException {
		super();
		this.nombre = nombre;
		this.cargoEmpresa = cargoEmpresa;
		this.comentarios = comentarios;
		this.telefono = telefono;
		validarEmail(email);
		this.email = email;
	}
	
	// Getters and Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCargoEmpresa() {
		return cargoEmpresa;
	}
	public void setCargoEmpresa(String cargoEmpresa) {
		this.cargoEmpresa = cargoEmpresa;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	// Metodos
	
	public void validarEmail(String email) throws ValidarEmailException {
		String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		
		if(!email.matches(regex)) {
			throw new ValidarEmailException("Email Invalido");
		}else
			System.out.println("Email correcto");
	}
	
	@Override
	public void acercaDe() {
		System.out.println("Autocares Juan");
		System.out.println("AP1231");	
	}

	@Override
	public String toString() {
		return "PersonaContacto [nombre=" + nombre + ", cargoEmpresa=" + cargoEmpresa + ", comentarios=" + comentarios
				+ ", telefono=" + telefono + ", email=" + email + "]";
	}
	
	

}
