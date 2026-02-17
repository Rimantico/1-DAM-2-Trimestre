package examenTema4b;

import examenTema4b.Cohete.TipoCombustible;
import examenTema4b.Cohete.TipoEncendido;

public class Main {

	public static void main(String[] args) {

		// Hecho por: Juan Gómez Ruiz

		// Creación de los objetos

		Cohete cohete1 = new Cohete("Puti", "ABCD 123456 78", TipoCombustible.HIDROGENOLIQUIDO,
				TipoEncendido.HIPERGOLICO, true);
		Quimico cohete2 = new Quimico("Sputnik", "ABCD 123456 78", TipoCombustible.HIDROGENOLIQUIDO,
				TipoEncendido.HIPERGOLICO, true, 10000);
		Electrico cohete3 = new Electrico("Apolo11", "ABCD 113326 78", TipoCombustible.HIDROGENOLIQUIDO,
				TipoEncendido.HIPERGOLICO, true);

		// Pruebas
		System.out.println("COHETE 1 (CLASE PADRE)");
		System.out.println("-----------------------");

		System.out.println(cohete1);
		System.out.println();
		cohete1.encenderMotor();
		System.out.println();
		cohete1.apagarMotor();
		System.out.println();
		System.out.println(cohete1);
		System.out.println();

		System.out.println("COHETE 2 (CLASE QUÍMICO)");
		System.out.println("-------------------------");

		System.out.println(cohete2);
		System.out.println();
		cohete2.encenderMotor();
		System.out.println();
		cohete2.apagarMotor();
		System.out.println();
		System.out.println(cohete2);
		System.out.println();
		cohete2.calcularTiempoLuna();

		System.out.println("COHETE 3 (CLASE ELÉCTRICO)");
		System.out.println("--------------------------");

		System.out.println(cohete3);
		System.out.println();
		cohete3.encenderMotor();
		System.out.println();
		cohete3.apagarMotor();
		System.out.println();
		System.out.println(cohete3);
		System.out.println();
		cohete3.calcularTiempoLuna();
	}

}
