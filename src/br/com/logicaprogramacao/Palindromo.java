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
        for (int i = 0; i < palavra.length() - 1; i++) {
            for (int j = palavra.length() - 1; j > 0; j--) {
                return palavra.charAt(i) != palavra.charAt(j) ? false : true;
            }
        }
        return false;
    }

}
