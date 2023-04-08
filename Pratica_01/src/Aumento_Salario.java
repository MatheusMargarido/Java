package pratica_01;

import java.util.Scanner;

public class Aumento_Salario {

	public static void main(String[] args) {
			
			System.out.println("Aumento de 25% no salario");
			
			Scanner input = new Scanner (System.in);
			double sAtual, aumento;
			
			System.out.print("Valor salario:  ");
			sAtual = input.nextDouble();
			aumento = (sAtual* 0.25) + sAtual;
			
			System.out.format("Novo salario: %.2f R$" ,aumento);
		
		}
	
}
