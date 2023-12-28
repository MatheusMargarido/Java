package Lojinha;

import java.util.ArrayList;

public class Fatura {

	private ArrayList<Item> itens;
	private double total;

	public Fatura() {

		this.itens = new ArrayList<>();
		this.total = 0.0;

	}

	public void adicionarItem(Item item) {
		itens.add(item);
		total += item.getValorTotal();
	}

	public ArrayList<Item> getItens() {
		return itens;
	}

	public double getTotal() {
		return total;
	}

}
