package revisao;

public class Clinica extends PlanoSaude {
	private String nomeClinica;
	private String cnpf;

	public Clinica(String nome, String nomeClinica, String cnpf) {
		super(nome);
		this.nomeClinica = nomeClinica;
		this.cnpf = cnpf;
	}

	@Override
	public String toString() {
		return super.toString() + ", Clinica: " + nomeClinica + ", cnpf: " + cnpf;
	}

	public String getNomeClinica() {
		return nomeClinica;
	}

	public void setNomeClinica(String nomeClinica) {
		this.nomeClinica = nomeClinica;
	}

	public String getCnpf() {
		return cnpf;
	}

	public void setCnpf(String cnpf) {
		this.cnpf = cnpf;
	}

}
