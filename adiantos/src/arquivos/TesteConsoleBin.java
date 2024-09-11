package arquivos;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TesteConsoleBin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ConsoleBin cb = new ConsoleBin();

		System.out.println("Digite seu nome:");
		cb.setNome(sc.next());

		System.out.println("Digite sua idade:");
		cb.setIdade(sc.nextInt());

		System.out.println("Digite sua altura:");
		cb.setAltura(sc.nextDouble());
		sc.close();

		try {
			FileOutputStream arq = new FileOutputStream("arquivo.dat");
			DataOutputStream gravarArq = new DataOutputStream(arq);
			gravarArq.writeChars(cb.toString());
			gravarArq.close();
			
			BufferedReader br = new BufferedReader(new FileReader("arquivo.dat"));
			while (br.ready()) {
				System.out.println(br.readLine());
			}
			br.close();

		} catch (IOException e) {
			System.out.println("Erro!!!");
		}

	}

}
