package exercicios;

import java.util.Scanner;

public class TestaPessoa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa p = new Pessoa(new String[3][4]);
		int q;

		for (int i = 0; i < p.pessoa.length + 1; i++) {
			for (int j = 0; j < p.pessoa.length; j++) {
				System.out.println(
						(j == 0 ? "Digite o seu nome: " : j == 1 ? "Digite o seu peso: " : "Digite a sua altura: "));
				p.pessoa[j][i] = sc.next();
			}
		}
		sc.close();
		q = p.quem(p.pessoa, p.comparar(p.pessoa, 1));
		System.out.println(p.pessoa[0][q] + " tem o maior peso.");
		
		q = p.quem(p.pessoa, p.comparar(p.pessoa, 2));
		System.out.println(p.pessoa[0][q] + " tem a maior altura.");
		
		System.out.println(String.format("%.2f",  p.media(p.pessoa, 1)) + " foi a média de peso.");
		System.out.println(String.format("%.2f",  p.media(p.pessoa, 2)) + " foi a média de altura.");
	}

}
