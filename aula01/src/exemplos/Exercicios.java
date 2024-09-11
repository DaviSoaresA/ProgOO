package exemplos;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		double altura, idade;

		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
		idade = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
		
		String res= (altura >= 1.60 || idade >= 18 ? "Pode participar": "Não pode participar" );
		System.out.println("O atleta:" + res);
	}

}
