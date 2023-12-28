package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.HorasDeContrato;
import entities.Trabalhador;
import entities.enums.NivelDoTrabalhador;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

		System.out.print("Entre com o nome do departamento: ");
		String nomeDepartamento = sc.nextLine();

		System.out.println("insira os dados do trabalhador: ");

		System.out.print("Nome: ");
		String nomeTrabalhador = sc.nextLine();

		System.out.print("Nivel: ");
		String nivelTrabalhador = sc.nextLine();

		System.out.print("Base salarial: ");
		Double baseDeSalario = sc.nextDouble();

		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelDoTrabalhador.valueOf(nivelTrabalhador),
				baseDeSalario, new Departamento(nomeDepartamento));

		System.out.print("Quantos contratos esse trabalhador terá? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Entre com o #" + i + " dados do contrato");
			System.out.print("Data (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor Por Hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração (Horas): ");
			int horas = sc.nextInt();
			HorasDeContrato contrato = new HorasDeContrato(dataContrato, valorPorHora, horas);
			trabalhador.addContrato(contrato);
		}

		System.out.println();
		System.out.print("Entre com o mes e ano para calcular o salario (MM/YYYY): ");
		String mesEAno = sc.next();
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));

		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getName());
		System.out.println("Ganhos no mes: " + mesEAno + ": " + String.format("%.2f", trabalhador.renda(ano, mes)));

		sc.close();

	}

}
