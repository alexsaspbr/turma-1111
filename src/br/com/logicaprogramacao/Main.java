package br.com.logicaprogramacao;

public class Main {

    public static void main(String[] args) {

        Palindrono palindrono = new Palindrono();
        String resultado;

        //essa deve retornar que é palindromo
        resultado = palindrono.validarPalindromo("arara");
        System.out.println(resultado);

        //essa deve retornar que não palindromo
        resultado = palindrono.validarPalindromo("carro");
        System.out.println(resultado);

    }

}
