package entities;

// ESSA CLASSE SAVESACCOUNT NÃO PODERA SER HERDADE << FINALIDADE DO "FINAL" >>.
public final class SavingsAccount extends Account {
	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}

	// OVERRIDE MOSTRA QUE O METODO É SOBRESCRITO.
	// "FINAL" NO METODO TAMBEM É USADO PARA NÃO SER SOBREPOSTO.

	@Override
	public final void withdraw(double amount) {
		balance -= amount;
	}

	/*
	 * - FINAL E USADO COMO SEGURANÇA, IMPEDINDO QUE A CLASSE SEJA HERDADA OU O METODO.
	 * 
	 * - GERALMENTE CONVEM ACRESCENTAR O "FINAL" EM METODOS SOBREPOSTOS POIS SOBREPOSIÇÕES
	 * MULTIPLAS COSTUMA SER PORTA DE ENTRADA PARA INCONSCISTENCIAS.
	 *
	 * - PERFORMACE POIS ATRIBUTOS DE TIPO DE UMA CLASSE FINAL SÃO ANALISADOS DE FORMA
	 * MAIS RAPIDA EM TEMPO DE EXECUÇÃO.
	 */
}
