package enumexercicio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Veiculo implements Oficina {
	protected String modelo;
	protected Double valorCobrado = 0.;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;
	DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}

	@Override
	public String toString() {
		return "Veiculo\nModelo: " + modelo + "\nValor do Servico: R$" + String.format("%.2f", valorCobrado)
				+ "\nData do Conserto: " + dataConserto.format(f) + proprietario;
	}

	public Double getValorCobrado() {
		return valorCobrado;
	}

}
