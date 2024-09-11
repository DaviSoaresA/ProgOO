package aula;

public class VarArgs {

	public static void main(String[] args) {
		int total;

		total = calcularSoma(10, 4, 20, 40, 12, 100, 200, 100, 1);

		System.out.println("Total: " + total);
	}

	public static int calcularSoma(int num,int... valores) {
		int soma = 0;

		for (int valor : valores) {
			soma += valor;

		}

		return soma * num;

	}

}
