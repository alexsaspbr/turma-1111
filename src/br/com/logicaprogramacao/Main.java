package br.com.logicaprogramacao;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        Palindrono palindrono = new Palindrono();

        //essa deve retornar que é palindromo
        System.out.println(palindrono.validarPalindromo("arara"));

        //essa deve retornar que não palindromo
        System.out.println(palindrono.validarPalindromo("carro"));

        //teste
        System.out.println(palindrono.validarPalindromo("SocorrammeSubiNoOnibusEmMarrocos"));

    }

}
