package atividade_poo2;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
				
		Pessoa pessoa = new Pessoa();
		Scanner in = new Scanner(System.in);
		
		System.out.println("--- DADOS ---");
		
		System.out.print("NOME: ");	
		pessoa.setNome(in.next());
		
		System.out.print("SOBRENOME: ");
		pessoa.setSobrenome(in.next());
		
		System.out.print("IDADE: ");
		pessoa.setIdade(in.nextInt());
		
		System.out.print("ALTURA: ");
		pessoa.setAltura(in.nextDouble());
		
		System.out.print("PESO: ");
		pessoa.setPeso(in.nextDouble());
		
		double imc = pessoa.calculaImc();
		
		System.out.println("--- CALCULO DO IMC ---");
		
		System.out.format("Nome: %s\nSobrenome: %s\nIdade: %d anos\nAltura: %.2fm\nPeso: %.1fkg\nIMC: %.2f\nSituação: %s",
		pessoa.getNome(),pessoa.getSobrenome(),pessoa.getIdade(),pessoa.getAltura(),pessoa.getPeso(),pessoa.getImc(),pessoa.getInformarObesidade());
		
	}
	
}
