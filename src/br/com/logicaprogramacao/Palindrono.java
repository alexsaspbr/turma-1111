package br.com.logicaprogramacao;

import java.sql.Array;
import java.util.Arrays;

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

        char[] palavraPreparadaArray = palavraPreparada.toCharArray();
        char[] arrayInvertido = new char[palavraPreparada.length()];

        for (int i = 0; i < palavraPreparada.length(); i++) {
            arrayInvertido[i] = palavraPreparadaArray[palavraPreparada.length() - 1 - i];
        }

        return Arrays.equals(arrayInvertido,palavraPreparadaArray);
    }

}
