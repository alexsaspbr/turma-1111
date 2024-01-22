package br.com.logicaprogramacao;

public class Main {

    public static void main(String[] args) {

        Palindrono palindrono = new Palindrono();

        palindrono.validarPalindromo("arara");
        System.out.println(palindrono.validarPalindromo("arara"));

        //essa deve retornar não palindromo
        palindrono.validarPalindromo("carro");
        System.out.println(palindrono.validarPalindromo("carro"));



    }

}
