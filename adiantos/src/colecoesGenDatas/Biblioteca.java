package colecoesGenDatas;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private String responsavel;
	private List<Livro> livros = new ArrayList<>();

	@Override
	public String toString() {
		return "\n\nTotal: " + calcularTotalLivros();
	}

	public String getResponsavel() {
		return responsavel;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void adicionar(Livro... livro) {
		for (Livro livros2 : livro) {
			livros.add(livros2);
		}
	}

	public void lista() {
		for (Livro livro : livros) {
			System.out.println(livro);
		}
	}

	public Integer pesquisarFaixaDePreco(Double valorInicial, Double valorFinal) {
		for (Livro livro : livros) {
			if (livro.getPreco() >= valorInicial && livro.getPreco() <= valorFinal) {
				return livros.indexOf(livro);
			} else {
				continue;
			}
		}
		return null;
	}

	public Double calcularTotalLivros() {
		Double total = 0.;

		for (Livro livro : livros) {
			total += livro.getPreco();
		}
		return total;
	}

}
