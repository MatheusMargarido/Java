package entidades;

import java.util.ArrayList;
import java.util.List;

public class GestaoClientes {
	private List<Cliente> clientes;

	public GestaoClientes() {
		this.clientes = new ArrayList<>();
	}

	public void cadastrarCliente(Cliente cliente) {
		clientes.add(cliente);
		System.out.println("Cliente cadastrado com sucesso!");
	}

	public void editarCliente(int codigo, String novoNome, String novoEspecialidade, String novoEndereco,
			String novoTelefone) {
		Cliente clienteEditar = buscarCodigo(codigo);

		if (clienteEditar != null) {
			clienteEditar.setNome(novoNome);
			clienteEditar.setEspecialidade(novoEspecialidade);
			clienteEditar.setEndereco(novoEndereco);
			clienteEditar.setTelefone(novoTelefone);
			System.out.println("Cliente editado com sucesso!");
		} else {
			System.out.println("Cliente não encontrado!");
		}
	}

	public void deletarCliente(Cliente cliente) {
		clientes.remove(cliente);
		System.out.println("Cliente removido com sucesso!");
	}

	public List<Cliente> listarClientes() {
		return clientes;
	}

	public Cliente buscarCodigo(int codigo) {
		for (Cliente cliente : clientes) {
			if (cliente.getCodigo() == codigo) {
				return cliente;
			}
		}
		return null;
	}
}
