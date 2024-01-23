
public class PalindromoChecker {

    public static void main(String[] args) {
        String palavra = "level";
        if (checarPalindromo(palavra)) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }
    }

    public static boolean checarPalindromo(String palavra) {
        palavra = palavra.toLowerCase();
        char[] caracteres = palavra.toCharArray();

        return checarPalindromoRecursivo(caracteres, 0, caracteres.length - 1);
    }

    private static boolean checarPalindromoRecursivo(char[] caracteres, int inicio, int fim) {
        // Caso base: se o índice de início for maior ou igual ao índice de fim, é um palíndromo
        if (inicio >= fim) {
            return true;
        }

        // Se os caracteres nos índices de início e fim não são iguais, não é um palíndromo
        if (caracteres[inicio] != caracteres[fim]) {
            return false;
        }

        // Chamada recursiva para os próximos caracteres
        return checarPalindromoRecursivo(caracteres, inicio + 1, fim - 1);
    }
}
