package br.com.logicaprogramacao;

public class Palindrono {

	public String validarPalindromo(String palavra) {
		if (checarPalindromo(palavra)) {
			return String.format("A palavra %s é um palíndromo", palavra);
		} else {
			return String.format("A palavra %s não é um palíndromo", palavra);
		}
	}

	private boolean checarPalindromo(String palavra) {
		char[] arrayPalavra = palavra.toCharArray();

		for (int i = 0, x; i < arrayPalavra.length / 2; i++) {
			x = arrayPalavra.length - 1 - i;

			if (arrayPalavra[i] != arrayPalavra[x]) {
				return false;
			}
		}

		return true;
	}

}
