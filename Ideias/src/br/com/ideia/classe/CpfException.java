package br.com.ideia.classe;

/**
 * <p>
 * Throws when a CPF is invalid due to character quantity.
 * <p>
 */

public class CpfException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CpfException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
