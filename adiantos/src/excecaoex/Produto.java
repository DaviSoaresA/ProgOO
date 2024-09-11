package excecaoex;

public class Produto {
	private Integer codigo;
	private String descricao;
	private Double valor;
	private Categoria categoria;

	public Produto(Integer codigo, String descricao, Double valor, Categoria categoria) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.categoria = categoria;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
