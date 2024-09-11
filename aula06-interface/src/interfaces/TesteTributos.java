package interfaces;

public class TesteTributos {

	public static void main(String[] args) {
		TotalTributos tt = new TotalTributos();
		Pessoa p = new Pessoa("Maria", 98000.);
		Empresa e = new Empresa("ABC Ltda", 288500.);
		
		System.out.println(p.getNome() + " - " + p.calcularIR());
		System.out.println(p.getNome() + " - " + p.calcularICMS());
		System.out.println(e.getRazaoSocial() + " - " + e.calcularIR());
		System.out.println(e.getRazaoSocial() + " - " + e.calcularICMS());
		
		tt.totalizarTributos(p);
		tt.totalizarTributos(e);
		
		System.out.println(tt);
		
	}

}
