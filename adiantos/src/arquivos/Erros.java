package arquivos;

public class Erros {

	public static void main(String[] args) {
		
		String a = "12000";
		
		try {
			System.out.println(Double.parseDouble(a));
		} catch (NumberFormatException e) {
			System.out.println(a);
		}
	}

}
