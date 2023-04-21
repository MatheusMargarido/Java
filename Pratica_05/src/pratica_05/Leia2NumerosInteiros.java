package pratica_05;

import java.util.Scanner;

public class Leia2NumerosInteiros {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("numeros entre os informados");
		System.out.println("Primeiro numero: ");
		int num1 = in.nextInt();

		System.out.println("Segundo numero: ");
		int num2 = in.nextInt();

		while (num2 < num1) {
			System.out.println("Digite o menor numero inteiro primeiro");
			System.out.println("Primeiro numero: ");
			num1 = in.nextInt();

			System.out.println("Segundo numero: ");
			num2 = in.nextInt();
		}

		for (int i = num1; i <= num2; i++) {
			System.out.print(i+", ");
		}

	}

}
