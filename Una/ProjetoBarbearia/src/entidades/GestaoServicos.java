package entidades;

import java.util.ArrayList;

public class GestaoServicos {

	// ATRIBUTOS DA CLASSE
	private ArrayList<Servico> servicos;

	// CONSTRUTOR
	public GestaoServicos() {
		this.servicos = new ArrayList<>();

	}

	// CADASTRO DOS SERVIÇOS
	public void cadastraServico(Servico servico) {

		servicos.add(servico);
		System.out.println("Novo serviço cadastrado !\n");

	}

	// REMOVENDO SERVIÇOS
	public void removeServico(Servico servico) {

		servicos.remove(servico);
		System.out.println("Serviço removido com sucesso !!");

	}

	// EDITAR SERVIÇOS
	public void editarServico(int codigo,  String novoNome, double novoPreco) {

		Servico servicoEditado = buscarServico(codigo);

		if (servicoEditado != null) {
			servicoEditado.setNome(novoNome);
			servicoEditado.setPreco(novoPreco);

			System.out.println("serviço editado com sucesso!\n");
		} else {
			System.out.println("serviço não encontrado!\n");
		}
	}

	// MOSTRAR A LISTA DE SERVIÇOS
	public ArrayList<Servico> mostrarServicos() {
		return servicos;
	}

	// IDENTIFICAR O SERVIÇO
	public Servico buscarServico(int codigo) {
		for (Servico servico : servicos) {
			if (servico.getCodigo() == codigo) {
				return servico;
			}
		}
		return null;
	}
}
