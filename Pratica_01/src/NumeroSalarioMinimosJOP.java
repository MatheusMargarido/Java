package pratica_01;

import javax.swing.JOptionPane;

public class NumeroSalarioMinimosJOP {

	public static void main(String[] args) {
	
		JOptionPane.showMessageDialog(null, "Calculo de quantos salarios minimos voce recebe");
		
		String entrada;
		double salarioM, salarioA, numeroS;
		
		entrada = JOptionPane.showInputDialog("Digite o valor do salario minimo");
		salarioM = Double.parseDouble(entrada);
		
		entrada = JOptionPane.showInputDialog("Digite o valor de seu salario");
		salarioA = Double.parseDouble(entrada);
		
		numeroS = salarioA/salarioM;
		
		JOptionPane.showMessageDialog(null, "Voce recebe: "+numeroS+" salarios minimos.");
		
		System.exit(0);
		

	}

}
