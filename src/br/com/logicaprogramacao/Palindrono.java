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
        int tamanho = palavra.length();
        int i = 0;
        int j = tamanho-1;
        while (i < j){
            if (palavra.charAt(i) != palavra.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
