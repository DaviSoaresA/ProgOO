package relacao;

public class Imovel {
	private String tipo;
	private Double valor;
	private Pessoa dono;

	public Imovel(String tipo, Double valor, Pessoa dono) {
		this.tipo = tipo;
		this.valor = valor;
		this.dono = dono;
	}

	@Override
	public String toString() {
		return "tipo: " + tipo + ", valor: " + valor + ", dono: " + dono;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Pessoa getDono() {
		return dono;
	}

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

}
