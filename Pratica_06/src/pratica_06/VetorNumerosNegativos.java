package pratica_06;

import java.util.Scanner;

public class VetorNumerosNegativos {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double[] vet = new double[10];
		int i;

		for (i = 0; i < vet.length; i++) {

			System.out.println("Informe o numero: ");
			vet[i] = in.nextDouble();

		}
		System.out.println("Vetores informados com numeros negativos");
		for (i = 0; i < vet.length; i++) {
			if (vet[i] < 0) {
				System.out.printf("V[%d] = %.1f\n", i, vet[i]);
			}

		}

	}

}
