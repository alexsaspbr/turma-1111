package br.com.logicaprogramacao;

import br.com.logicaprogramacao.Palindrono;
public class Main {

    public static void main(String[] args) {

        Palindrono palindrono = new Palindrono();

        //essa deve retornar que é palindromo
        System.out.println(palindrono.validarPalindromo("arara"));

        //essa deve retornar que não palindromo
        System.out.println(palindrono.validarPalindromo("carro"));

    }

}
