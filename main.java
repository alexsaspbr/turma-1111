public class Palindromo {
    public static boolean checarPalindromo(String palavra) {
        char[] caracteres = palavra.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
            if (caracteres[inicio] != caracteres[fim]) {
                return false;
            }
            inicio++;
            fim--;
        }

        return true;
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            String palavra = args[0];
            if (checarPalindromo(palavra)) {
                System.out.println(palavra + " é um palíndromo.");
            } else {
                System.out.println(palavra + " não é um palíndromo.");
            }
        } else {
            System.out.println("Por favor, insira uma palavra como argumento.");
        }
    }
}
