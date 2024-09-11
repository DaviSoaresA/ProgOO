package excecaoex;

import java.time.LocalDate;

public class Venda implements FinalizarVenda {
	private Produto produto;
	private LocalDate dataCompra;
	private Integer quantidade;
	private static Double totalVenda = 0.;

	public Venda(Produto produto, LocalDate dataCompra, Integer quantidade) {
		this.produto = produto;
		this.dataCompra = dataCompra;
		this.quantidade = quantidade;
	}
	
	public static String toStringg() {
		return "Total por item: \n------------------------------";
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public static Double getTotalVenda() {
		return totalVenda;
	}

	public static void setTotalVenda(Double totalVenda) {
		Venda.totalVenda = totalVenda;
	}

	@Override
	public void calcularVenda() {
		try {
			if (quantidade == 0) {
				throw new ArithmeticException("Erro de calculo!");
			}
			else {
				totalVenda += produto.getValor() * quantidade;
				mostrarVenda();
			}
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}
	}


	private void mostrarVenda() {
		System.out.println(produto.getDescricao() + " - R$" + String.format("%.2f", produto.getValor() * quantidade));
	}

}
