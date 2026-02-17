package expresionesRegulares;

import java.util.regex.*;

public class Usuario {
	
	// Attributes
	
	private String nombre;
	private String telefono;
	private String codigoPostal;
	private String password;
	
	// Constructor
	
	public Usuario(String nombre, String telefono, String codigoPostal, String usuario, String password, String usuario1) {
		setNombre(nombre);
		setUsuario(usuario1);
		setTelefono(telefono);
		setCodigoPostal(codigoPostal);
		setPassword(password);
	}

	// Getters
	
	public String getNombre() {
		return nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public String getPassword() {
		return password;
	}
	
	// Methods
	
	public void setCodigoPostal(String codigoPostal) {
		// Codigo Postal
		String codPostalPatron = "\\d{5}";
		
		// Compilamos
		
		Pattern patronCodPostal = Pattern.compile(codPostalPatron);
		Matcher coinciden = patronCodPostal.matcher(codigoPostal);
		if(coinciden.matches()) {
			this.codigoPostal = codigoPostal;
		}else
			System.out.println("Código postal inválido: " + codigoPostal);
	}
	
	public void setPassword(String password) {
		String passwordRegex = ".+";
		
		Pattern passwordPatron = Pattern.compile(passwordRegex);
		Matcher coinciden = passwordPatron.matcher(password);
		if(coinciden.matches()) {
			this.password = password;
		}else
			System.out.println("Contraseña inválida: " + password);
	}
	
	public void setTelefono(String telefono) {
		String telefonoRegex = "[6-9]\\d{8}";
		
		Pattern telefonoPatron = Pattern.compile(telefonoRegex);
		Matcher coinciden = telefonoPatron.matcher(telefono);
		if(coinciden.matches()) {
			this.telefono = telefono;
		}else
			System.out.println("Telefono inválido: " + telefono);
	}
	
	public void setNombre(String nombre) {
		String nombreRegex = "^[A-Z][a-záéíóúñ]+(\\s[A-Z][a-záéíóúñ]+)+$";
		
		Pattern nombrePatron = Pattern.compile(nombreRegex);
		Matcher coinciden = nombrePatron.matcher(nombre);
		
	
		if(nombre.length()<= 100 && nombre.matches(nombreRegex)) {
			this.nombre = nombre;
		}else
			System.out.println("Nombre invalido: " + nombre);
	}
	
	public void setUsuario(String usuario) {
		String usuarioRegex ="[A-Za-z][a-zA-Z\\d_]{9}";
		
		Pattern usuarioPatron = Pattern.compile(usuarioRegex);
		Matcher coinciden = usuarioPatron.matcher(usuario);
		
		if(coinciden.matches()) {
		}else
			System.out.println("Usuario Incorrecto: " + usuario);
	}

}
