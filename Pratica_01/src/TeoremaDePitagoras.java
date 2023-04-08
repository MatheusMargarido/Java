package pratica_01;

import java.util.Scanner;

public class TeoremaDePitagoras {

	public static void main(String[] args) {

		System.out.println("Teorema de pitágoras");
		
		Scanner input = new Scanner(System.in);
		double cat01, cat02, hip;
		
		System.out.print("Digite o valor do primeiro cateto: ");
		cat01 = input.nextDouble();
		
		System.out.print("Digite o valor do segundo cateto: ");
		cat02 = input.nextDouble();
		
		hip  = Math.sqrt(Math.pow(cat01,2) + Math.pow(cat02,2));
		
		System.out.print("Valor da hipotenusa: "+hip);

	}

}
