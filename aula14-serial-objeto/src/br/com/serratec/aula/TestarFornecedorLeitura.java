package br.com.serratec.aula;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class TestarFornecedorLeitura {

	public static void main(String[] args) {
		System.out.println("Leitura dos objetos");
		List<Fornecedor> fornecedores = new ArrayList<>();
		
		try {
			FileInputStream arqLeitura = new FileInputStream("/curso/fornecedor.dat");
			ObjectInputStream lerObjeto = new ObjectInputStream(arqLeitura);
			
			fornecedores = (List<Fornecedor>) lerObjeto.readObject();
			
			lerObjeto.close();
			arqLeitura.close();
			
			System.out.println(fornecedores);
			
		} catch (Exception e) {
		 System.err.println("Erro!");
		 e.printStackTrace();
		}
	}

}
