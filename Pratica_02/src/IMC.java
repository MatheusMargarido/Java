package pratica_02;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		double peso,altura,imc;
		
		System.out.println("INFORME O PESO: ");
		peso = in.nextDouble();
		
		System.out.println("INFORME A ALTURA: ");
		altura = in.nextDouble();
		
		imc = peso/(Math.pow(altura, 2));
		
		System.out.format("IMC: %.1f\n",imc);
		
		if (imc<20) {
			System.out.println("ABAIXO DO PESO");
		}else if(imc>19 && imc<26) {
			System.out.println("PESO NORMAL");
		}else if(imc>25 && imc<31) {
			System.out.println("SOBREPESO");
		}else {
			System.out.println("OBESIDADE");
		}

	}

}
