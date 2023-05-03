package BuscaSequencial;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double vetor[] = new double[11];
		String confirma;

		for (int i = 0; i < vetor.length - 1; i++) {
			System.out.printf("Informe o valor do vetor[%d]: ", i);
			vetor[i] = in.nextDouble();

		}
		do {
			System.out.println("Informe o valor a ser procurado: ");
			double v = in.nextDouble();
			System.out.println("Selecione o tipo de busca \n(1)Sequencial (2)Sequencial com sentinela");
			int opção = in.nextInt();

			switch (opção) {
			case 1:
				MecanismoDeBusca.buscaSequencial(vetor, v);
				break;

			case 2:
				MecanismoDeBusca.buscaSequencialSentinela(vetor, v);
				break;
			default:
				System.out.println("Opção invalida.");
			}
			System.out.println("Gostaria de continuar? (S)im (N)ão");
			confirma = in.next();

		} while (confirma.equalsIgnoreCase("S") || confirma.equalsIgnoreCase("Sim"));
		in.close();

		System.out.println("<<Fin do programa>>");
		System.exit(0);

	}
}