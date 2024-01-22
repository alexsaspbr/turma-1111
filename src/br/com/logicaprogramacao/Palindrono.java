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
        for(int i = 0, j = palavra.length() - 1; i <= j; i++, j--) {
            if (palavra.charAt(i) != palavra.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}
