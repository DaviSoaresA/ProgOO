package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome, telefone;
		int idade, id = 1;
		
		List<Cliente> clientes = new ArrayList<Cliente>();

		do {

			try {
				System.out.println("Digite seu nome: ");
				nome = sc.next();
				
				System.out.println("Digite seu telefone: ");
				telefone = sc.next();
				
				System.out.println("Digite a sua idade: ");
				idade = sc.nextInt();
				
				System.out.println("Digite seu ID: ");
				id = sc.nextInt();
				
				Cliente cliente = new Cliente(nome, telefone, idade, id);
				cliente.verifica();
			
				clientes.add(cliente);

			} catch (ClienteException e) {
				System.err.println(e.getMessage());
			}

		} while (id > 0);
		sc.close();
		
		System.out.println("\nClientes registrados");
		for (Cliente c : clientes) {
			System.out.println(c);
		}
	}

}
