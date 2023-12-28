package pratica_01;

import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {
		
        System.out.println("Calculo das dimensões de um circulo");
		
		Scanner input = new Scanner(System.in);
		double raio, comp, area, vol;
		
		System.out.print("Informe o valor do raio: ");
		raio = input.nextDouble();
		
		comp = 2*Math.PI*raio;
		area = Math.PI*(Math.pow(raio,2));
		vol = 0.75*Math.PI*(Math.pow(raio,3));
		
		System.out.format("Comprimento do circulo: %.2f.\nArea do circulo: %.2f.\nVolume do circulo: %.2f.",comp,area,vol);
	

	}

}
