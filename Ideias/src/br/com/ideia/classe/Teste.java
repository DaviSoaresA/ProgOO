package br.com.ideia.classe;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		Cpf cpf;

		try {
			cpf = Cpf.valueOf(JOptionPane.showInputDialog(null, "Digite o seu CPF:"));
			

			System.out.println(cpf);
		} catch (HeadlessException e) {
			e.printStackTrace();
		} catch (CpfException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
