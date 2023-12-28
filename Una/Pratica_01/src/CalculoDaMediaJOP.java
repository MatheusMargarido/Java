package pratica_01;

import javax.swing.JOptionPane;

public class CalculoDaMediaJOP {

	public static void main(String[] args) {
		
        JOptionPane.showMessageDialog(null, "Calculo da media");
		
		String entrada;
		double nota1, nota2, nota3, media;
		
		entrada = JOptionPane.showInputDialog("Nota 01");
		nota1 = Double.parseDouble(entrada);
		
		entrada = JOptionPane.showInputDialog("Nota 02");
		nota2 = Double.parseDouble(entrada);
		
		entrada = JOptionPane.showInputDialog("Nota 03");
		nota3 = Double.parseDouble(entrada);
		
		media = (nota1 + nota2 + nota3)/3;
		
		JOptionPane.showMessageDialog(null, "Media : " +media);
		
		System.exit(0);
		
	}

}
