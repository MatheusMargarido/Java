package pratica_01;

import javax.swing.JOptionPane;

public class ConversãoTemperaturaJOP {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Celsius para fahrenheit");
		
		String entrada;
		double tcelsius, tfahrenheit;
		
		entrada = JOptionPane.showInputDialog("Digite a temperatura em Celsius");
		tcelsius = Double.parseDouble(entrada);
		
		tfahrenheit = (tcelsius*1.8)+32;
		
		JOptionPane.showMessageDialog(null, "Temperatura em fahrenheit:  "+tfahrenheit+"°F");
		
		System.exit(0);
	}

}
