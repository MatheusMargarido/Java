package pratica_01;

import java.util.Scanner;

public class ConversãoTemperatura {

	public static void main(String[] args) {
		
        System.out.println("Celsius para fahrenheit");
		
		Scanner input = new Scanner(System.in);
		double tcelsius, tfahrenheit;
		
		System.out.print("Digite a temperatura em celsius: ");
		tcelsius = input.nextDouble();
		
		tfahrenheit = (tcelsius*1.8)+32;
		
		System.out.format("Temperatura em fahrenheit: %.2f°F",tfahrenheit);

	}

}
