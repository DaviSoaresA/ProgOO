package br.com.serratec.aula;

import java.io.Serializable;
import java.util.Objects;

/**
 * 
 * @author Davi Soares
 * @since classe criada em setembro de 2024
 * 
 */

public class Fornecedor implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * O cnpj é o identificador de uma empresa.
	 */
	private String cnpj;
	/**
	 * O nome é referente ao nome do fornecedor.
	 */
	private String nome;
	
	/**
	 * @author <h6> Win </h6>
	 * @param valor double - valor do pagamento
	 * @return o valor pago
	 */
	public Double pagamentoFornecedor(Double valor) {
		return 0.;
	}

	public Fornecedor(String cnpj, String nome) {
		this.cnpj = cnpj;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "\ncnpj: " + cnpj + "\nnome: " + nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fornecedor other = (Fornecedor) obj;
		return Objects.equals(nome, other.nome);
	}
	
	

}
