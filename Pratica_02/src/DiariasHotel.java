package pratica_02;

import java.util.Scanner;

public class DiariasHotel {

	public static void main(String[] args) {
		
		System.out.println("Calculo da diarias de um hotel");
		
		Scanner input = new Scanner(System.in);
		double valorT, diaria;
		
		System.out.print("Informe o numero de diarias: ");
		diaria = input.nextInt();
		
		if (diaria<15) {
			valorT = (diaria*500)+(diaria*15);
			System.out.format("Valor total: R$%.2f",valorT);
		}else if (diaria==15) {
			valorT = (diaria*500)+(diaria*10);
			System.out.format("Valor total: R$%.2f",valorT);
		}else {
			valorT = (diaria*500)+(diaria*5);
			System.out.format("Valor total: R$%.2f",valorT);
		}

	}

}
