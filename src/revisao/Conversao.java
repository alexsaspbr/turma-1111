package revisao;

public class Conversao {

    public static void main(String[] args) {

        //CASTING IMPLICITO
        float salario = 15000.0f;
        double salarioMaior = salario;
        int idade = 36;
        long idadeLong = idade;

        //CASTING EXPLICITO
        short idadeShort = (short)idade;
        String idadeString = "36";
        Integer idadeInteger = 36;
        idade = (int) idadeInteger;

    }

}
