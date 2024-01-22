package br.com.logicaprogramacao;

public class Palindrono {

    public void validarPalindromo(String palavra) {
        if (checarPalindromo(palavra)) {
            System.out.printf("A palavra %s é um palíndromo\n", palavra);
        } else {
            System.out.printf("A palavra %s não é um palíndromo\n", palavra);
        }
    }

    private boolean checarPalindromo(String palavra) {
        palavra = palavra.trim().toLowerCase();

        char[] inicial = palavra.toCharArray();
        int qntCaracteres = inicial.length;

        char[] contrario = new char[qntCaracteres];

        for (int i = qntCaracteres - 1, j = 0; i >= 0; i--) {
            if (Character.isLetter(inicial[i])) {
                contrario[j] = inicial[i];
                j++;
            }
        }

        for (int i = 0; i < qntCaracteres; i++) {
            if (inicial[i] != contrario[i]) {
                return false;
            }
        }

        return true;
    }
}