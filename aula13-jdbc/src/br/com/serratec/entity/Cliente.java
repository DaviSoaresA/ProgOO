package br.com.serratec.entity;

public class Cliente {
	private Integer codigo;
	private String nome;
	private String telefone;
	private String email;

	public Cliente(Integer codigo, String nome, String telefone, String email) {
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	@Override
	public String toString() {
		return "\ncodigo: " + codigo + "\nnome: " + nome + "\ntelefone: " + telefone + "\nemail: " + email;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
