package BuscaBinaria;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double vetor[] = new double[10];
		String confirma;
		double numeroAnterior = 0;
		double numeroAtual = 0;

		System.out.println("Informe 10 n�meros, ordenadamente: ");

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = in.nextDouble();
			numeroAtual = vetor[i];
			if (numeroAtual < numeroAnterior) {
				System.out.println("A sequ�ncia n�o est� ordenada.");
				System.exit(0);
			}
			numeroAnterior = numeroAtual;
		}
		do {
			System.out.println("Informe o valor a ser procurado: ");
			double v = in.nextDouble();

			MecanismosDeBuscaBinaria.buscaBinaria(vetor, v);

			System.out.println("Gostaria de continuar? (Sim ou N�o)");
			confirma = in.next();

		} while (confirma.equalsIgnoreCase("Sim") || confirma.equalsIgnoreCase("S"));
		in.close();

		System.exit(0);
	}
}