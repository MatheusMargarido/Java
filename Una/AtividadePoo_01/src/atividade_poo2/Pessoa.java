package atividade_poo2;

public class Pessoa {
	
	
	private String nome;
	private String situação;
	private String sobrenome;
	private int idade;
	private double peso;
	private double altura;
	private double imc;
	
	
	public Pessoa() {
		
	}
		
	public double calculaImc() {
		this.setImc(this.getPeso()/(this.getAltura()*2));
		return getImc();
	}
	
	public String getInformarObesidade() {
		
		if (this.getImc()<18.5) {
			situação = "ABAIXO DO PESO";

		}else if (this.getImc()>=18.5 && this.getImc()<25 ) {
			situação = "PESO NORMAL";

		}else if (this.getImc()>=25 && this.getImc()<30) {
			situação = "SOBREPESO";

		}else if(this.getImc()>=30 && this.getImc()<35) {
			situação = "OBESIDADE GRAU 1";

		}else if(this.getImc()>=35 && this.getImc()<40) {
			situação = "OBESIDADE GRAU 2";
		
		}else {
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

}
