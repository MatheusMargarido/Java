package pratica_11;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int[] vetor = new int[10];
		Scanner in = new Scanner(System.in);
		int opção = 1;

		while (opção == 1) {
			System.out.println("Informe o vetor os valores do vetor");

			for (int i = 0; i < vetor.length; i++) {
				System.out.printf("[%d] = ", i);
				vetor[i] = in.nextInt();
			}
			System.out.println("\nInforme o metodo de ordenação que deseja");
			System.out.println("1 - Bolha");
			System.out.println("2 - Inserção");
			System.out.println("3 - Seleção");
			System.out.println("4 - Quicksort");
			System.out.println("5 - MergeSort");
			System.out.print("Opção: ");

			int resposta = in.nextInt();

			switch (resposta) {

			case 1:
				Ordena.Bolha(vetor);
				System.out.println();
				break;

			case 2:
				Ordena.Inserção(vetor);
				System.out.println();
				break;

			case 3:
				Ordena.Seleção(vetor);
				System.out.println();
				break;

			case 4:
				Ordena.quicksort(vetor, 0, vetor.length - 1);
				for (int i = 0; i < vetor.length; i++) {
					System.out.printf("V[%d] = %d\n", i, vetor[i]);
				}
				System.out.println();
				break;
			
			case 5:
				System.out.println();
				Ordena.mergeSort(vetor);
				for (int i = 0; i < vetor.length; i++) {
					System.out.printf("V[%d] = %d\n", i, vetor[i]);
				}
				System.out.println();
				break;

			default:
				System.out.println("Numero informado incorretamente!!");
				System.out.println();
				break;
			}

			System.out.println("1 - Informar outro vetor");
			System.out.println("2 - Encerrar");
			opção = in.nextInt();
		}
		System.out.println("Fim do programa");

		in.close();
	}

}
