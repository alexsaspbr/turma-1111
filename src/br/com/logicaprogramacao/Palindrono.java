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
        palavra = palavra.toLowerCase();

        char[] letra = palavra.toCharArray();

        int inicio = 0;
        int fim = letra.length - 1;

        while (inicio < fim) {
            if (letra[inicio] != letra[fim]) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
    }
}

