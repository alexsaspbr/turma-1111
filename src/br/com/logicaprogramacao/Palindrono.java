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
        //Convert string to char array
        char[] pChar = palavra.toCharArray();

        //Loop through word and check positions
        int j = palavra.length() - 1;
        for (int i = 0; i < palavra.length(); i++) {
            if (pChar[i] != pChar[j])
                return false;
            else if (i == j)
                break;
            j--;
        }
        return true;
    }
}
