package Exercicio;

public class TesteContato {

	public static void main(String[] args) {
		Estado estado = new Estado("Rio de Janeiro", "RJ");
		Cidade cidade = new Cidade("Petrópolis", estado);
		Endereco endereco = new Endereco("Rua Teresa", "Alto da Serra", "1006", cidade);
		Telefone tel1 = new Telefone("(24)988456798");
		Telefone tel2 = new Telefone("(24)992874534");
		Contato contato = new Contato("Matheus", endereco);
		
		contato.setTelefones(tel1);
		contato.setTelefones(tel2);
		
		System.out.println(contato);
	}

}
