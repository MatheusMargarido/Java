package pratica_03;

import java.util.Scanner;

public class NotaFinalFaltas {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int alunos = 0;
		int notaM90 = 0;
		int reprovados = 0;
		double soma = 0;
		double maiorNota = 0;
		double menorNota = 100;

		System.out.println("Nota final e o total de faltas de um conjunto indeterminado de alunos\n");

		System.out.print("Informe a nota final: ");
		double nota = in.nextDouble();

		System.out.print("Informe o total de faltas: ");
		double faltas = in.nextDouble();

		while (nota >= 0 && faltas >= 0) {

			alunos++;
			soma += nota;

			if (nota > 90) {
				notaM90++;
			}
			if (nota < 70 || faltas > 20) {
				reprovados++;
			}
			if (nota > maiorNota) {
				maiorNota = nota;

			}
			if (nota < menorNota && nota >= 0) {
				menorNota = nota;
			}

			System.out.println("----------------------------------");
			System.out.print("Informe a nota final: ");
			nota = in.nextDouble();

			System.out.print("Informe o total de faltas: ");
			faltas = in.nextDouble();

		}

		double media = soma / alunos;

		System.out.format(
				"\n* Numero de notas maiores que 90: %d\n* Numero de reprovados: %d\n* Maior nota: %.1f\n* Menor nota: %.1f\n* Media: %.2f",
				notaM90, reprovados, maiorNota, menorNota, media);
	}

}
