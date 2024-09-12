package br.com.serratec.exemplos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExemploTrabalho {

	public static void main(String[] args) {
		
		try {
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite o nome do arquivo:");
			String nomeArquivo = ler.next();
			ler.close();
			
			Scanner sc = new Scanner(new File(nomeArquivo));
			List<Empregado> empregados = new ArrayList<>();
			while (sc.hasNext()) {
				String linha = sc.nextLine();
				if (!linha.isEmpty()) {
					String[] dadosDaLinha = linha.split(";");
					String nome = dadosDaLinha[0];
					String profissao = dadosDaLinha[1];
					empregados.add(new Empregado(nome, profissao));
				}
			}
			sc.close();
			
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("/curso/saida.txt"));
			
			for (Empregado empregado : empregados) {
				bw.append(empregado.toString());
			}
			bw.close();
			
			BufferedReader br = new BufferedReader(new FileReader("/curso/saida.txt"));
			while (br.ready()) {
				System.out.println(br.readLine());
			}
			br.close();
					
		} catch (Exception e) {
			System.err.println("Erro");
		}
	}

}
