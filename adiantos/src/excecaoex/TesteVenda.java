package excecaoex;

import java.time.LocalDate;

public class TesteVenda {

	public static void main(String[] args) {
		Produto p1 = new Produto(1247, "Tv", 1000., Categoria.ELETRONICO);
		Produto p2 = new Produto(3356, "Pneu", 200., Categoria.AUTOMOTIVO);
		Produto p3 = new Produto(414, "Celular", 2500., Categoria.ELETRONICO);
		
		Venda v1 = new Venda(p1, LocalDate.now(), 0);
		Venda v2 = new Venda(p2, LocalDate.now(), 20);
		Venda v3 = new Venda(p3, LocalDate.now(), 10);
		
		System.out.println(v1);
		
		v1.calcularVenda();
		v2.calcularVenda();
		v3.calcularVenda();
		
		System.out.println("----------------------------");
		System.out.println("Total Geral Venda: R$" + String.format("%.2f",Venda.getTotalVenda()));
	}

}
