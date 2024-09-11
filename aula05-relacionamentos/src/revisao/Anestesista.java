package revisao;

public class Anestesista extends Medico {
	private String tipoAnestisia;

	public Anestesista(String nome, String nomeMedico, String crm, String tipoAnestisia) {
		super(nome, nomeMedico, crm);
		this.tipoAnestisia = tipoAnestisia;
	}

	@Override
	public String toString() {
		return super.toString() + ", Anestisia: " + tipoAnestisia;
	}

	public String getTipoAnestisia() {
		return tipoAnestisia;
	}

	public void setTipoAnestisia(String tipoAnestisia) {
		this.tipoAnestisia = tipoAnestisia;
	}
	
	@Override
	public Double calcularPagamento() {
		return this.valorPago = super.calcularPagamento() + 2000;
	}
	
}
