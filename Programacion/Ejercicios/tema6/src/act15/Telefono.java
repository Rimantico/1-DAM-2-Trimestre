package act15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Telefono {

	// Attribute

	private String telefono;

	public Telefono(String telefono) throws ValidarTelefonoException {
		if (validarTelefono(telefono) == true) {
			this.telefono = telefono;
		} else
			throw new ValidarTelefonoException("Este numero de Telefono no es válido");
	}

	public boolean validarTelefono(String telefono) {
		String regex = "^(\\+34|0034|34)?[6789]\\d{8}$";

		Pattern codigoPatron = Pattern.compile(regex);
		Matcher coincidir = codigoPatron.matcher(telefono);

		if (coincidir.matches()) {
			return true;
		} else
			return false;
	}
}
