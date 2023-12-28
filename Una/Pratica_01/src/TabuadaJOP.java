package pratica_01;

import javax.swing.JOptionPane;

public class TabuadaJOP {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Tabuada");
		
		String entrada = JOptionPane.showInputDialog(null, "Informe um numero: ");
		int Dnumero = Integer.parseInt(entrada);
		int x = 0;
		while (x <= 10) {
			int resultado = Dnumero * x ;
			
			
			JOptionPane.showMessageDialog(null, entrada + " X " + x + " = " + resultado );
			x++;
			
		}

	}

}
