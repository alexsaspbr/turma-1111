package colecoes;

public class Item {
    private Integer valor;

    private Item proximo;

    public Item(){}

    public Item(int valor) {
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Item getProximo() {
        return proximo;
    }

    public void setProximo(Item proximo) {
        this.proximo = proximo;
    }
}
