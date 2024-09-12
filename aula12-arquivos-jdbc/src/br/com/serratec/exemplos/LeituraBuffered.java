package br.com.serratec.exemplos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeituraBuffered {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("/curso/aula.txt"));
			while (br.ready()) {
				System.out.println(br.readLine());
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.err.println("Erro arquivo não encontrado!!!!!!!!!!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
