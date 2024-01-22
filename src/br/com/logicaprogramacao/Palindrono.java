package br.com.logicaprogramacao;

public class Palindrono {

    public String validarPalindromo(String palavra) {
        if (checarPalindromo(palavra)) {
            return String.format("O texto \"%s\" é um palíndromo", palavra);

        } else {
            return String.format("O texto \"%s\" não é um palíndromo", palavra);
        }
    }

    private boolean checarPalindromo(String palavra) {

        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
