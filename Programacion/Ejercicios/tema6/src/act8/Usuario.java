package act8;

public class Usuario implements Validador{

	private String nombre;
	private int edad;
	
	public Usuario(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	// Methods

	@Override
	public void validar() {
		if(edad >= 18) {
			System.out.println(nombre + " es mayor de edad");
		}else
			System.out.println(nombre + " es menor de edad");
		
	}
	
}
