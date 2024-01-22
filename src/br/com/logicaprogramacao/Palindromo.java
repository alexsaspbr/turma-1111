package br.com.logicaprogramacao;

public class Palindromo {

    public void validarPalindromo(String palavra) {
        if (checarPalindromo(palavra)) {
            System.out.printf("A palavra %s é um palíndromo%n", palavra);
        } else {
            System.out.printf("A palavra %s não é um palíndromo%n", palavra);
        }
    }

    private boolean checarPalindromo(String palavra) {
        char[] letras = new char[palavra.length()];
        for (int i=0;i<palavra.length();i++){
            letras[i] = palavra.charAt(i);
        }

        char[] letrasInvertidas = new char[letras.length];
        for (int i = 0; i < letras.length; i++) {
            letrasInvertidas[i] = letras[letras.length - 1 - i];
        }

        String palavraInvertida = new String(letrasInvertidas);

        return palavra.equals(palavraInvertida);
    }

}
