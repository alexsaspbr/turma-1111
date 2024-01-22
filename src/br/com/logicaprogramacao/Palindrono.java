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
        StringBuilder novaPalavra = new StringBuilder();
        char[] palavraArray = palavra.toCharArray();
        for (int i = palavraArray.length - 1; i >= 0; i-- ){
            novaPalavra.append(palavraArray[i]);
        }
        return novaPalavra.toString().equals(palavra);
    }

}
