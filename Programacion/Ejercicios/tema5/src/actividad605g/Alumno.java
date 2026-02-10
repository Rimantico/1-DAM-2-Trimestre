package actividad605g;

public class Alumno {
	
	// Attributes
	
	private String dni;
	private String nombre;
	private int edad;
	
	public Alumno(String dni , String nombre , int edad) {
		if(dni.length() > 9  || dni.length()<9) {
			System.out.println("El dni debe de tener 9 digitos");
		}else
			this.dni = dni;

		
		this.nombre = nombre;
		this.edad = edad;
	}
	
	// Getters

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
	
	

}
