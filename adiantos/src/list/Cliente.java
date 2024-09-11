package list;

public class Cliente {
	private String nome;
	private String telefone;
	private Integer idade;
	private Integer id;

	public Cliente(String nome, String telefone, Integer idade, Integer id) {
		this.nome = nome;
		this.telefone = telefone;
		this.idade = idade;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Telefone: " + telefone + ", Idade: " + idade + ", ID: " + id;
	}

	public void verifica() {
		if (id <= 0) {
			throw new ClienteException("ID inválido!");
		}
	}

}
