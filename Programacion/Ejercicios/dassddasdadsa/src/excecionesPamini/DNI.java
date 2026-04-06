package excecionesPamini;

public class DNI {
	
	private String dni;
	
	public DNI(String dni) throws ValidarDNIException {
		validarDNI(dni);
		this.dni = dni;
	}
	
	public void validarDNI(String dni) throws ValidarDNIException {
		String regex = "^[0-9]{8}[A-Z]$";
		if(!dni.matches(regex))
			throw new ValidarDNIException("No se ha introducido un DNI valido");
	}

}
