package pratica_03;

import java.util.Scanner;

public class PesquisaDeAudiencia {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double canal2 = 0;
		double canal4 = 0;
		double canal5 = 0;
		double canal7 = 0;
		double canal12 = 0;
		double total = 0;
		
		System.out.println("pesquisa de audiencia");
		
		System.out.print("Informe o numero do canal: ");
		int canal = in.nextInt();
		
		while(canal == 12 || canal == 7 || canal == 5 || canal == 4 || canal == 2 ) {
		
			System.out.print("Numero de pessoas que estão assistindo: ");
			int pessoas = in.nextInt();
			
			total+=pessoas;
			
			if(canal == 12) {
				canal12+=pessoas;
			}else if(canal == 7) {
				canal7 += pessoas;
			}else if (canal == 5) {
				canal5 += pessoas;
			}else if (canal == 4) {
				canal4 += pessoas;
			}else {
				canal2+=pessoas;
			}
			
			System.out.println("----------------------------");
			System.out.print("Informe o numero do canal: ");
			canal = in.nextInt();
			
			
		}
		if (canal==0) {
			System.out.println("fim");	
			
		}
		System.out.println("-----------------------------------------");
		System.out.println("PERCENTUAL DE AUDIENCIA DA PESQUISA");
		System.out.format("CANAL 12: %.1f%%\n",(canal12*100/total));
		System.out.format("CANAL 7: %.1f%%\n",(canal7*100/total));
		System.out.format("CANAL 5: %.1f%%\n",(canal5*100/total));
		System.out.format("CANAL 4: %.1f%%\n",(canal4*100/total));
		System.out.format("CANAL 2: %.1f%%\n",(canal2*100/total));
	}

}
