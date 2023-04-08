package pratica_01;

import javax.swing.JOptionPane;

public class CirculoJOP {

	public static void main(String[] args) {
		
        JOptionPane.showMessageDialog(null, "Calculo das dimensões de um circulo");
		
		String entrada;
		double raio, comp, area, vol;
		
		entrada = JOptionPane.showInputDialog("Informe o raio");
		raio = Double.parseDouble(entrada);
		
		comp = 2*Math.PI*raio;
		area = Math.PI*(Math.pow(raio,2));
		vol = 0.75*Math.PI*(Math.pow(raio,3));
		
		JOptionPane.showMessageDialog(null, "Comprimento do circulo: "+comp+"\nArea do circulo: "+area+"\nVolume do circulo: "+vol);
		
		System.exit(0);

	}

}
