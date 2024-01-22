package br.com.logicaprogramacao;

public class Palindromo {

    public String validarPalindromo(String palavra) {
        if (checarPalindromo(palavra.toLowerCase())) {
            return String.format("A palavra %s é um palíndromo", palavra);
        } else {
            return String.format("A palavra %s não é um palíndromo", palavra);
        }
    }

    private boolean checarPalindromo(String palavra) {
        int length = palavra.length();
        for (int i = 0, j = length - 1; i < j; i++, j--) {
            if (palavra.charAt(i) != palavra.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}
