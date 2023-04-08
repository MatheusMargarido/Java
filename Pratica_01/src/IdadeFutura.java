package pratica_01;

import java.util.Scanner;

public class IdadeFutura {

	public static void main(String[] args) {

		System.out.println("Idade atual e idade futura");
		
		Scanner input = new Scanner(System.in);
		int anoatual, idade2050, anonasc, idadeatual;
		
		System.out.print("Informe o seu ano de nascimento: ");
		anonasc = input.nextInt();
		
		System.out.print("Informe o seu ano atual: ");
		anoatual = input.nextInt();
		
		idadeatual = anoatual - anonasc;
		idade2050 = 2050 - anonasc;
		
		System.out.print("Idade atual: "+idadeatual+" anos. \nIdade 2050: " +idade2050+" anos.");

	}

}
