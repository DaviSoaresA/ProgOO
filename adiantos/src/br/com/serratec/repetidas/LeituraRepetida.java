package br.com.serratec.repetidas;

import java.util.HashSet;
import java.util.Set;

public class LeituraRepetida {
	private Set<String> palavras = new HashSet<>();
	private Set<String> repetidas = new HashSet<>();

	public void armazenar(String... a) {
		for (String s : a) {
			if (palavras.contains(s)) {
				repetidas.add(s);
			} else {
				palavras.add(s);
			}
		}
	}

	public Set<String> getRepetidas() {
		return repetidas;
	}

}
