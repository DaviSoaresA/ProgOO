package revisao;

public class Assistente extends Funcionario {
	private String nivel;

	public Assistente(String nome, Double salario, String turno, String nivel) {
		super(nome, salario, turno);
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return super.toString() + ", Nivel: " + nivel;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
	@Override
	public void reajusteSalarial() {
		salario *= 1.18;
	}
}
