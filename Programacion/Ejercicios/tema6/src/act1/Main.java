package act1;

public class Main {

	public static void main(String[] args) {
		Perro perro = new Perro("Juan","Perroza","Negro");
		Gato gato = new Gato("Helena","Gatoza","Blanca");
		
		System.out.println("GATO");
		gato.moverse();
		gato.hacerSonido();
		System.out.println();
		System.out.println("PERRO");
		perro.moverse();
		perro.hacerSonido();
		

	}

}
