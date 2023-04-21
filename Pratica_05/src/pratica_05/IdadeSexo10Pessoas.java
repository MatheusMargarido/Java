package pratica_05;

import java.util.Scanner;

public class IdadeSexo10Pessoas {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int fem = 0;

		for (int cont = 1; cont <= 10; cont++) {

			System.out.println("Contando quantas mulheres com mais de 20 e menos de 40 ");
			System.out.println("---------------------------------------------------");

			System.out.print("Informe a idade: ");
			int idade = in.nextInt();

			while (idade < 0) {
				System.out.println("Idade informada incorretamente");
				System.out.print("Informe a idade: ");
				idade = in.nextInt();
			}

			System.out.print("Informe o sexo:\n(1)Masculino\n(2)Feminino ");
			int sexo = in.nextInt();

			while (sexo != 1 && sexo != 2) {
				System.out.print("Informe o sexo:\n(1)Masculino\n(2)Feminino ");
				sexo = in.nextInt();

			}
			if (sexo == 2 && idade >= 20 && idade <= 40) {
				fem++;
			}

		}
		System.out.print("Numero de pessoas do sexo feminino com idades entre 20 e 40: " + fem+" pessoas");

	}

}
