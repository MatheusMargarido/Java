package pratica_05;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Informe o numero para ver a tabuada: ");
		int num = in.nextInt();

		for (int cont = 0; cont < 11; cont++) {

			int resultado = cont * num;
			System.out.println(+num + " X " + cont + " = " + resultado);

		}

	}

}
