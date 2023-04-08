package pratica_02;

import java.util.Scanner;

public class MediaDeTresNotas {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double n1, n2, n3, media;
		
		System.out.println("INFORME A PRIMEIRA NOTA ");
		n1 = in.nextDouble();
		
		System.out.println("INFORME A SEGUNDA NOTA ");
		n2 = in.nextDouble();
		
		System.out.println("INFORME A TERCEIRA NOTA ");
		n3 = in.nextDouble();
		
		media = (n1+n2+n3)/3;
		
		
		if (n1<0 || n1>10 || n2<0 || n2>10 || n3<0 || n3>10) {
			System.out.println("INFORMAÇÃO INVALIDA");
		}else {
			System.out.println("MEDIA: "+media);
		}
		if (media>=0 && media<3) {
			System.out.println("REPROVADO");
		}else if(media>=3 && media<7) {
			System.out.println("EXAME");
		}else {
			System.out.println("APROVADO");
		}

	}

}
