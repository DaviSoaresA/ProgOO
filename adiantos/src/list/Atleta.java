package list;

public class Atleta {
	private String nome;
	private Integer idade;
	private String posicao;

	public Atleta(String nome, Integer idade, String posicao) {
		this.nome = nome;
		this.idade = idade;
		this.posicao = posicao;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nIdade: " + idade + "\nPosicao: " + posicao + "\n";
	}

}
