package revisao;

public class AssistenteFinanceiro extends Assistente {
	private String curso;

	public AssistenteFinanceiro(String nome, Double salario, String turno, String nivel, String curso) {
		super(nome, salario, turno, nivel);
		this.curso = curso;
	}

	@Override
	public String toString() {
		return super.toString() + ", Curso: " + curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
