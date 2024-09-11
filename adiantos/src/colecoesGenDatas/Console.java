package colecoesGenDatas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite um número:");
			int num = sc.nextInt();

			sc.close();

			System.out.println("O número digitado foi: " + num);
		} catch (InputMismatchException e) {
			System.err.println("Erro Número inválido!! Por favor digite um número inteiro!");
		}

	}

}
