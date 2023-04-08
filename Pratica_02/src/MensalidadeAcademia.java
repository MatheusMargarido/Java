package pratica_02;

import java.util.Scanner;

public class MensalidadeAcademia {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int valor, sexo, idade;
		
		System.out.println("Informe o seu sexo\n(1)Masculino\n(2)Feminino");
		sexo = input.nextInt();
		
		System.out.print("Informe sua idade: ");
		idade = input.nextInt();
		
		if (sexo==1 && idade<15) {
			System.out.println("Valor da mensalidade: R$60,00");
		}else if (sexo==1 && idade>15 && idade<=18) {
			System.out.println("Valor da mensalidade: R$75,00");
		}else if (sexo==1 && idade>18 && idade<=30) {
			System.out.println("Valor da mensalidade: R$90,00");
		}else if (sexo==1 && idade>30 && idade<=40) {
			System.out.println("Valor da mensalidade: R$85,00");
		}else if (sexo==1 && idade>40) {
			System.out.println("Valor da mensalidade: R$80,00");
		}if (sexo==2 && idade<=18) {
			System.out.println("Valor da mensalidade: R$60,00");
		}else if (sexo==2 && idade>18 && idade<=25) {
			System.out.println("Valor da mensalidade: R$90,00");
		}else if (sexo==2 && idade>25 && idade<=40) {
			System.out.println("Valor da mensalidade: R$85,00");
		}else if (sexo==2 && idade>40) {
			System.out.println("Valor da mensalidade: R$80,00");
		}

	}

}
