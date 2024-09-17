package br.com.serratec.projeto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arquivo {
	private Verify v = new Verify();
	private List<Funcionario> funcionarios = new ArrayList<>();

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void lerArquivo() {

		try {
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite o nome do arquivo: ");
			String nomeArquivo = ler.next();
			
			Scanner sc = new Scanner(new File(nomeArquivo));

			while (sc.hasNext()) {
				String linha = sc.nextLine();

				if (!linha.isEmpty()) {
					linha = linha.trim();
					String[] dadosDaLinha = linha.split(";");

					String dado = dadosDaLinha[0];
					String dado1 = dadosDaLinha[1];
					String dado2 = dadosDaLinha[2];
					String dado3 = dadosDaLinha[3];
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

					try {

						funcionarios.add(new Funcionario(dado, dado1, LocalDate.parse(dado2, formatter),
								Double.parseDouble(dado3)));

					} catch (NumberFormatException e) {

						v.validCpf(dado1);
						v.validAge(LocalDate.parse(dado2, formatter));
						Dependente dependente = new Dependente(dado, dado1, LocalDate.parse(dado2, formatter),
								Parentesco.valueOf(dado3));
						if (!funcionarios.isEmpty()) {
							Funcionario ultimoFuncionario = funcionarios.get(funcionarios.size() - 1);
							ultimoFuncionario.adicionarDependente(dependente);

						}

					}

				}

			}

			sc.close();
			

		} catch (IOException e) {
			System.err.println("Arquivo não encontrado!");
		} catch (DependenteException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage() + "Erro!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			e.printStackTrace();
		}
	}

	public void escreverArquivo(int i) {
		try {
			switch (i) {
			case 1:
				BufferedWriter bw = new BufferedWriter(
						new FileWriter("C:\\Users\\Win\\Downloads\\saidafuncionario.txt"));
				for (Funcionario f : funcionarios) {
					bw.write(f.toString());
				}
				bw.close();
				break;
			case 2:
				BufferedWriter bw2 = new BufferedWriter(
						new FileWriter("C:\\Users\\Win\\Downloads\\saidafuncionario.csv"));
				for (Funcionario f : funcionarios) {
					bw2.write(f.toString());
				}
				bw2.close();
				break;
			}

		} catch (IOException e) {
			System.err.println("O Arquivo não foi encontrado!");
			e.printStackTrace();
		}
	}
	public int printOutput() {
		Scanner scanner = new Scanner(System.in);
		
		int escolha = 0;

		do {
			System.out.println("Mudar o formato de saída: ");
			System.out.println("1. Texto simples");
			System.out.println("2. Arquivo CSV");
			System.out.println("3. Se deseja sair");

			escolha = scanner.nextInt();

			switch (escolha) {
			case 1:
				return escolha;
			case 2:
				return escolha;
			case 3:
				break;
			default:
				System.out.println("Opção inválida!!!");
			}

		} while (escolha != 3);
		System.out.println("Programa encerrado!");
		scanner.close(); 
		
		return 0;
	}


}
