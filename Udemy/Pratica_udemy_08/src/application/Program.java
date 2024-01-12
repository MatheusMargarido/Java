package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Tax payer #" + i + " data");

			System.out.print("Individual or Company (i|c)? ");
			char r = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			if (r == 'i') {
				System.out.print("Health expenditures: ");
				double healthEx = sc.nextDouble();
				list.add(new PessoaFisica(name, anualIncome, healthEx));
			} else {
				System.out.print("Number of employees: ");
				int emp = sc.nextInt();
				list.add(new PessoaJuridica(name, anualIncome, emp));
			}

		}
		System.out.println();
		System.out.println("TAXES PAID: ");
		double soma = 0.0;
		for (Pessoa p : list) {
			System.out.printf("%s: $ %.2f%n", p.getNome(), p.calculoImposto());
			soma += p.calculoImposto();
		}
		System.out.printf("\nTOTAL TAXES: %.2f", soma);
		sc.close();
	}

}
