package BuscaBinaria;

public class MecanismosDeBuscaBinaria {

	public static int buscaBinaria(int vetor[], int v) {
		int esquerda = 0;
		int direita = vetor.length - 1;
		int comparação = 0;

		while (esquerda <= direita) {
			int meio = (esquerda + direita) / 2;
			comparação++;

			if (vetor[meio] == v) {
				System.out.printf("O valor foi encontrado na posição: V[%s]\nForam realizadas %d comparações",meio,comparação);
				return meio;
			} else if (vetor[meio] < v) {
				esquerda = meio + 1;
			} else {
				direita = meio - 1;
			}
		}

		System.out.println("O valor não foi encontrado.");
		return -1;
	}


		
	}

