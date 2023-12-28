package pratica_05;

import java.util.Scanner;

public class NumerosImpares {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		

		System.out.println("ver os numeros ímpares entre o 0 e o numero escolhido: ");
		int num = in.nextInt();

		for (int i = 1; i <= num; i++) {

			if (i % 2 == 1) {
				System.out.print(i+", ");
			}
		}

	}

}
