package pratica_03;

import java.util.Scanner;

public class InformeMatriculaENotas {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String situação;
		int matricula;
		double nota1, nota2, nota3;

		System.out.println("Situação do aluno");

		System.out.print("Informe a maticula: ");
		matricula = in.nextInt();

		while (matricula >= 0) {

			System.out.print("Informe a primeira nota: ");
			nota1 = in.nextDouble();
			System.out.print("Informe a segunda nota: ");
			nota2 = in.nextDouble();
			System.out.print("Informe a terceira nota: ");
			nota3 = in.nextDouble();

			double media = (nota1 + nota2 + nota3) / 3;

			if (media >= 70) {
				situação = "aprovado";
			} else if (media > 60 && media < 70) {
				situação = "recuperaçao";
			} else {
				situação = "reprovado";
			}

			System.out.println("\nMatricula: " + matricula);
			System.out.println("Situação: " + situação);
			System.out.println("------------------------------");
			System.out.print("Informe a maticula: ");
			matricula = in.nextInt();

		}

	}

}
