package act8;

public interface Validador {
	static boolean esMayorDeEdad(int edad) {
		if(edad >= 18) {
			return true;
		}else
			return false;
	};
	
	abstract void validar();
}
