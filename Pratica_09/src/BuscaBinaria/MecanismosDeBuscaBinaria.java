package BuscaBinaria;

public class MecanismosDeBuscaBinaria {

	public static int buscaBinaria(double vetor[], double v) {
		int esquerda = 0;
		int direita = vetor.length - 1;
		int comparação = 0;

		while (esquerda <= direita) {
			int meio = (esquerda + direita) / 2;
			comparação++;

			if (vetor[meio] == v) {
				System.out.println("O valor foi encontrado na posi��o: " + meio + "\n" + "Foram realizadas "
						+ comparação + " compara��es");
				return meio;
			} else if (vetor[meio] < v) {
				esquerda = meio + 1;
			} else {
				direita = meio - 1;
			}
		}

		System.out.println("O valor n�o foi encontrado.");
		return -1;
	}
}
