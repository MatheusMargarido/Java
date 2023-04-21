package pratica_06;

import java.util.Scanner;

public class VetorMaiorEMenorNumero {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double[] vet = new double[10];
		int i;

		double mVetor = 0;
		double meVetor = 100000;

		for (i = 0; i < vet.length; i++) {

			System.out.print("Informe o numero: ");
			vet[i] = in.nextDouble();

			if (vet[i] > mVetor) {
				mVetor = vet[i];

			}
			if (vet[i] < meVetor) {
				meVetor = vet[i];
			}

		}

		for (i = 0; i < vet.length; i++) {

			if (vet[i] == mVetor) {
				System.out.printf("\nMaior Vetor informado\nV[%d] = %.1f\n", i, vet[i]);
			}
			if (vet[i] == meVetor) {
				System.out.printf("\nMenor Vetor informado\nV[%d] = %.1f\n", i, vet[i]);
			}

		}

	}

}
