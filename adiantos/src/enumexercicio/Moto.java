package enumexercicio;

import java.time.LocalDate;

public class Moto extends Veiculo {
	private Integer cilindradas;

	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, Integer cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}

	public Integer getCilindradas() {
		return cilindradas;
	}

	@Override
	public Double lavarVeiculo() {
		return valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
	}

	@Override
	public Double trocarOleo() {
		return valorCobrado += TipoServico.OLEO.getValorPorServico();
	}

	@Override
	public Double revisao() {
		return valorCobrado += TipoServico.REVISAO.getValorPorServico();
	}

}
