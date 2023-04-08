package pratica_01;

import javax.swing.JOptionPane;

public class PesoJOP {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Calculo do peso");
		
		String entrada;
		double pesoA, peso15, peso20;
		
		entrada = JOptionPane.showInputDialog("Digite o peso");
		pesoA = Double.parseDouble(entrada);
		
		peso15 = (pesoA*0.15)+pesoA;
		peso20 = pesoA - (pesoA*0.2);
		
		JOptionPane.showMessageDialog(null, "Peso com aumento de 15%:  "+peso15+"Kgs\nPeso com perda de 20%:  "+peso20+"Kgs");
		
		System.exit(0);
				
	}

}
