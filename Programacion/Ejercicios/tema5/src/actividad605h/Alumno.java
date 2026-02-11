package actividad605h;

public class Alumno {
	
	// Attributes
	
	private String dni;
	private String nombre;
	private int edad;
	private double nota = -1;
	
	public Alumno(String dni , String nombre , int edad) {
		if(dni.length() > 9  || dni.length()<9) {
			System.out.println("El dni debe de tener 9 digitos");
		}else
			this.dni = dni;
		if(nombre.isEmpty()) {
			System.out.println("Por favor, Introduzca un nombre valido");			
		}else
			this.nombre = nombre;
		if(edad < 0 ) {
			System.out.println("La edad no puede ser un número negativo");
		}else
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
	
	// Methods
	
	@Override
	public String toString() {
		if(nota == -1) {
			System.out.println("La nota no se ha introducido todavía");
		}
		return "DNI: " + dni + "\n" + "Nombre: " + nombre + "\n" + "Edad: " + edad + "\n" + "Nota: "  + nota;
	}
	

}
