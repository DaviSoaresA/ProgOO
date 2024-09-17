package br.com.serratec.projeto;

import java.util.Scanner;

public class Testet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int escolha = 0;
		
		do {
			System.out.println("1. Olá\n2. Hello\n3. Sair");
			
			escolha = sc.nextInt();
			
			switch (escolha) {
			case 1:
				System.out.println("Olá");
				break;
			case 2:
				System.out.println("Hello");
				break;
			case 3:
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
			
			
		} while (escolha != 3);
		sc.close();
	}

}
