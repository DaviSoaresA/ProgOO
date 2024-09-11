package interfaces;

public interface Conta {
	Double IMPOSTO = 10.0;
	
	void saque(Double valor);
	void deposito(Double valor);
}	
