package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.NivelDoTrabalhador;

public class Trabalhador {

	private String nome;
	private NivelDoTrabalhador level;
	private double baseSalario;

	private Departamento departamento;
	private List<HorasDeContrato> contratos = new ArrayList<>();

	public Trabalhador() {

	}

	public Trabalhador(String nome, NivelDoTrabalhador level, double baseSalario, Departamento departamento) {
		this.nome = nome;
		this.level = level;
		this.baseSalario = baseSalario;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelDoTrabalhador getLevel() {
		return level;
	}

	public void setLevel(NivelDoTrabalhador level) {
		this.level = level;
	}

	public double getBaseSalario() {
		return baseSalario;
	}

	public void setBaseSalario(double baseSalario) {
		this.baseSalario = baseSalario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HorasDeContrato> getContratos() {
		return contratos;
	}

	public void addContrato(HorasDeContrato contrato) {
		contratos.add(contrato);
	}

	public void removeContrato(HorasDeContrato contrato) {
		contratos.remove(contrato);
	}

	public double renda(int ano, int mes) {
		
		double soma = baseSalario;
		Calendar cal = Calendar.getInstance();
		
		for (HorasDeContrato c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = cal.get(Calendar.MONTH) + 1;

			if (ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}

}
