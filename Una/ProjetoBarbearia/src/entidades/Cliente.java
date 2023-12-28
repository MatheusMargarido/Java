package entidades;

public class Cliente {

	private String nome;
	private String endereco;
	private String telefone;
	private int codigo;
	private String especialidade;

	public Cliente(int codigo, String nome, String especialidade, String telefone, String endereco) {
		this.nome = nome;
		this.especialidade = especialidade;
		this.telefone = telefone;
		this.endereco = endereco;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

}
