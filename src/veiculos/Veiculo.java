package veiculos;

public class Veiculo {

    public void tipos() {

        //tipos primitivos
        //int, long, double, float, char, boolean, short, byte
        int numero = 10;

        if (numero == 10) {

        }

        //wrapper
        //Integer, Long, etc...

        Integer numero2 = 10;
        numero2 = numero;

        boolean ehIgual = numero2.compareTo(10) == 0;
        boolean ehMenor = numero2.compareTo(10) < 0;
        boolean ehMaior = numero2.compareTo(10) > 0;

        Integer num1 = Integer.valueOf(10);
        Integer num2 = Integer.valueOf(15);
        System.out.printf("é igual %b", (num1 == num2));

        Boolean par = false;

        if (10 % 2 == 0) {
            par = true;
        } else {
            par = false;
        }á
              // condicao ? (valor condicao verdadeira) : (valor condicao falsa)
        par = 10 % 2 == 0 ? true : false;


    }


    protected Motor motor;
    private String placa;

    String cor;

    private String marca;

    private String modelo;

    private String cintoSeguranca;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public static String teste;

    public static String testar() {
        return teste;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void acelerar() {
        if (!this.isLigado()) {
            throw new RuntimeException("Veiculo parado!");
        }
    }

    private boolean isLigado() {
        return this.motor.isLigado();
    }

}
