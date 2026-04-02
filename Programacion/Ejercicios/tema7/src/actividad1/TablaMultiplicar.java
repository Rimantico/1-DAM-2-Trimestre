package actividad1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		File tablaMultiplicar = new File("tablaMultiplicar.txt");
		
		try {
			tablaMultiplicar.createNewFile();
		} catch (IOException e) {
			System.out.println("Error");
		}
		
		
		
		
		System.out.print("Introduzca un número entero superior a cero para calcular su tabla de multiplicar: ");
		int numero = Integer.parseInt(sc.nextLine());
		
		if(numero<= 0 ) {
			System.out.println("Introduzca un número válido");
		}else {
			try {
				PrintWriter escribir = new PrintWriter(new FileWriter("tablaMultiplicar.txt", true));
				System.out.println("Tabla del " + numero);
				for(int i = 1 ; i<=10; i++ ) {
					int resultado = numero * i;
                    escribir.println(i + " * " + numero + " : " + resultado);
                    
				}
				
				escribir.println("------------");
				escribir.close();
			} catch (IOException e) {
				System.out.println("error");
			}
			
		}

		sc.close();
	}

}
