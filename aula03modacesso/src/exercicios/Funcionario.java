package exercicios;

public class Funcionario {
	private String nome;
	private Double salario;

	public Funcionario(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nSalário: " + salario + "\nINSS: " + calcularInss() + "\nVale Transporte: "
				+ calcularValeTransporte() + "\nSalário Líquido: "
				+ (salario - (calcularInss() + calcularValeTransporte()));
	}

	public String getNome() {
		return nome;
	}

	public Double getSalario() {
		return salario;
	}

	public Double calcularInss() {
		return salario * 0.11;
	}

	public Double calcularValeTransporte() {
		return salario * 0.06;
	}

}
