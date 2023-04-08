package pratica_02;

import java.util.Scanner;

public class RecebaDoisNumeros {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double n1, n2, soma,mult,sub,div;
		
		System.out.println("Informe os numeros:");
		n1 = input.nextDouble();
		n2 = input.nextDouble();
		
		soma = n1+n2;
		mult = n1*n2;
		
		
		System.out.println("A soma desses numeros resulta em : "+soma);
		System.out.println("A multiplicação desse numeros resulta em: "+mult);
		
		if (n1>n2) {
			sub = n1-n2;
			System.out.println("A subtração do maior com o menor: "+sub);
		}else {
			sub = n2-n1;
			System.out.println("A subtração do maior com o menor: "+sub);
		}
		if (n2!=0) {
			div = n1/n2;
			System.out.format("A divisão do primeiro numero pelo segundo resulta em: %.2f ",div);
		}else {
			System.out.println("Não existe divisão por zero!");

		}
	}
}
