package pratica_08;

import java.util.Scanner;

public class Divisão2numerosInteiros {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		try {
			System.out.println("Informe o primeiro numero: ");
			int num1 = in.nextInt();

			System.out.println("Informe o segundo numero: ");
			int num2 = in.nextInt();

			if (num2 == 0) {
				throw new ArithmeticException("Não é possivel fazer divisão por 0");
			}
			int div = num1 / num2;
			System.out.println("Resultado: " + div);
		
		} catch (ArithmeticException e) {
			System.out.println("Erro: " + e.getMessage());
		
		} catch (Exception e) {
			System.out.println("Erro desconhecido: " + e.getMessage());
		}
		in.close();
	}

}
