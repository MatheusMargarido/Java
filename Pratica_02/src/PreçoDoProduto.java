package pratica_02;

import java.util.Scanner;

public class PreçoDoProduto {

	public static void main(String[] args) {
		
		System.out.println("Receber o codigo do produto e informar o valor");
		
		Scanner input = new Scanner(System.in);
		int codigo;
		
		System.out.print("Digite o codigo do produto: ");
		codigo = input.nextInt();
		
		switch (codigo) {
		case 1:
			System.out.println("Sapato = R$ 99,99");
			break;
		case 2 : 
			System.out.println("Bolsa = R$ 103,89");
			break;
		case 3 : 
			System.out.println("Camisa = R$ 49,98");
			break;
		case 4 : 
			System.out.println("Calça = R$ 89,72");
			break;
		case 5 : 
			System.out.println("Blusa = R$ 97,35");
			break;
		default:
			System.out.println("Codigo incorreto");
		}
		
	}

}
