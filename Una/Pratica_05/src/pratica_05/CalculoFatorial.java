package pratica_05;
import java.util.Scanner;
public class CalculoFatorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe um numero natural: ");
		int num = in.nextInt();
		
		while(num<0) {
			System.out.println("Numero invalido");
			System.out.println("Informe um numero natural: ");
			num = in.nextInt();
		}
		int fatorial = 1;
		
		for(int i = 1; i <=num; i++) {
			fatorial *= i;	
		}
		System.out.println("fatorial do numero informado: "+fatorial);

	}

}
