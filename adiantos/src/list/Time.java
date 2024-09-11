package list;

import java.util.ArrayList;
import java.util.List;

public class Time {
	private String nomeTime;
	private String tecnico;
	private String diretor;
	private List<Atleta> atletas = new ArrayList<>();

	public Time(String nomeTime, String tecnico, String diretor) {
		this.nomeTime = nomeTime;
		this.tecnico = tecnico;
		this.diretor = diretor;
	}

	@Override
	public String toString() {
		return "Time: " + nomeTime + "\n";
	}


	public String getTecnico() {
		return tecnico;
	}

	public String getDiretor() {
		return diretor;
	}

	public String getNomeTime() {
		return nomeTime;
	}

	public void adicionarAtleta(Atleta atleta) {
		atletas.add(atleta);
	}

	public void mostrarTime() {

		for (Atleta a : atletas) {
			System.out.println(a);
		}
		return;

	}

}
