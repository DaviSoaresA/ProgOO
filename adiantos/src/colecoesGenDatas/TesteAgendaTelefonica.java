package colecoesGenDatas;

public class TesteAgendaTelefonica {

	public static void main(String[] args) {
		AgendaTelefonica at = new AgendaTelefonica();
		
		at.inserir("João", "2457585956");
		at.inserir("Maria", "2457563635");
		at.inserir("Marcos", "21523532893");
		at.inserir("Pedro", "24291447223");
		at.inserir("Paulo", "21532585938");
		
		System.out.println("O número que é: " + at.buscarNumero("Pedro"));
		
		at.remover("Paulo");
		
		System.out.println("Existe " + at.tamanho() + " Pessoas registradas");
	}

}
