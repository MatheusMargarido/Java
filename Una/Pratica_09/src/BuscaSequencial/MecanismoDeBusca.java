package BuscaSequencial;

public class MecanismoDeBusca {

	public static int buscaSequencial(double vetor[], double v) {
		int comparação = 0;
		for (int i = 0; i < vetor.length; i++) {
			comparação++;
			if (vetor[i] == v) {
				System.out.printf("V[%d]   //   Foram realizadas : %d comparações\n",i,comparação);
			}
		}
		System.out.println("O valor não foi encontrado.");
		return -1;
	}

	public static int buscaSequencialSentinela(double vetor[], double v) {
		vetor[vetor.length - 1] = v;
		int comparação = 0;
		for (int i = 0; i < vetor.length; i++) {
			comparação++;
			
			if (vetor[i] == v) {
				
				if (i == vetor.length - 1) {
					System.out.println("O valor foi encontrado na sentinela.\nForam realizadas: " + comparação + "comparações");

				} else {
					System.out.printf("V[%d]   //   Foram realizadas : %d comparações\n",i,comparação);
				}
			
			}
		}
		System.out.println("O valor não foi encontrado.");
		return -1;
	}

}
