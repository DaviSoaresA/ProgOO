package exercicios;

import javax.swing.JOptionPane;

public class TesteProduto {

	public static void main(String[] args) {

		Produto p = new Produto("Arroz", 25., 2);
		Character op;
		do {

			JOptionPane.showMessageDialog(null, p);
			op = JOptionPane.showInputDialog("Deseja encerrar o programa? (S/N)").charAt(0);
			op = Character.toUpperCase(op);

		} while (op != 'S');
	}

}
