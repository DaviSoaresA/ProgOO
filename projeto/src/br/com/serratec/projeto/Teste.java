package br.com.serratec.projeto;

public class Teste {

	public static void main(String[] args) {
		try {
			Arquivo a = new Arquivo();

			a.lerArquivo();

			for (Funcionario funcionario : a.getFuncionarios()) {
				funcionario.calcularInss();
				funcionario.calcularIR();

			}

			a.escreverArquivo(a.printOutput());

		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}

	}

}
