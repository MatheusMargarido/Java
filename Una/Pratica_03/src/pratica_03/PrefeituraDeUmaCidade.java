package pratica_03;
import java.util.Scanner;
public class PrefeituraDeUmaCidade {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		double salario;
		double somaSalario = 0;
		int filhos;
		int somaFilhos = 0;
		int numPessoas = 0;
		
		System.out.println("Coleta de dados de uma cidade");
		
		System.out.print("INFORME O SALARIO: ");
		 salario = in.nextDouble();

		while(salario>=0){
			System.out.print("INFORME O NUMERO DE FILHOS: ");
		    filhos = in.nextInt();
		    
		    somaSalario += salario;
		    somaFilhos+= filhos;
		    numPessoas++;
		    System.out.println("--------------------------------------------------");
		    System.out.print("INFORME O SALARIO: ");
			 salario = in.nextDouble();   
		}	
		if(numPessoas>0) {
			
			double mediaSalario = somaSalario/numPessoas;
			double mediaFilhos = (double) somaFilhos / numPessoas;
			 
			   System.out.println("--------------------------------------------------");
			   System.out.format("Média salarial da população: R$ %.2f\n", mediaSalario);
	           System.out.format("Média do número de filhos: %.1f\n", mediaFilhos);
		}else {
			System.out.println("nenhum dado coletado");
		}

	}

}
