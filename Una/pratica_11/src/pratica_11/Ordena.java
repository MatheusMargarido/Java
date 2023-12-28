package pratica_11;

public class Ordena {

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

	public static void quicksort(int[] vetor, int esquerda, int direita) {

		if (esquerda < direita) {
			int p = particao(vetor, esquerda, direita);
			quicksort(vetor, esquerda, p);
			quicksort(vetor, p + 1, direita);

		}

	}

	public static int particao(int[] vetor, int esquerda, int direita) {

		int meio = (int) (esquerda + direita) / 2;
		int pivot = vetor[meio];
		int i = esquerda - 1;
		int j = direita + 1;

		while (true) {
			do {
				i++;
			} while (vetor[i] < pivot);
			do {
				j--;
			} while (vetor[j] > pivot);
			if (i >= j) {
				return j;
			}
			int aux = vetor[i];
			vetor[i] = vetor[j];
			vetor[j] = aux;
		}
	}

	public static void mergeSort(int[] vetor) {
		if (vetor.length <= 1) {
			return;
		}

		int meio = vetor.length / 2;
		int[] esquerda = new int[meio];
		int[] direita = new int[vetor.length - meio];

		for (int i = 0; i < meio; i++) {
			esquerda[i] = vetor[i];
		}
		for (int i = meio; i < vetor.length; i++) {
			direita[i - meio] = vetor[i];
		}

		mergeSort(esquerda);
		mergeSort(direita);

		merge(esquerda, direita, vetor);
	}

	private static void merge(int[] left, int[] right, int[] array) {
		int leftLength = left.length;
		int rightLength = right.length;
		int i = 0, j = 0, k = 0;

		while (i < leftLength && j < rightLength) {
			if (left[i] <= right[j]) {
				array[k++] = left[i++];
			} else {
				array[k++] = right[j++];
			}
		}

		while (i < leftLength) {
			array[k++] = left[i++];
		}

		while (j < rightLength) {
			array[k++] = right[j++];
		}
	}
}
