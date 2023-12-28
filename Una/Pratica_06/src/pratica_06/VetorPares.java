package pratica_06;
import java.util.Scanner;
public class VetorPares {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double[] vet = new double[10];
		int i;
		
		for(i=0;i<vet.length;i++) {
			
			System.out.print("Informe o valor do vetor: ");
			vet[i]=in.nextDouble();
		}
		
		System.out.println("\nElementos armazenados nas posiçoes pares");
		
		for(i=0;i<vet.length;i++) {
			
			if(i%2==0) {
				System.out.printf("V[%d] = %.1f\n",i,vet[i]);
			}
			
		}

	}

}
