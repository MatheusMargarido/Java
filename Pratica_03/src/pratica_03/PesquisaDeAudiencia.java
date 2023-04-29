package pratica_03;

import java.util.Scanner;

public class PesquisaDeAudiencia {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double cont12 = 0;
		double cont7 = 0;
		double cont5 = 0;
		double cont4 = 0;
		double cont2 = 0;
		double cont;
		double total = 0;
		int opcao;

		System.out.println("<<Pesquisa de audiencia>>");

		do {
			System.out.println("Informe o canal que esta assistindo: " + "(12) " + "(7) " + "(5) " + "(4) " + "(2) ");
			opcao = in.nextInt();

			switch (opcao) {
			case 12:
				System.out.println("O numero de pessoas incluindo você que estão assistindo: ");
				cont = in.nextInt();
				cont12 += cont;
				total += cont;
				break;

			case 7:
				System.out.println("O numero de pessoas incluindo você que estão assistindo: ");
				cont = in.nextInt();
				cont7 += cont;
				total += cont;
				break;

			case 5:
				System.out.println("O numero de pessoas incluindo você que estão assistindo: ");
				cont = in.nextInt();
				cont5 += cont;
				total += cont;
				break;

			case 4:
				System.out.println("O numero de pessoas incluindo você que estão assistindo: ");
				cont = in.nextInt();
				cont4 += cont;
				total += cont;
				break;

			case 2:
				System.out.println("O numero de pessoas incluindo você que estão assistindo: ");
				cont = in.nextInt();
				cont2 += cont;
				total += cont;
				break;

			default:
				System.out.println("Opção inválida!!!");
			}
			System.out.println("-----------------------------------------------------------------------");

		} while (opcao != 0);

		System.out.println("\n<<Percentual de audiencia>>\n");

		System.out.printf("canal 12: %.1f %%\n", cont12 * 100 / total);
		System.out.printf("canal 7: %.1f %%\n", cont7 * 100 / total);
		System.out.printf("canal 5: %.1f %%\n", cont5 * 100 / total);
		System.out.printf("canal 4: %.1f %%\n", cont4 * 100 / total);
		System.out.printf("canal 2: %.1f %%\n", cont2 * 100 / total);

	}

}
