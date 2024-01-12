package entities;

public class PessoaFisica extends Pessoa {

	private Double gastoComSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastoComSaude) {
		super(nome, rendaAnual);
		this.gastoComSaude = gastoComSaude;
	}

	public Double getGastoComSaude() {
		return gastoComSaude;
	}

	public void setGastoComSaude(Double gastoComSaude) {
		this.gastoComSaude = gastoComSaude;
	}

	@Override
	public double calculoImposto() {

		if (super.getRendaAnual() < 20000.0 && gastoComSaude == 0.0) {
			double imposto = super.getRendaAnual() * 0.15;
			return imposto;

		} else if (super.getRendaAnual() < 20000.0 && gastoComSaude > 0.0) {
			double imposto = super.getRendaAnual() * 0.15;
			return imposto - gastoComSaude / 2;

		} else if (super.getRendaAnual() > 20000.0 && gastoComSaude == 0.0) {
			double imposto = super.getRendaAnual() * 0.25;
			return imposto;

		} else {
			double imposto = super.getRendaAnual() * 0.25;
			return imposto - gastoComSaude / 2;
		}
	}
}
