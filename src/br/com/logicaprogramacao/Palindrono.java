package br.com.logicaprogramacao;

public class Palindrono{
    public void validarPalindrono(String palavra){

            palavra = palavra.toLowerCase();

            int tamanhoPalavra = palavra.length();
            String isPalindrono = " ";

            for (int i = 0; i < tamanhoPalavra / 2; i++) {
                if (palavra.charAt(i) != palavra.charAt(tamanhoPalavra - 1 - i)) {
                    isPalindrono = "Não é um palindrono";
                }else {
                    isPalindrono = "É um palindrono";
                }
            }
        System.out.println(isPalindrono);
        }
    }
}
