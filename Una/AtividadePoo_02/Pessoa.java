package atividade_poo2;

import java.util.Calendar;

public class Pessoa {

	private String nome;
	private String situação;
	private String sobrenome;
	private int idade;
	private Calendar dataNasc;
	private double peso;
	private double altura;
	private double imc;
	private double idadeAtual;

	public Pessoa() {
	}

	public int calculaIdade() {
		Calendar dataAtual = Calendar.getInstance();
		int anoAtual = dataAtual.get(Calendar.YEAR);
		int mesAtual = dataAtual.get(Calendar.MONTH) + 1;
		int diaAtual = dataAtual.get(Calendar.DAY_OF_MONTH);

		int idade = anoAtual - dataNasc.get(Calendar.YEAR);
		if (mesAtual < dataNasc.get(Calendar.MONTH) || (mesAtual == dataNasc.get(Calendar.MONTH) && diaAtual < dataNasc.get(Calendar.DAY_OF_MONTH))) {
			idade--;
		}
		return idade;
	}

	public double calculaImc() {
		this.setImc(this.getPeso() / (this.getAltura() * 2));
		return imc;
	}

	public String informarObesidade() {

		if (this.getImc() < 18.5) {
			situação = "ABAIXO DO PESO";

		} else if (this.getImc() >= 18.5 && this.getImc() < 25) {
			situação = "PESO NORMAL";

		} else if (this.getImc() >= 25 && this.getImc() < 30) {
			situação = "SOBREPESO";

		} else if (this.getImc() >= 30 && this.getImc() < 35) {
			situação = "OBESIDADE GRAU 1";

		} else if (this.getImc() >= 35 && this.getImc() < 40) {
			situação = "OBESIDADE GRAU 2";

		} else {
			situação = "OBESIDADE GRAU 3";
		}
		return situação;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSituação() {
		return situação;
	}

	public void setSituação(String situação) {
		this.situação = situação;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Calendar getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Calendar dataNasc) {
		this.dataNasc = dataNasc;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}
	
	public void setidadeAtual(double idadeAtual) {
		this.idadeAtual = idadeAtual;
	}
	public double getidadeAtual() {
		return idadeAtual;
	}
	

}