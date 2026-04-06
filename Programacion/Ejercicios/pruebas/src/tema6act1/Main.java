package tema6act1;

public class Main {

	public static void main(String[] args) {
		Perro perro1 = new Perro("Juan" , "Labrador");
		Gato gato1 = new Gato("Helena", "Migata");
		
		perro1.moverse();
		perro1.hacerSonido();
		
		gato1.moverse();
		gato1.hacerSonido();
	}

}
