package pratica_01;

import javax.swing.JOptionPane;

public class Aumento_Salario_JOP {

	public static void main(String[] args) {
		
        JOptionPane.showMessageDialog(null, "Aumento no salario de 25%");
		
		String entrada;
		double salario, aumento;
		
		entrada = JOptionPane.showInputDialog("Salario atual");
		salario = Double.parseDouble(entrada);
		
		aumento = salario * 0.25 + salario;
		
		JOptionPane.showMessageDialog(null, "Salario com aumento "+aumento+" R$");
		
		System.exit(0);

	}

}
