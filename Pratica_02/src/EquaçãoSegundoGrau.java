package pratica_02;

import java.util.Scanner;

public class EquaçãoSegundoGrau {

	public static void main(String[] args) {
		
System.out.println("Equação do segundo grau");
		
		Scanner in = new Scanner(System.in);
		double a,b,c,delta,x,x1,x2,raizreal;
		
		System.out.println("Digite o valor de A: ");
		a = in.nextInt();
		System.out.println("Digite o valor de B: ");
		b = in.nextInt();
		System.out.println("Digite o valor de C: ");
		c = in.nextInt();
		
		delta = (Math.pow(b , 2))-4*a*c;
		x = -b/(2*a);
		x1 = (- b + Math.sqrt(delta))/(2*a);
		x2 = (- b - Math.sqrt(delta))/(2*a);
		raizreal  = x=-c/b;
		
		if (a==0 && b==0 && c==0) {
			System.out.println("Igualdade confirmada 0=0");
		}else if (a==0 && b==0 && c!=0) {
			System.out.println("Coeficientes informados incorretamente");
		}else if (a==0 && b!=0) {
			System.out.println("Essa é uma equação de primeiro grau\nValor da raiz real da equação: "+raizreal);
		}else  {
			System.out.println("Essa é uma equação de segundo grau");
		}if (delta<0) {
			System.out.println("Essa equação não possui raizes reais \nDelta = "+delta);
		}else if(delta==0 && a!=0 && b!=00 && c!=0) {
			System.out.format("Essa equação possui raizes reais iguais \nX1 = %.2f \nX2 = %.2f",x1,x2);
		}else if (delta>0 && a!=0) {
			System.out.format("Essa equação possui raizes reais diferentes \nDelta = %.0f\nX1 = %.2f \nX2 = %.2f",delta,x1,x2);
		}

	}

}
