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
        int low = 0;
        int high = palavra.length() - 1;
        String palavraLowerCase = palavra.toLowerCase();
        while (low < high) {
            if (palavraLowerCase.charAt(low) != palavraLowerCase.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

}
