package pratica_05;

import java.util.Scanner;

public class MaiorMenor10Inteiros {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int maiorNum = 0;
		int menorNum = 100000000;
		System.out.println("Informe 10 numeros positivos e veja o maior e o menor informado: ");

		for (int cont = 0; cont < 10;) {

			System.out.println("Informe o numero: ");
			int num = in.nextInt();

			if (num > 0) {
				cont++;
			} else {
				while (num < 0) {
					System.out.println("Numero informado incorretamente");
					System.out.println("Informe o numero: ");
					num = in.nextInt();
					if (num > 0) {
						cont++;
					}
				}
			}

			if (num > maiorNum) {
				maiorNum = num;
			}
			if (num < menorNum) {
				menorNum = num;
			}

		}
		System.out.println("Maior numero informado: " + maiorNum);
		System.out.println("menor numero informado: " + menorNum);

	}

}
