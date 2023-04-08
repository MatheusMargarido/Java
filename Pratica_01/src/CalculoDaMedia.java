package pratica_01;

import java.util.Scanner;

public class CalculoDaMedia {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		
		System.out.print("nota 01: ");
		nota1 = input.nextDouble();
		
		System.out.print("nota 02: ");
		nota2 = input.nextDouble();
		
		System.out.print("nota 03: ");
		nota3 = input.nextDouble();
		
		media = (nota1 + nota2 + nota3)/3;
		
		System.out.format("media: %.2f", media);

	}

}
