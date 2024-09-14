package br.com.serratec.repetidas;

import java.io.File;
import java.util.Scanner;

public class LeiaArquivo {

	public static void main(String[] args) {
		LeituraRepetida lr = new LeituraRepetida();

		try {
			Scanner sc = new Scanner(new File("/curso/repetidos.csv"));
			while (sc.hasNext()) {
				String linha = sc.nextLine();
				if (!linha.isEmpty()) {
					lr.armazenar(linha.split(";"));
				}
			}
			sc.close();

			System.out.println(lr.getRepetidas());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
