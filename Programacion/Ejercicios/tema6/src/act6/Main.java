package act6;

public class Main {

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado(1,"Juan",1500);
		Empleado empleado2 = new Empleado(2,"Juan",1200);
		
		System.out.println("¿Son los dos empleados iguales?: " + comparacionObjetos(empleado1, empleado2));
		
		System.out.println("¿Se llaman los empleados igual?: " + comparacionNombres(empleado1, empleado2));
		

	}

	private static boolean comparacionNombres(Empleado empleado1, Empleado empleado2) {
		String nombreEmpleado1 = empleado1.getNombre();
		
		if(nombreEmpleado1.equals(empleado2.getNombre())) {
			return true;
		}else
			return false;
		
	
	}

	private static boolean comparacionObjetos(Empleado empleado1, Empleado empleado2) {
		boolean comparacion = empleado1.equals(empleado2);
		return comparacion;
		
	}

}
