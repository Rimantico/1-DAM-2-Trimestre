package act15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DNI {

	private String dni;
	
	public DNI(String dni) throws ValidarDNIException{
		if(validarDNI(dni) == true) {
			this.dni = dni;
		}else
			throw new ValidarDNIException("DNI incorrecto, por favor introduzca otro");
	}

	public boolean validarDNI(String dni) {
		String regex = "^[0-9]{8}[A-Z]$";
		
		Pattern codigoPatron = Pattern.compile(regex);
		Matcher coincidir = codigoPatron.matcher(dni);

		if (coincidir.matches()) {
			return true;
		}else
			return false;
	}
}
