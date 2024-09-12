package br.com.serratec.exemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class GravacaoBuffered {

	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("/curso/saida.txt"));
			bw.append(JOptionPane.showInputDialog("Digite seu nome:") + "\n");
			bw.append(JOptionPane.showInputDialog("Digite seu telefone:") + "\n");
			bw.append(JOptionPane.showInputDialog("Digite seu E-mail:") + "\n");
			bw.close();
			System.out.println("Arquivo gerado!");
		} catch (IOException e) {
			System.err.println("Arquivo Não EncontraDOOOOOO!!!!!!!!!!!!!!!!");
			e.printStackTrace();
		}
	}

}
