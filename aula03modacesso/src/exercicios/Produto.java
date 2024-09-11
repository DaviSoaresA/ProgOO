package exercicios;

public class Produto {
	private String descricao;
	private Double valor;
	private Integer quantidade;

	public Produto(String descricao, Double valor, Integer quantidade) {
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Descricao: " + descricao + "\nValor: " + valor + "\nTotal: " + (valor * quantidade) + "\nICMS: "
				+ calcularIcms(valor * quantidade);
	}

	public String getDescricao() {
		return descricao;
	}

	public Double getValor() {
		return valor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public Double calcularIcms(Double total) {
		return (total * 0.12);
	}
}
