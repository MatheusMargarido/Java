package atividade_poo2;

import java.util.Scanner;
import java.util.Calendar;

public class Principal {

	public static void main(String[] args) {

		Pessoa[] pessoa = new Pessoa[10];
		Data data = new Data(0, 00, 0000);
		Scanner in = new Scanner(System.in);
		Calendar c = Calendar.getInstance();
		int cont = 0;

		for (int i = 0; i < pessoa.length; i++) {
			pessoa[i] = new Pessoa();
			cont++;
			System.out.printf("CADASTRO %2d \n", i + 1);
			System.out.print("NOME: ");
			pessoa[i].setNome(in.next());

			System.out.print("SOBRENOME: ");
			pessoa[i].setSobrenome(in.next());

			if (i > 0 && pessoa[i].getNome().equalsIgnoreCase(pessoa[i - 1].getNome())
					&& pessoa[i].getSobrenome().equalsIgnoreCase(pessoa[i - 1].getSobrenome())) {
				System.out.println("NOME REGISTRADO 2 VEZES");
				System.out.println();
				break;
			} else {

				System.out.print("DATA DE NASCIMENTO (dd/mm/yyyy): ");
				String datadigitada = in.next();
				String[] dataSplit = datadigitada.split("/");
				data.setDia(Integer.parseInt(dataSplit[0]));
				data.setMes(Integer.parseInt(dataSplit[1]));
				data.setAno(Integer.parseInt(dataSplit[2]));
				c.set(Calendar.YEAR, data.getAno());
				c.set(Calendar.MONTH, data.getMes()-1);
				c.set(Calendar.DAY_OF_MONTH, data.getDia());
				pessoa[i].setDataNasc(c);
				pessoa[i].setidadeAtual(pessoa[i].calculaIdade());

				System.out.print("ALTURA: ");
				pessoa[i].setAltura(in.nextDouble());

				System.out.print("PESO: ");
				pessoa[i].setPeso(in.nextDouble());

				double imc = pessoa[i].calculaImc();
				String situacao = pessoa[i].informarObesidade();
				System.out.println();
			}
		}

		System.out.println("--- INFORMAÇÕES ---\n");
		if (cont != 10) {
			for (int i = 0; i < cont - 1; i++) {

				System.out.printf("<< Cadastro %d >>\n", i + 1);
				System.out.printf("Nome completo: %s %s\n", pessoa[i].getNome(), pessoa[i].getSobrenome());
				System.out.printf("Nome de referencia: %s, %s\n", pessoa[i].getSobrenome(),pessoa[i].getNome().toUpperCase());
				System.out.printf("Idade: %.0f\n", pessoa[i].getidadeAtual());
				System.out.printf("Peso: %.1f:\n", pessoa[i].getPeso());
				System.out.printf("Altura: %.2f\n", pessoa[i].getAltura());
				System.out.printf("IMC: %.2f\n", pessoa[i].getImc());
				System.out.printf("Classificação corporal: %s\n", pessoa[i].getSituação());
				System.out.println();
			}

		} else {
			for (int i = 0; i < (pessoa.length); i++) {

				System.out.printf("<< Cadastro %d >>\n", i + 1);
				System.out.printf("Nome completo: %s %s\n", pessoa[i].getNome(), pessoa[i].getSobrenome());
				System.out.printf("Nome de referencia: %s, <%s>\n", pessoa[i].getSobrenome(),
						pessoa[i].getNome().toUpperCase());
				System.out.printf("Idade: %.0f\n", pessoa[i].getidadeAtual());
				System.out.printf("Peso: %.1f:\n", pessoa[i].getPeso());
				System.out.printf("Altura: %.2f\n", pessoa[i].getAltura());
				System.out.printf("IMC: %.2f\n", pessoa[i].getImc());
				System.out.printf("Classificação corporal: %s\n", pessoa[i].getSituação());
				System.out.println();
			}
		}
	}
}
