public class Palindromo {

    public String validarPalindromo(String palavra) {
        if (checarPalindromo(palavra)) {
            return String.format("A palavra %s é um palíndromo", palavra);
        } else {
            return String.format("A palavra %s não é um palíndromo", palavra);
        }
    }

    private boolean checarPalindromo(String palavra) {
        //TODO implementar logica

        int i = 0; // primeira letra da palavra
        int j = palavra.length() - 1; // ultima letra da palavra

        while(i < j){
            if (palavra.charAt(i) != palavra.charAt(j)){
                return false;
            } // move para a proxima letra.
            i++;
            j--;
        }
        // se todas forem iguais é palintromo
        return true;
    }
}
