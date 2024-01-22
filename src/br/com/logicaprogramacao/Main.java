package br.com.logicaprogramacao;

public class Main {

    public static void main(String[] args) {

        Palindrono palindrono = new Palindrono();
        String result;

        //essa deve retornar que é palindromo
        result = palindrono.validarPalindromo("alala");
        System.out.println(result);

        //essa deve retornar que não palindromo
        result = palindrono.validarPalindromo("carros");
        System.out.println(result);
    }

}
