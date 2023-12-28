package pratica_05;

import java.util.Scanner;

public class QuantidadeIndeterminadaInteiros {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		
		int maiorNum = 0;
		int menorNum = 1000000;

		for (;;) {
			
			System.out.println("Informe um numero: ");
			int num = in.nextInt();

			if (num > 0) {
				
			} else {
				break;
			}
			if (num > maiorNum) {
				maiorNum = num;
			}
			if (num < menorNum) {
				menorNum = num;
			}
		}
		System.out.println("Maior Numero informado: " + maiorNum);
		System.out.println("Menor Numero informado: " + menorNum);

	}

}
