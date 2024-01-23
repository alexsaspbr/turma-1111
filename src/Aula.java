import veiculos.Veiculo;

public class Aula {

    public static void main(String[] args) {

        //organizacao do codigo - OK
        //revisao
            //modificador de acesso - OK
            //tipos - OK
            //operadores - OK
            //metodos - OK
            //casting - OK
        //estruturas de repeticao - OK
        //array e matriz - OK
        //collections - OK
        //sobrescrita - OK
        //tratamento de erros - OK
        //debugging - OK
        //git - OK
        //arquivos
        //stream

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