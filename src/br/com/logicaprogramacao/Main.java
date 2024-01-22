package br.com.logicaprogramacao;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("pt", "BR"));

        Palindrono palindrono = new Palindrono();

        //essa deve retornar que é palindromo
        System.out.println(palindrono.validarPalindromo("arara"));

        //essa deve retornar que não é palindromo
        System.out.println(palindrono.validarPalindromo("carro"));

        //essa deve retornar que é palindromo
        System.out.println(palindrono.validarPalindromo("omississimo"));

        //essa deve retornar que é palindromo
        System.out.println(palindrono.validarPalindromo("A cara rajada da jararaca"));

        //essa deve retornar que não é palindromo
        System.out.println(palindrono.validarPalindromo("santander coders 2023 2a"));

    }

}
