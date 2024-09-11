package exercicios;

public class Fatorial {

	public static void main(String[] args) {

		int f = 1;
		for (int i = 1; i < 11; i++) {
			f = i;
			for (int j = i; j > 0; j--) {
				f *= ((j - 1) == 0 ? j : j - 1);

			}
			System.out.println("O fatorial de " + i + " é: " + f);
		}
	}

}
