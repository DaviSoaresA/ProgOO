package exercicios;

import javax.swing.JOptionPane;

public class SalarioAcrecimo {

	public static void main(String[] args) {
		String nome = "", telefone = "", email = "";
		double salario = 0.;

		for (int i = 1; i < 5; i++) {
			switch (i) {
			case 1:
				nome = JOptionPane.showInputDialog("Digite seu nome: ");
				break;
			case 2:
				telefone = JOptionPane.showInputDialog("Digite seu telefone: ");
				break;
			case 3:
				email = JOptionPane.showInputDialog("Digite seu email: ");
				break;
			case 4:
				salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário: "));
				break;
			default:
				break;
			}
		}
		JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nTelefone: " + telefone + "\nEmail: " + email
				+ "\nSalário com acrécimo de 10%: " + (salario * 1.10));
	}

}
