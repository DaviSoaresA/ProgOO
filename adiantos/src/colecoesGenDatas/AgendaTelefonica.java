package colecoesGenDatas;

import java.util.HashMap;
import java.util.Map;

public class AgendaTelefonica {
	private Map<String, String> colecao = new HashMap<>();
	
	public void inserir(String nome, String numero) {
		colecao.put(nome, numero);
	}
	
	public String buscarNumero(String nome) {
		for (Map.Entry<String, String> entry : colecao.entrySet()) {
			if (entry.getKey() == nome) {
				return entry.getValue();
			}
		}
		return "Não encontrado";
	}
	
	public void remover(String nome) {
		colecao.remove(nome);
	}
	
	public Integer tamanho() {
		return colecao.size();
	}
}
