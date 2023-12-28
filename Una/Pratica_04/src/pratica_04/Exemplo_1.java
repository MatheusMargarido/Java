package pratica_04;

import javax.swing.JOptionPane;

public class Exemplo_1 {

    public static void main(String args[]) {

        String entrada, sexo;
        int numero, idade;
        double salario;

        do {
            entrada = JOptionPane.showInputDialog("Insira um numero de 1 a 10: ");
            numero = Integer.parseInt(entrada);

            if (numero >= 1 && numero <= 10) {
                JOptionPane.showMessageDialog(null, "Sucesso");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Número inválido");
            }

        } while (true);

        do {
            entrada = JOptionPane.showInputDialog("Insira o salario: ");
            salario = Double.parseDouble(entrada);

            if (salario >= 0) {
                JOptionPane.showMessageDialog(null, "Sucesso");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Salário inválido");
            }

        } while (true);

        do {
            entrada = JOptionPane.showInputDialog("Insira o seu sexo: (M)asculino ou (F)eminino");
            sexo = entrada.toUpperCase();

            if (sexo.equals("M") || sexo.equals("F")) {
                JOptionPane.showMessageDialog(null, "Sucesso");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Sexo inválido");
            }

        } while (true);

        do {
            entrada = JOptionPane.showInputDialog("Deseja continuar? (S)im ou (N)ão");
            entrada = entrada.toUpperCase();

            if (entrada.equals("S") || entrada.equals("SIM")) {
                break;
            } else if (entrada.equals("N") || entrada.equals("NAO")) {
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida");
            }

        } while (true);

        do {
            entrada = JOptionPane.showInputDialog("Insira sua idade: ");
            idade = Integer.parseInt(entrada);
            if(idade > 0 && idade < 150) {
                JOptionPane.showMessageDialog(null, "Sucesso");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "idade inválida");
            }
        } while(true); 
    }
}
