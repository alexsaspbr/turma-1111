import java.util.Scanner;

public class Cadastro {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();

        System.out.println("Digite sua idade:");
        int idade = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite seu e-mail:");
        String email = entrada.nextLine();

        System.out.println("""
                  
                  #####################
                  ##### CADASTRO ######
                  #####################
                  
                  Nome: %s
                  Idade: %d anos
                  E-mail: %s
                
                """.formatted(nome, idade, email));

    }

}