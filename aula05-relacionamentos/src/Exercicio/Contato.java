package Exercicio;

import java.util.ArrayList;
import java.util.List;

public class Contato {
	private String nome;
	private List<Telefone> telefones = new ArrayList<>();
	private Endereco endereco;

	public Contato(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "nome: " + nome + "\nEndereco: " + endereco + telefones;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefone telefone) {
		telefones.add(telefone);
	}

	public String getNome() {
		return nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void mostrarTelefones() {
		for (Telefone v : telefones) {
			System.out.println("\nTelefone: " + v.getNumero());
		}
	}
}
