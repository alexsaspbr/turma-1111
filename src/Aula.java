import veiculos.Veiculo;

public class Aula {

    public static void main(String[] args) {

        //organizacao do codigo - OK
        //revisao
            //modificador de acesso - OK
            //tipos - OK
            //operadores - OK
            //metodos - OK
            //casting
        //estruturas de repeticao
        //vetor e matriz
        //tratamento de erros
        //debugging
        //git

        // estatico, acesso de qualquer lugar do projeto
        Veiculo veiculo = new Veiculo();
        Veiculo veiculo2 = new Veiculo();
        Veiculo.teste = "nao alugado";
        Veiculo.testar();
        new Aluguel().alugar();
        System.out.printf("\nveiculo 1 %s \n\n veiculo 2 %s", veiculo.testar(), veiculo2.testar());
        //veiculo2.motor

        veiculo.tipos();
    }

}