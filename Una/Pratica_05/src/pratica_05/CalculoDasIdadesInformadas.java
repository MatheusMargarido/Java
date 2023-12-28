package pratica_05;

import java.util.Scanner;

public class CalculoDasIdadesInformadas {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int soma = 0;
		int cont = 0;
		int idade = 0;

		for (;;) {
			System.out.println("Informe a idade: ");
			idade = in.nextInt();

			if (idade < 0) {
				break;
			} else {
				soma += idade;
				cont++;
			}

		}if(cont == 0) {
			System.out.println("Não foram informados idades validas.");
		}else {
			double media = (soma/cont);
			System.out.println("A media das idades é: "+media);
		}

	}

}
