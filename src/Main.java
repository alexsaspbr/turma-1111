import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra = coletarDados(sc);
        verificarPalavra(palavra);
        sc.close();
    }
    public static String coletarDados(Scanner sc){
        System.out.println("Digite uma palavra:");
        return sc.nextLine();
    }
    public static void verificarPalavra(String palavra) {
        int inicio = 0;
        int fim = palavra.length() - 1;

        while (inicio < fim) {
            if (palavra.charAt(inicio) != palavra.charAt(fim)) {
                System.out.println("A palavra escolhida não é palindrome!");
                return;
            }
            inicio++;
            fim--;
        }
        System.out.println("A palavra escolhida é palindrome!");
    }
}