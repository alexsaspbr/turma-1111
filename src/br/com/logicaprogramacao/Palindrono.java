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
        int inicio = 0, fim = palavra.length() - 1;

        while (fim > inicio) {
            if (palavra.charAt(inicio) != palavra.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }

        return true;
    }

}
