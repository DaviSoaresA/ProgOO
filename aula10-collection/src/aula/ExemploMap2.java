package aula;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap2 {

	public static void main(String[] args) {
		Map<Integer, String> mapas = new HashMap<>();
		
		mapas.put(24, "Ana");
		mapas.put(523, "Carlos");
		mapas.put(412, "Igor");
		mapas.put(41, "Adriana");
		
		System.out.println(mapas);
		
		for (Map.Entry<Integer, String> dados : mapas.entrySet()) {
			System.out.println(dados.getKey() + " - " + dados.getValue());
		}
	}

}
