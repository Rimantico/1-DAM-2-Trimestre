package barcos;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char[][] tablero = new char[5][5];
        boolean[][] barco = new boolean[5][5];
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Inicializar tablero
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tablero[i][j] = '~';
            }
        }

        // Colocar barco de tamaño 2 aleatoriamente
        boolean horizontal = rand.nextBoolean();
        int fila = rand.nextInt(5);
        int col = rand.nextInt(5);

        if (horizontal && col < 4) {
            barco[fila][col] = true;
            barco[fila][col + 1] = true;
        } else if (!horizontal && fila < 4) {
            barco[fila][col] = true;
            barco[fila + 1][col] = true;
        } else {
            barco[fila][col] = true;
            barco[fila][col - 1] = true;
        }

        int impactos = 0;

        // Juego
        while (impactos < 2) {
            mostrarTablero(tablero);

            System.out.print("Introduce fila (0-4): ");
            int f = sc.nextInt();
            System.out.print("Introduce columna (0-4): ");
            int c = sc.nextInt();

            if (f < 0 || f > 4 || c < 0 || c > 4) {
                System.out.println("❌ Coordenadas inválidas");
                continue;
            }

            if (tablero[f][c] != '~') {
                System.out.println("⚠️ Ya disparaste ahí");
                continue;
            }

            if (barco[f][c]) {
                tablero[f][c] = 'T';
                impactos++;
                System.out.println("🔥 ¡Tocado!");
            } else {
                tablero[f][c] = 'X';
                System.out.println("💦 Agua");
            }
        }

        mostrarTablero(tablero);
        System.out.println("🎉 ¡Has hundido el barco!");
        sc.close();
    }

    public static void mostrarTablero(char[][] tablero) {
        System.out.println("\nTablero:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
