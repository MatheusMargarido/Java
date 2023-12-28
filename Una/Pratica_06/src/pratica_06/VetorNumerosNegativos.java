package pratica_06;

import java.util.Scanner;

public class VetorNumerosNegativos {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double[] vetor = new double[10];
		int cont = 0;
		
		System.out.println("<<Vetor>>");
		for (int i = 0; i < vetor.length; i++) {

			System.out.printf("Informe o valor do vetor[%d]: ", i);
			vetor[i] = in.nextDouble();
		}
		System.out.println("\n<<Vetores com valores negativos>>");

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < 0) {
				System.out.printf("V[%d] = %.1f", i, vetor[i]);
				System.out.println();
				cont++;
			}
		}
		if (cont == 0) {
			System.out.println("Nenhum valor negativo encontrado");
		}
	}
}
