package enumexercicio;

import java.time.LocalDate;

public class TesteOficina {

	public static void main(String[] args) {
		Proprietario p = new Proprietario("André");
		Carro c = new Carro("Ford", LocalDate.of(2024, 8, 31), p, "4");
		
		c.valorCobrado += c.trocarOleo();
		c.valorCobrado += c.revisao();
		
		System.out.println(c);
	}

}
