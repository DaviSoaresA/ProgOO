package exercicio;

import java.util.Scanner;

public class TesteVenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fixo f1 = new Fixo("Joana", "174618461", 2000., 0.03);
		Fixo f2 = new Fixo("Maria", "124146147", 2000., 0.03);

		char op;
		double total = 0., valorVenda = 0.;

		System.out.println("----------Sistema de Vendas----------");

		do {
			System.out.println("Vendedore:\n1- " + f1.getNome() + "\n2- " + f2.getNome());
			System.out.println("Escolha um(a) Vendedor(a):");
			op = sc.next().charAt(0);
			switch (op) {
			case '1':
				System.out.println("Digite o valor da Venda:");
				valorVenda = sc.nextDouble();
				f1.calcularSalario(valorVenda);
				total += valorVenda;
				break;
			case '2':
				System.out.println("Digite o valor da Venda:");
				valorVenda = sc.nextDouble();
				f2.calcularSalario(valorVenda);
				total += valorVenda;
				break;
			default:
				break;
			}
			System.out.println((op == '1' || op == '2' ? "Deseja encerrar o programa? (S/N)" : "Opção Inválida!"));
			op = (op == '1' || op == '2' ? sc.next().charAt(0) : 'N');
			op = Character.toUpperCase(op);

		} while (op != 'S');
		sc.close();

		System.out.println("-------Salário dos Vendedores-------");
		System.out.println(f1 + "\n" + f2);
		System.out.println("-----------Total de Vendas-----------");
		System.out.println("Total: R$" +String.format("%.2f", total));
	}

}
