package br.com.logicaprogramacao;

public class Main {

    public static void main(String[] args) {

        Palindromo palindromo = new Palindromo();

        //essa deve retornar que é palindromo
        System.out.println(palindromo.validarPalindromo("arara"));
        System.out.println(palindromo.validarPalindromo("SocorramMeSubiNoOnibusEmMarrocos"));

        //essa deve retornar que não palindromo
        System.out.println(palindromo.validarPalindromo("carro"));

    }

}
