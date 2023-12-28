package pratica_01;

import javax.swing.JOptionPane;

public class LosangoJOP {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Area do losango");
		
		String entrada;
		double dmaior, dmenor, area;
		
		entrada = JOptionPane.showInputDialog("Digite a diagonal maior");
		dmaior = Double.parseDouble(entrada);
		
		entrada = JOptionPane.showInputDialog("Digite a diagonal menor");
		dmenor = Double.parseDouble(entrada);
		
		area = (dmaior*dmenor)/2;
		
		JOptionPane.showMessageDialog(null, "Area do losango: "+area);
		
		System.exit(0);

	}

}
