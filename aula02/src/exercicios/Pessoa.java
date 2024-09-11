package exercicios;

public class Pessoa {
	String[][] pessoa;

	public Pessoa(String[][] pessoa) {
		this.pessoa = pessoa;
	}

	public Double comparar(String[][] pessoa, int k) {
		double comp = 0., conv = 0.;

		for (int i = 0; i < pessoa.length + 1; i++) {
			conv = Double.parseDouble(pessoa[k][i]);

			comp = (conv > comp ? conv : comp);
		}
		return comp;
	}

	public Double media(String[][] pessoa, int k) {
		double media = 0.;

		for (int i = 0; i < pessoa.length + 1; i++) {
			media += Double.parseDouble(pessoa[k][i]);
		}
		return (media / 4);
	}

	public Integer quem(String[][] pessoa, Double compe) {
		double compi;
		int p = 0;

		for (int i = 0; i < pessoa.length + 1; i++) {
			for (int j = 1; j < pessoa.length; j++) {
				compi = Double.parseDouble(pessoa[j][i]);

				p = (compi == compe ? i : p);
			}
		}
		return p;
	}
}
