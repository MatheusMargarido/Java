package pratica_01;

import javax.swing.JOptionPane;

public class IdadeFuturaJOP {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Calculo idade");
		
		String entrada;
		int anonasc, anoatual, idadeatual, idade2050;
		
		entrada = JOptionPane.showInputDialog("Ano de nascimento");
		anonasc = Integer.parseInt(entrada);
		
		entrada = JOptionPane.showInputDialog("Ano atual");
		anoatual = Integer.parseInt(entrada);
		
		idadeatual = anoatual - anonasc;
		idade2050 = 2050 - anonasc;
		
		JOptionPane.showMessageDialog(null, "Idade atual:  "+idadeatual+" anos\nIdade em 2050:  "+idade2050+" anos");
		
		System.exit(0);
	}

}
