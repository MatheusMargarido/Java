package pratica_10;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int vetor[] = new int[10];
		String repetir, repetirOrdenação;

		do {
			System.out.println("Informe os valores\n");
			for (int i = 0; i < vetor.length; i++) {
				System.out.printf("V[%d] = ", i);
				vetor[i] = in.nextInt();
			}
			do {
				System.out.println("\nInforme o metodo que deseja ordenar o vetor\n(1) Bolha\n(2)Seleção\n(3)Inserção");
				int resposta = in.nextInt();

				switch (resposta) {
				case 1:
					Ordena.Bolha(vetor);
					break;
				
				case 2:
					Ordena.Seleção(vetor);
					break;
				
				case 3:
					Ordena.Inserção(vetor);
					break;

				default:
					System.out.println("Numero informado incorretamente");
				}
				System.out.println("\nDeseja usar outro metodo de ordenação?\n(S)im (N)ão");
				repetirOrdenação = in.next();
			} while (repetirOrdenação.equalsIgnoreCase("s") || repetirOrdenação.equalsIgnoreCase("sim"));

			System.out.println("Deseja informar outro vetor?\n(S)im (N)ão");
			repetir = in.next();

		} while (repetir.equalsIgnoreCase("s") || repetir.equalsIgnoreCase("sim"));
		in.close();
		System.out.println("<<fim do programa>>");

	}

}
