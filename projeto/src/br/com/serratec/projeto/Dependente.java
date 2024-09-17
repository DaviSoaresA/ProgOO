package br.com.serratec.projeto;

import java.time.LocalDate;


public class Dependente extends Pessoa {
	private Parentesco parentesco;

	public Dependente(String nome, String cpf, LocalDate dataNascimento, Parentesco parentesco) {
		super(nome, cpf, dataNascimento);
		this.parentesco = parentesco;
	}

	@Override
	public String toString() {
		return "\nparentesco: " + parentesco + "\nnome: " + nome + "\ncpf: " + cpf + "\ndataNascimento: "
				+ dataNascimento;
	}

}
