package list;

public class Aluno {
	private String nome;
	private Double nota1;
	private Double nota2;

	public Aluno(String nome, Double nota1, Double nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nNotas: " + nota1 + ", " + nota2 + "\nMédia: " + calcularMedia(nota1, nota2);
	}

	public String getNome() {
		return nome;
	}

	public Double getNota1() {
		return nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public Double calcularMedia(Double... notas) {
		double media = 0.;

		for (Double nota : notas) {
			if (nota < 0. || nota > 10) {
				throw new AlunoException("Nota inválida!");
			} else {
				media += nota;
			}
		}

		return media / notas.length;

	}

}
