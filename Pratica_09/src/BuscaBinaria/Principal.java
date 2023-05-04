package BuscaBinaria;

import java.util.Scanner;
import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int vetor[] = new int[10];
		String confirma;

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Informe um numero[%d]: ", i);
			vetor[i] = in.nextInt();

		}
		Arrays.sort(vetor);
		System.out.println();
		do {
			System.out.println("Informe o valor a ser procurado: ");
			int v = in.nextInt();

			MecanismosDeBuscaBinaria.buscaBinaria(vetor, v);

			System.out.println("Gostaria de continuar? (Sim ou Não)");
			confirma = in.next();

		} while (confirma.equalsIgnoreCase("Sim") || confirma.equalsIgnoreCase("S"));
		
		in.close();
		System.exit(0);
	}
}