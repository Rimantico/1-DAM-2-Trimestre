package parte1main;

import parte1.*;

public class Main {

	public static final int DISTANCIATIERRALUNA = 384400;
	public static final int VELOCIDADCOHETE = 28000;
	
	public static void main(String[] args) {
		
		
		// CREAR OBJETOS CLASE COHETE ESPACIAL (PADRE)
		System.out.println("CREACIÓN Y CÁLCULO DE COHETES");
		CoheteEspacial coheteEspacial = new CoheteEspacial("SPX5000","ACDE 098765 22","HIDROGENOLIQUIDO","ELECTRICO");

		coheteEspacial.visualizarDatos();
		coheteEspacial.encenderMotor();
		coheteEspacial.apagarMotor();
		
		// CREAR OBJETOS CLASE COHETE QUÍMICO (HIJA)
		CoheteQuimico coheteQuimico = new CoheteQuimico("SPX5010","BJHQ 121212 77","QUEROSENOREFINADO","PIROGENICO");
		
		coheteQuimico.visualizarDatos();
		System.out.println("El gasto del cohete químico es: " + coheteQuimico.getGastoKg());
		
		// CREAR OBJETOS CLASE COHETE ELÉCTRICO (HIJA)
		CoheteElectrico coheteElectrico = new CoheteElectrico("SPX5020","LOPI 987634 00","METANOLIQUIDO","HIPERGOLICO");
		
		coheteElectrico.visualizarDatos();
		System.out.println("El gasto del cohete químico es: " + coheteElectrico.getGastoKg());

		// VARIABLE CÁLCULO DE VELOCIDAD KM/H
		int velocidadTotalKMH = DISTANCIATIERRALUNA / VELOCIDADCOHETE;
		System.out.println("El tiempo que tarda el cohete a la luna es: " + velocidadTotalKMH + " Km/H.");

	}

}
