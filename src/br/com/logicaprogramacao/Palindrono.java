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
        int palavraLen = palavra.length();
        for (int i = 0; i < palavraLen / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(palavraLen - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
