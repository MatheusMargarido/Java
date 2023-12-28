package pratica_01;

import java.util.Scanner;

public class NumeroSalarioMinimos {

	public static void main(String[] args) {
		
		System.out.println("Calculo de quantos salarios minimos você recebe");
		
		Scanner input = new Scanner(System.in);
		Double salarioM, salarioA, numeroS;
		
		System.out.print("Digite o valor do salario minimo: ");
		salarioM = input.nextDouble();
		
		System.out.print("Digite o valor de seu salario: ");
		salarioA = input.nextDouble();
		
		numeroS = salarioA / salarioM;
		
		System.out.println("Voce recebe: "+numeroS+" salarios minimos.");

	}

}
