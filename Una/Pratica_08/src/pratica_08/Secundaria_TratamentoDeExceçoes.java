package pratica_08;

public class Secundaria_TratamentoDeExceçoes {

	public static int divide(int num1, int num2) throws ArithmeticException {
		
		if (num2 == 0) {
			throw new ArithmeticException("Não é possível dividir por zero.");
		}

		if (num1 < 0) {
			throw new ArithmeticException("O dividendo não pode ser negativo.");
		}

		return num1 / num2;
	}
}
