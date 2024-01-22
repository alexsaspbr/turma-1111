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
        //TODO implementar logica
        return false;
    }

}
