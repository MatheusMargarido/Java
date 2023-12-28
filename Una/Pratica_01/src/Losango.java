package pratica_01;

import java.util.Scanner;

public class Losango {

	public static void main(String[] args) {

		System.out.println("Area de um losango");
		
		Scanner input = new Scanner(System.in);
		double dmaior, dmenor, area;
		
		System.out.print("Digite a diagonal maior: ");
		dmaior = input.nextDouble();
		
		System.out.print("Digite a diagonal menor: ");
		dmenor = input.nextDouble();
		
		area = (dmaior*dmenor)/2;
		
		System.out.format("A area do losango é: %.2f ",area);

	}

}
