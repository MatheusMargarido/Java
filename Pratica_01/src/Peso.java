package pratica_01;

import java.util.Scanner;

public class Peso {

	public static void main(String[] args) {

		System.out.println("Calculo do peso");
		
		Scanner input = new Scanner(System.in);
		double pesoA, peso15, peso20;
		
		System.out.print("Digite o seu peso atual: ");
		pesoA = input.nextDouble();
		
		peso15 = (pesoA * 0.15)+pesoA;
		peso20 = pesoA - (pesoA * 0.20);
		
		
		System.out.format("Peso com um aumento de 15 porcento: %.2fKgs.\nPeso com perda de 20 porcento: %.2fKgs.",peso15,peso20);
		

	}

}
