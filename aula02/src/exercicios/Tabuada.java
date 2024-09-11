package exercicios;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		sc.close();
		System.out.println("Resultado:");
		for (int i = 1; i < 11; i++) {
			System.out.println(num + "x" + i + " = " + (num * i));
		}
	}

}
