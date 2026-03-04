package act6;

public class Empleado {
	
	// Attributes
	
	private int id;
	private String nombre;
	private int salario;
	
	public Empleado(int id, String nombre, int salario) {
		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	

}
