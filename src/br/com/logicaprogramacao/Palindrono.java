package br.com.logicaprogramacao;

public class Palindrono {

    public String validarPalindromo(String palavra) {
        if (checarPalindromo(palavra)) {
            return String.format("A palavra %s é um palíndromo");
        } else {
            return String.format("A palavra %s não é um palíndromo");
        }
    }

    private boolean checarPalindromo(String palavra) {
        char[] caracteres = palavra.toCharArray();
        int comprimento = caracteres.length;

        for (int i = 0; i < comprimento / 2; i++) {
            if (caracteres[i] != caracteres[comprimento - 1 - i]) {
                return false;
            }
        }
        return true;
    }

}
