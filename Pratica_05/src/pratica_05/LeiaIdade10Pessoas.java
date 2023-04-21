package pratica_05;

import java.util.Scanner;

public class LeiaIdade10Pessoas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int soma = 0;

		for (int cont = 0; cont < 10 && cont >= 0; cont++) {

			System.out.println("Informe a idade: ");
			int idade = in.nextInt();

			while (idade < 0) {
				System.out.println("Idade informada incorretamente, insira novamente a idade");
				System.out.println("Informe a idade: ");
				idade = in.nextInt();
			}
			soma += idade;

		}
		double media = soma / 10;
		System.out.println("Media:" + media);

	}

}
