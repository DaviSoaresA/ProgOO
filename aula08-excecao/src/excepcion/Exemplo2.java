package excepcion;

public class Exemplo2 {

	public static void main(String[] args) {
		int vetor[] = {5,10,20};
		int i = 10, j = 1, resultado = 0;
		String texto = "string";
		
		try {
			resultado = i/j;
			System.out.println(vetor[2]);
			System.out.println(texto.toUpperCase());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Erro indice fora de faixa!");
		}catch (ArithmeticException e) {
			System.err.println("Divisão por zero!");
		}catch (NullPointerException e) {
			System.err.println("Valores nulos!");
		}
	}

}
