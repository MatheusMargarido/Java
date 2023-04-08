package pratica_02;

import java.util.Scanner;

public class TipoDeHotel {

	public static void main(String[] args) {

		System.out.println("Valor da hospedagem");
		
		Scanner input = new Scanner(System.in);
		int dia,apto;
		
		System.out.println("Informe o tipo do apartamento:\n(1)Apto Simples\n(2)Apto Duplo");
		apto = input.nextInt();
		
		System.out.print("Informe os dias que ficou hospedado: ");
		dia = input.nextInt();
		
		if (apto==1 && dia<10) {
			double vt = dia*100;
			System.out.format("Valor total: R$%.2f",vt);
		}else if (apto==1 && dia>=10 && dia<=15) {
			double vt = dia*90;
			System.out.format("Valor total: R$%.2f",vt);
		}else if (apto==1 && dia>15) {
			double vt = dia*80;
			System.out.format("Valor total: R$%.2f",vt);
		}if (apto==2 && dia<10) {
			double vt = dia*140;
			System.out.format("Valor total: R$%.2f",vt);
		}else if (apto==2 && dia>=10 && dia<=15) {
			double vt = dia*120;
			System.out.format("Valor Total: R$%.2f",vt);
		}else if (apto==2 && dia>15) {
			double vt = dia*100;
			System.out.format("Valor Total: R$%.2f",vt);
		}
		
	}

}
