import veiculos.Moto;
import veiculos.Veiculo;

import java.util.List;

public class Aluguel {

    private List<Veiculo> veiculos;

    public long totalMotos() {
  /*      long contador = 0;
        for(int i = 0; i < veiculos.size(); i++) {
            if (veiculos.get(i) instanceof Moto)
                contador++;
        }
        return contador;*/

        return this.veiculos
                .stream()
                .filter(veiculo -> veiculo instanceof Moto)
                .count();

    }

    public void alugar() {

        Veiculo.teste = "alugado";
    }

    public void testar2(){
        //new Veiculo().cor;
    }

}
