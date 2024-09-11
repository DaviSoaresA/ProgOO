package aula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteMarca {

	public static void main(String[] args) {
		List<Marca> marcas = new ArrayList<>();
		
		List<Marca> marcas2 = Arrays.asList(new Marca(243, "Chevrolet"), new Marca(354, "Land Rover"));
		
		marcas.add(new Marca(123, "Ford"));
		marcas.add(new Marca(352, "Fiat"));
		marcas.add(new Marca(536, "Ferrari"));
		
		marcas.addAll(marcas2);
		
		for (Marca marca : marcas) {
			System.out.println(marca);
		}
		
		
	}

}
