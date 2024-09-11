package interfaces;

public class TotalTributos {
	private Double totalGeral = 0.;
	

	@Override
	public String toString() {
		return "Total de tributos: "+ totalGeral;
	}

	public Double getTotalGeral() {
		return totalGeral;
	}

	public void setTotalGeral(Double totalGeral) {
		this.totalGeral = totalGeral;
	}
	
	public void totalizarTributos(Tributos valor) {
		totalGeral += valor.calcularIR() + valor.calcularICMS();
	}
}
