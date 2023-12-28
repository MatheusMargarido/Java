package Lojinha;

public class Produto {

	private String nome;
	private int codigo;
	private double preco;

	public Produto(String nome, int codigo, double preco) {

		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;

	}

	public String getNome() {
		return nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public double getPreco() {
		return preco;
	}

}
