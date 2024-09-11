package interfaceexercicio;

public class Atleta implements Olimpiadas {
	private String nome;
	private Double peso;
	private String modalidade;
	private static int totalParticipantes;
	private Pais pais;

	public Atleta(String nome, Double peso, Pais pais) {
		this.nome = nome;
		this.peso = peso;
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "O atleta " + nome + " " + verificaSituacao();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public static int getTotalParticipantes() {
		return totalParticipantes;
	}

	public static void setTotalParticipantes(int totalParticipantes) {
		Atleta.totalParticipantes = totalParticipantes;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Override
	public String verificaSituacao() {
		modalidade = (peso > 90 ? "Peso pesado" : peso <= 90 || peso >= 60 ? "Peso médio" : "");
		totalParticipantes += (peso >= 60 ? 1 : 0);
		return (peso >= 60 ? "Participará" : "Não Participará");
	}
}
