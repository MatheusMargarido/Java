package pratica_01;

import java.util.Scanner;

public class CotaçãoDolar {

	public static void main(String[] args) {

		System.out.println("Cotação do dolar e valor da carteira");
		
		Scanner input = new Scanner(System.in);
		double cdolar, vcarteirad, vcarteirar;
		
		System.out.print("Digite o valor do dolar em reais:  ");
		cdolar = input.nextDouble();
		
		System.out.print("Digite o valor de sua carteira em dolar:  ");
		vcarteirad = input.nextDouble();
		
		
		vcarteirar = vcarteirad * cdolar;
		
		
		System.out.format("Valor da carteira em reais: %.2f R$ ",vcarteirar );

	}

}
