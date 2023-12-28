package Lojinha;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		ArrayList<Produto> loja = new ArrayList<>();
		Fatura fatura = new Fatura();
		
		int resposta = 0;

		Produto p1 = new Produto("Blusa", 001, 29.90);
		loja.add(p1);

		Produto p2 = new Produto("Chinelo", 002, 28.99);
		loja.add(p2);

		Produto p3 = new Produto("Bone", 003, 50.0);
		loja.add(p3);

		System.out.println("<< Itens Loja >>\n");

		for (Produto produto : loja) {
			System.out.printf("codigo[%d] %s : R$ %.2f \n", produto.getCodigo(), produto.getNome(), produto.getPreco());
		}

		while (resposta != 3) {
			System.out.println("\n1 - Comprar\n2 - Ver Fatura\n3 - Encerrar\n");
			System.out.print("DIGITE A OPÇÃO: ");
			resposta = in.nextInt();

			switch (resposta) {
			case 1:
				System.out.print("CODIGO DO PRODUTO: ");
				int codigo = in.nextInt();

				Produto produtoSelecionado = null;

				for (int i = 0; i < loja.size(); i++) {

					Produto produto = loja.get(i);
					if (produto.getCodigo() == codigo) {
						produtoSelecionado = produto;
						break;
					}
				}

				if (produtoSelecionado != null) {
					System.out.print("INFORME A QUANTIDADE: ");
					int quantidade = in.nextInt();

					Item item = new Item(produtoSelecionado, quantidade, 0);
					fatura.adicionarItem(item);

					System.out.println("ITEM ADICIONADO A FATURA");
				} else {
					System.out.println("CODIGO INVALIDO");
				}

				break;
			case 2:
				System.out.println("\n<< FATURA >>");

				ArrayList<Item> itens = fatura.getItens();

				for (int i = 0; i < itens.size(); i++) {
					Item item = itens.get(i);
					Produto produto = item.getProduto();
					System.out.println("PRODUTO: " + produto.getNome() + "   QUANTIDADE: " + item.getQuantidade()
							+ " | Total: R$" + item.getValorTotal());

				}
				System.out.println("\nValor Total da Fatura: R$" + fatura.getTotal() + "\n");
				break;
			case 3:
				System.out.println("PROGRAMA ENCERRADO");
				break;
			default:
				System.out.println("Opção inválida. Digite novamente." + "\n");
				break;
			}
		}
		in.close();
	}
}
