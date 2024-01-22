package br.com.logicaprogramacao;

public class Main {

    public static void main(String[] args) {

        Palindrono palindrono = new Palindrono();

        //essa deve retornar que é palindromo
        palindrono.validarPalindromo("arara");

        //essa deve retornar que não palindromo
        palindrono.validarPalindromo("carro");

    }
}
