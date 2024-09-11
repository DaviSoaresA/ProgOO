package enumeradores;

public class Escola {
	private String cnpj;
	private String razaoSocial;

	public Escola(String cnpj, String razaoSocial) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}
	
	public final void gerarRelatorio() {
		System.out.println("Relatorio!");
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}
	

}
