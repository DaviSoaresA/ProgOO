package revisao;

import java.time.LocalDate;

public abstract class Ave extends Animal{
	protected String cor;

	public Ave(String nome, LocalDate dataVacinacao) {
		super(nome, dataVacinacao);
	}
	
	public abstract String voar();
	
}
