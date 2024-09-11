package exercicios;

import javax.swing.JOptionPane;

public class SusAntes {

	public static void main(String[] args) {
		int num;

		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

		JOptionPane.showMessageDialog(null, "O Sucessor de " + num + " é: " 
		+ (num + 1) + "\nO Antecessor de " + num + " é: " + (num - 1));
	}

}
