package pratica_02;

import java.util.Scanner;

public class TipoDoTriangulo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double l1,l2,l3;
		
		System.out.println("Informe o primeiro lado: ");
		l1 = in.nextDouble();
		
		System.out.println("Informe o segundo lado: ");
		l2 = in.nextDouble();
		
		System.out.println("Informe o terceiro lado: ");
		l3 = in.nextDouble();
		
		if(l1==l2 && l2==l3) {
			System.out.println("TRIANGULO EQUILÁTERO");
		}else if (l1 == l2 || l1 == l3 || l2 == l3) {
			System.out.println("TRIANGULO ISÓRCELES");
		}else {
			System.out.println("TRIANGULO ESCALENO");
		}

	}

}
