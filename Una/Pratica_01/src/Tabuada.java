package pratica_01;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
	System.out.println("Tabuada");
		
		Scanner input = new Scanner(System.in);
		int numero ;
		int x = 0;
		
		
		System.out.print("Informe o valor para ver a tabuada: ");
		numero = input.nextInt();
		
		while (x <= 10) {
			int resultado = numero * x;
			System.out.println(numero + " X " + x + " = " + resultado);
			x++;
		
	      }

	}

}
