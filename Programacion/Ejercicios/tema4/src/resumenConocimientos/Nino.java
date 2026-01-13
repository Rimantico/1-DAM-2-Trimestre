package resumenConocimientos;

public class Nino {

	// Atributo de la clase
	public static int capacidadGuarderia = 20;
	public static int ninosComedor = 0;
	public static int nino = 0;
	public static int nina = 0;

	// Atributos

	private String nombre;
	private int edad;
	private char sexo;
	private String nombrePadre;
	private String nombreMadre;
	private String contactoPadre;
	private String contactoMadre;
	private String contactoAutorizado;
	private String observaciones;
	private boolean comida;

	// Constructores

	public Nino(String nombre, int edad, char sexo, String nombrePadre, String nombreMadre, String contactoPadre,
			String contactoMadre, String contactoAutorizado, String observaciones, boolean comida) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.nombrePadre = nombrePadre;
		this.nombreMadre = nombreMadre;
		this.contactoPadre = contactoPadre;
		this.contactoMadre = contactoMadre;
		this.contactoAutorizado = contactoAutorizado;
		this.observaciones = observaciones;
		this.comida = comida;
		quitarPlaza();
		comedor();
		comprobarSexo();
	}

	// Métodos para el atributo de la clase

	public void quitarPlaza() {
		if (capacidadGuarderia == 0) {
			System.out.println("La guardería esta llena. Por favor venga mas tarde");
		} else
			capacidadGuarderia--;
	}

	public void aumentarPlaza() {
		if (capacidadGuarderia == 20) {
			System.out.println("Nuestro numero de plazas máxima es de 20 niños");
		} else
			capacidadGuarderia++;
	}

	public void comedor() {
		if (comida == true) {
			ninosComedor++;
		}
	}

	public  void comprobarSexo() {
		if (sexo == 'M') {
			nino++;
		} else {
			if (sexo == 'F') {
				nina++;
			} else
				System.out.println("Has introducido un sexo invalido");

		}
	}

	// Getters y Setters

	public static int getCapacidadGuarderia() {
		return capacidadGuarderia;
	}

	public static void setCapacidadGuarderia(int capacidadGuarderia) {
		Nino.capacidadGuarderia = capacidadGuarderia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombrePadre() {
		return nombrePadre;
	}

	public void setNombrePadre(String nombrePadre) {
		this.nombrePadre = nombrePadre;
	}

	public String getNombreMadre() {
		return nombreMadre;
	}

	public void setNombreMadre(String nombreMadre) {
		this.nombreMadre = nombreMadre;
	}

	public String getContactoPadre() {
		return contactoPadre;
	}

	public void setContactoPadre(String contactoPadre) {
		this.contactoPadre = contactoPadre;
	}

	public String getContactoMadre() {
		return contactoMadre;
	}

	public void setContactoMadre(String contactoMadre) {
		this.contactoMadre = contactoMadre;
	}

	public String getContactoAutorizado() {
		return contactoAutorizado;
	}

	public void setContactoAutorizado(String contactoAutorizado) {
		this.contactoAutorizado = contactoAutorizado;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public boolean isComida() {
		return comida;
	}

	public void setComida(boolean comida) {
		this.comida = comida;
	}

	// Métodos

	@Override
	public String toString() {
		System.out.println("Nombre del Niño: " + nombre);
		System.out.println("Nombre del Padre: " + nombrePadre);
		System.out.println("Nombre de la Madre: " + nombreMadre);
		System.out.println("Contacto del Padre: " + contactoPadre);
		System.out.println("Contacto de la Madre: " + contactoMadre);
		System.out.println("Contacto Autorizado: " + contactoAutorizado);
		System.out.println("Observaciones: " + observaciones);
		System.out.println("Comida: " + comida);
		return super.toString();
	}
	public void mostrarNombre() {
		System.out.println("El nombre del niño es " + nombre);
	}

	public void plazasLibres() {
		System.out.println("Plazas Libres Actuales: " + capacidadGuarderia);

	}

	public void totalNino() {
		int total = 20 - capacidadGuarderia;
		System.out.println("El total de niños que hay es de " + total);

	}

}
