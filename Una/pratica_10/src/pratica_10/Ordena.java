package pratica_10;

public abstract class Ordena {

	public static void Bolha(int vetor[]) {

		int aux;
		boolean controle;

		for (int i = 0; i < vetor.length; i++) {
			controle = true;
			for (int j = 0; j < (vetor.length - 1); j++) {
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
					controle = false;
				}
			}
			if (controle) {
				break;
			}
		}
		System.out.println("<< Bolha >>");
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("V[%d] = %d\n", i, vetor[i]);
		}
	}

	public static void Seleção(int vetor[]) {
		int menor_posição;
		int aux;
		for (int i = 0; i < vetor.length; i++) {
			menor_posição = i;
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[menor_posição]) {
					menor_posição = j;
				}
			}
			aux = vetor[menor_posição];
			vetor[menor_posição] = vetor[i];
			vetor[i] = aux;
		}
		System.out.println("<< seleção >>");
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("V[%d] = %d\n", i, vetor[i]);
		}
	}

	public static void Inserção(int[] vetor) {
		int aux;
		int j;
		for (int i = 1; i < vetor.length; i++) {
			aux = vetor[i];
			j = i - 1;
			while (j >= 0 && vetor[j] > aux) {
				vetor[j + 1] = vetor[j];
				j--;
			}
			vetor[j + 1] = aux;
		}
		System.out.println("<< inserção >>");
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("V[%d] = %d\n", i, vetor[i]);
		}
	}
}