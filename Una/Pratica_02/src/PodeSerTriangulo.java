package pratica_02;

import java.util.Scanner;

public class PodeSerTriangulo {

	public static void main(String[] args) {
		
System.out.println("Verificando se um triangulo é valido");
		
		Scanner in = new Scanner(System.in);
		double a,b,c;
		
		System.out.println("Informe os lados do triângulo");
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		
		if(a <(b+c) && b<(c+a) && c<(b+a)) {
			System.out.println("O triangulo é valido");
		} else {
			System.out.println("O triangulo não é valido");
		}
		
	}

}
