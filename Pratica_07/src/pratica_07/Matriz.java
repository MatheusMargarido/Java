package pratica_07;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[][] matriz = new int[5][5];

		int i, j, temp;

		for (i = 0; i < matriz.length; i++)
			for (j = 0; j < matriz[i].length; j++) {

				System.out.print("Informe um numero: ");
				matriz[i][j] = in.nextInt();
			}
		System.out.println("\nMartriz informada");
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++)
				System.out.printf("%2d ", matriz[i][j]);
			System.out.println("");

		}
		System.out.println("\nIndice da linha par e a coluna impar");
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++)

				if (i % 2 == 0 && j % 2 == 1) {
					System.out.printf("%2d ", matriz[i][j]);
				}
			System.out.println();

		}
		System.out.println("\nMatriz transposta");
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++)
				System.out.printf("%2d ", matriz[j][i]);
			System.out.println();

		}
		System.out.println("\nTrocando os elementos da diagonal principal com a secundaria");
		for (i = 0; i < matriz.length; i++) {
			temp = matriz[i][i];
			matriz[i][i] = matriz[i][matriz.length - i - 1];
			matriz[i][matriz.length - i - 1] = temp;
		}
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				System.out.printf("%2d ", matriz[i][j]);
			}
			System.out.println();
		}

	}

}
