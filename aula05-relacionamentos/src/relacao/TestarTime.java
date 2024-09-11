package relacao;

public class TestarTime {

	public static void main(String[] args) {
		Atleta a1 = new Atleta("Roberto", 28);
		Atleta a2 = new Atleta("Thiago", 24);
		Atleta a3 = new Atleta("Yago", 22);
		
		Time time = new Time("Serrano", new Atleta[3]);
		
		time.addAtleta(a1);
		time.addAtleta(a2);
		time.addAtleta(a3);
		
		System.out.println(time);
		time.mostrarTime();
		
	}

}
