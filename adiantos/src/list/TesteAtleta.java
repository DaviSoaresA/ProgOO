package list;

public class TesteAtleta {

	public static void main(String[] args) {
		Atleta a1 = new Atleta("José", 32, "MC");
		Atleta a2 = new Atleta("Guilherme", 24, "VOL");
		Atleta a3 = new Atleta("Davi", 20, "SA");
		
		Time time = new Time("Serrano", "Pedro", "Matheus");
		
		time.adicionarAtleta(a1);
		time.adicionarAtleta(a2);
		time.adicionarAtleta(a3);
		
		System.out.println(time);
		time.mostrarTime();
	}

}
