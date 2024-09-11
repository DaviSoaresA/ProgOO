package excecaoex;

public class TransformaMaiusculo {

	public static void main(String[] args) {
		String fraseEntrada = null;
		String fraseSaida = null;

		try {
			fraseSaida = fraseEntrada.toUpperCase();
			System.out.println("Resultado: " + fraseSaida);
		} catch (Exception e) {
			System.err.println("Falha ao trasformar frase");
			System.err.println("Erro: " + e.getMessage());
		}
	}

}
