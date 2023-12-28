package pratica_01;

import javax.swing.JOptionPane;

public class TeoremaDePitagorasJOP {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Teorema de Pitágoras");
		
		String entrada;
		double cat01, cat02, hip;
		
		entrada = JOptionPane.showInputDialog("Digite o primeiro cateto");
		cat01 = Double.parseDouble(entrada);
		
		entrada = JOptionPane.showInputDialog("Digite o segundo cateto");
		cat02 = Double.parseDouble(entrada);
		
		hip = Math.sqrt(Math.pow(cat01, 2) + Math.pow(cat02, 2));
		
		JOptionPane.showMessageDialog(null, "Valor da hipotenusa:  "+hip);
		
		System.exit(0);
	}

}
