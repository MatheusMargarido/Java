package Lojinha;

public class Item {

	private Produto produto;
	private int quantidade;
	private double valorTotal;

	public Item(Produto produto, int quantidade, double valorTotal) {

		this.produto = produto;
		this.quantidade = quantidade;
		this.valorTotal = 0.0;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	private void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;

	}

	public double getValorTotal() {
		this.setValorTotal(produto.getPreco() * quantidade);
		return valorTotal;
	}

}
