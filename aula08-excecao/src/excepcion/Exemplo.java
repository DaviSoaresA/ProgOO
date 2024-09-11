package excepcion;

public class Exemplo {

	public static double calcular(int a, int b) throws ArithmeticException{
		/*if (b == 0 || a == 0) {
			throw new ArithmeticException("Erro de divisão por zero!");
		}*/
		
		return a / b;
		
	}

	public static void main(String[] args) {
		try {
			System.out.println("Entrando no Try");
			System.out.println("Resultado: " + calcular(10, 0));
			System.out.println("Finalizando Try");
		} catch (ArithmeticException e) {
			System.err.println("Erro de divisão por zero!");
			e.printStackTrace();
		} finally {
			System.out.println("Sempre é executado!");
		}
	}

}
