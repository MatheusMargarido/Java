package pratica_05;

import java.util.Scanner;

public class SexoEPeso10Pessoas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		
		int masc = 0;
		int fem = 0;

		for (int cont=1; cont <= 10;cont++) {

			System.out.println("--------------------------------------------------");

			System.out.println("Informe o sexo: \n(1)Masculino \n(2)Feminino");
			int sexo = in.nextInt();

			while (sexo != 1 && sexo != 2) {

				System.out.println("Informe o sexo: ");
				sexo = in.nextInt();
			}

			System.out.println("Informe o peso: ");
			double peso = in.nextDouble();

			while (peso < 0) {
				System.out.println("informe o peso: ");
				peso = in.nextDouble();
			}
			if (peso >= 60 && peso <= 80 && sexo == 1) {
				masc++;
			} else if (peso >= 50 && peso <= 70) {
				fem++;
			}
		

		}
		System.out.println("--------------------------------------------------");
		System.out.println("Numero de homens com o peso entre 60 e 80: " + masc);
		System.out.println("Numero de mulheres com peso entre 50 e 70: " + fem);

	}

}
