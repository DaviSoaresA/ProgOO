package colecoesGenDatas;

public class TesteLivro {

	public static void main(String[] args) {
		Livro l1 = new Livro("História do Java", "Java", 85.);
		Livro l2 = new Livro("O Infiltrado", "Helcinei", 110.);
		Livro l3 = new Livro("Java o vacilo final", "Patrick", 78.);

		Biblioteca b = new Biblioteca();

		b.adicionar(l1, l2, l3);

		b.lista();

		System.out.println(
				"\nEsses são os livros nesta faixa de preço:\n" + b.getLivros().get(b.pesquisarFaixaDePreco(80., 120.)));

		System.out.println(b);

	}

}
