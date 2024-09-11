package diversos;

import javax.swing.JOptionPane;

public class Maratona {
	public static void main(String[] args) {
		double altura, idade;

		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura: "));
		idade = Double.parseDouble(JOptionPane.showInputDialog("Digite a idade: "));

		if (idade >= 18 || altura > 1.70) {
			JOptionPane.showMessageDialog(null, "Participará da Maratona!!!");

		} else {
			JOptionPane.showMessageDialog(null, "Não Participará da Maratona!!");
		}
	}
}
