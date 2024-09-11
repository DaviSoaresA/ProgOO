package enumexercicio;

import java.time.LocalDate;

public class Carro extends Veiculo {
	private String categoria;

	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	@Override
	public Double lavarVeiculo() {
		return TipoServico.LAVAGEM.getValorPorServico();
	}

	@Override
	public Double trocarOleo() {
		if (dataConserto.getDayOfWeek().getValue() == 6) {
			return TipoServico.OLEO.getValorPorServico() - 50;
		} else {
			return TipoServico.OLEO.getValorPorServico();
		}
	}

	@Override
	public Double revisao() {
		if (dataConserto.getMonth().getValue() == 8) {
			return TipoServico.REVISAO.getValorPorServico() * 0.9;
		} else {
			return TipoServico.REVISAO.getValorPorServico();
		}
	}

}
