package br.com.logicaprogramacao;

public class Palindrono {

    public String validarPalindromo(String palavra) {
        if (checarPalindromo(palavra)) {
            return String.format("A palavra %s é um palíndromo", palavra);
        } else {
            return String.format("A palavra %s nao é um palíndromo", palavra);
        }

    }

    private boolean checarPalindromo(String palavra) {

        int comprimento = palavra.length();

        for(int i = 0; i < comprimento / 2; i++) {
            //System.out.println("Comparando: " + palavra.charAt(i) + " e " + palavra.charAt(comprimento - 1 - i));
            if (palavra.charAt(i) != palavra.charAt(comprimento - 1 -i)) {
                return false;
            }

        }
        return true;
    }


}
