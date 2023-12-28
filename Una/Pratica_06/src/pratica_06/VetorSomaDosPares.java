package pratica_06;

import java.util.Scanner;

public class VetorSomaDosPares {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int[] vet = new int[10];
		int i;
		int soma = 0;

		for (i = 0; i < vet.length; i++) {

			System.out.print("Informe o numero inteiro: ");
			vet[i] = in.nextInt();

			if (vet[i] % 2 == 0) {

				soma += vet[i];

			}
		}
		System.out.println("Vetores informados");
		for (i = 0; i < vet.length; i++) {

			System.out.printf("V[%d] = %2d\n", i, vet[i]);
		}
		System.out.println("A soma dos numeros pares é: " + soma);
	}

}
