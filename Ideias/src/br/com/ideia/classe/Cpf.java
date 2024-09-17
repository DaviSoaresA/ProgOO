package br.com.ideia.classe;

import java.util.Arrays;

public final class Cpf implements java.io.Serializable, Comparable<Cpf>, CharSequence {

	/**
	 * value é uma sequência de caracters com tamanho de 11, ele é fixo
	 * e o principal atributo da classe, também é o responsável pelo
	 * armazenamento do CPF.
	 */
	private final char[] value = new char[11];

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	public Cpf() {
		// Padrão
	}

	public Cpf(char[] seq) throws CpfException {
		this(convert(seq));
	}

	public Cpf(String seq) throws CpfException {
		this(convert(seq.toCharArray()));
	}

	public Cpf(Integer seq) throws CpfException {
		this(convert(seq.toString().toCharArray()));
	}

	public Cpf(Long seq) throws CpfException {
		this(convert(seq.toString().toCharArray()));
	}

	private Cpf(Cpf c) {
		System.arraycopy(c.value, 0, this.value, 0, c.value.length);
	}

	public void checkBoundsStartEnd(int start, int end, int length) {
		if (start < 0 || start > end || end > length) {
			throw new StringIndexOutOfBoundsException("Fora do limite!!");
		}
	}

	public Cpf subStringCpf(int start, int end) {
		checkBoundsStartEnd(start, end, length());

		Cpf novoCpf = new Cpf();

		for (int i = start; i < end; i++) {
			novoCpf.value[i - start] = this.value[i];
		}
		return novoCpf;
	}

	@Override
	public int length() {
		return value.length;
	}

	@Override
	public char charAt(int index) {
		if (index < 0 || index >= length()) {
			throw new IndexOutOfBoundsException("Esse caracter está fora do limite!");
		}
		return value[index];
	}

	@Override
	public CharSequence subSequence(int start, int end) {

		return this.subStringCpf(start, end);
	}

	@Override
	public int compareTo(Cpf o) {
		for (int i = 0; i < value.length; i++) {
			int comp = Character.compare(this.value[i], o.value[i]);
			if (comp != 0) {
				return comp;
			}
		}
		return 0;
	}

	public static Cpf valueOf(String o) throws CpfException {
		if (o == null || o.length() != 11) {
			throw new CpfException("Não foi possível fazer Converção!");
		}
		return convert(o.toCharArray());
	}

	public static Cpf valueOf(Integer o) throws CpfException {
		if (o == null || o.toString().length() != 11) {
			throw new CpfException("Não foi possível fazer Converção!");
		}
		return convert(o.toString().toCharArray());
	}

	public static Cpf valueOf(Long o) throws CpfException {
		if (o == null || o.toString().length() != 11) {
			throw new CpfException("Não foi possível fazer Converção!");
		}
		return convert(o.toString().toCharArray());
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	private static Cpf convert(char[] seq) throws CpfException {
		Cpf c = new Cpf();

		if (seq.length != 11) {
			throw new CpfException("Cpf Inválido");
		}
		System.arraycopy(seq, 0, c.value, 0, 11);
		return c;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(value);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cpf other = (Cpf) obj;
		return Arrays.equals(value, other.value);
	}
	
	

}
