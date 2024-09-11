package relacao;

public class TesteRelacao {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("José", "agfafia@gmail.com");
		Pessoa p2 = new Pessoa("André", "afaufi@gmail.com");
		
		Imovel i1 = new Imovel("Casa", 188000., p2);
		Imovel i2 = new Imovel("Apartamento", 240000., p1);
		
		System.out.println(i1);
		System.out.println(i2);
	}

}
