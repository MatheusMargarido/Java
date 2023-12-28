package pratica_01;

import javax.swing.JOptionPane;

public class CotaçãoDolarJOP {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Cotação do dolar e valor da carteira");
		
		String entrada;
		double cdolar, vcarteira, vcarteirar;
		
		entrada = JOptionPane.showInputDialog("Digite o valor do dolar em reais");
		cdolar = Double.parseDouble(entrada);
		
		entrada = JOptionPane.showInputDialog("Digite o valor de sua carteira em dolar");
		vcarteira = Double.parseDouble(entrada);
		
		vcarteirar = vcarteira * cdolar;
		
		JOptionPane.showMessageDialog(null, "Você possui:  "+vcarteirar+" R$");
		
		System.exit(0);

	}

}
