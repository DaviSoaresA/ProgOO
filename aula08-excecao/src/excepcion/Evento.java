package excepcion;

import javax.swing.JOptionPane;

public class Evento {
	private String email;
	private Integer idade;
	

	public Evento(String email, Integer idade) {
		if (idade < 18) {
			throw new IllegalArgumentException("Menor de idade não é permitido!");
		}else {
			this.email = email;
			this.idade = idade;
		}
	}

	public static void main(String[] args) {
		int opcao = 0;
		
		do {
			try {
				String email = JOptionPane.showInputDialog("Digite o seu E-mail:");
				Integer idade = Integer.valueOf(JOptionPane.showInputDialog("Digite a sua idade:"));
				
				Evento evento = new Evento(email, idade);
				
				opcao = JOptionPane.showConfirmDialog(null, "Deseja Continuar?", "Informação", 0, 1);
			} catch (IllegalArgumentException e) {
				JOptionPane.showInternalMessageDialog(null, e.getMessage());
			}
		} while (opcao == 0);
		
		
	}

}
