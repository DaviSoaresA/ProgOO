package interfaceexercicio;

public class Livro {
	private String autor;
	private String titulo;
	private Double valor;

	public Livro(String autor, String titulo, Double valor) {
		this.autor = autor;
		this.titulo = titulo;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return " Autor: " + autor + ", Titulo: " + titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public Double getValor() {
		return valor;
	}
	
	public void reajuste(Double valor) {
		this.valor *= valor;
	}

}
