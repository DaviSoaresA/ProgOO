package enumeradores;

public class EscolaMunicipal extends Escola {
	private final String SEGMENTO = "Fundamental";

	public EscolaMunicipal(String cnpj, String razaoSocial) {
		super(cnpj, razaoSocial);
	}

	public String getSEGMENTO() {
		return SEGMENTO;
	}

}
