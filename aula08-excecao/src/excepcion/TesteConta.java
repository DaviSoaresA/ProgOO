package excepcion;

public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente("414-2", 2000.);
		
		
		try {
			cc.deposito(100.);
			cc.saque(2000.);
			System.out.println(cc);
		} catch (ContaException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
