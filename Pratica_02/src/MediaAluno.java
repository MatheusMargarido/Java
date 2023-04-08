package pratica_02;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double nota1, nota2, media;
		
		System.out.println("PRIMEIRA NOTA: ");
		nota1 = in.nextDouble();
		
		System.out.println("SEGUNDA NOTA: ");
		nota2 = in.nextDouble();
		
		media = (nota1+nota2)/2;
		
		System.out.println("MEDIA: "+media);
		
		if (media>=7) {
			System.out.println("APROVADO");
		}else {
			System.out.println("REPROVADO");
		}
		
	}

}
