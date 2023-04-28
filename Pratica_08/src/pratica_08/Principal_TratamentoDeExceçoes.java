package pratica_08;

import java.util.Scanner;

public class Principal_TratamentoDeExceçoes {

	    public static void main(String[] args) {
	       
	    	Scanner input = new Scanner(System.in);
	        int num1, num2, resultado;
	        
	        System.out.print("Digite o primeiro número: ");
	        num1 = input.nextInt();
	        
	        System.out.print("Digite o segundo número: ");
	        num2 = input.nextInt();
	        
	        try {
	            resultado = Secundaria_TratamentoDeExceçoes.divide(num1, num2);
	            System.out.println("Resultado da divisão: " + resultado);
	        } catch (ArithmeticException e) {
	            System.out.println("Erro: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Erro desconhecido: " + e.getMessage());
	        }
	        
	        input.close();
	    }
	}


