package br.com.logicaprogramacao;
public class Main {
    public static void main(String[] args) {
        
        Palindrono palindrono = new Palindrono();

        System.out.println(palindrono.validarPalindromo("arara"));
        System.out.println(palindrono.validarPalindromo("carro"));
    }
}
