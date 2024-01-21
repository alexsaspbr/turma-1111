package br.com.logicaprogramacao;

import java.util.Locale;

public class Palindrono {

    public String validarPalindromo(String palavra) {

        if (checarPalindromo(palavra)) {
            return String.format("O texto \"%s\" é um palíndromo", palavra);

        } else {
            return String.format("O texto \"%s\" não é um palíndromo", palavra);
        }
    }

    private boolean checarPalindromo(String palavra) {
        String palavraPreparada = palavra.replaceAll(" ", "").toLowerCase();

        StringBuilder revertePalavra = new StringBuilder(palavraPreparada).reverse();
        String stringInvertida = revertePalavra.toString();

        return stringInvertida.equals(palavraPreparada);
    }

}
