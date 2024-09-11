package list;

import java.util.ArrayList;
import java.util.List;

public class TesteAluno {

	public static void main(String[] args) {		
		List<Aluno> alunos = new ArrayList<Aluno>();

		alunos.add(new Aluno("Guilherme", 10., 8.));
		alunos.add(new Aluno("João", 8., 9.));

		try {
			for (Aluno a : alunos) {
				System.out.println(a + "\n");
			}
		} catch (AlunoException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
