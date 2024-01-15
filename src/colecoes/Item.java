package colecoes;

public class Item {

    private Item anterior;
    private Integer valor;

    private Item proximo;

    public Item getAnterior() {
        return anterior;
    }

    public void setAnterior(Item anterior) {
        this.anterior = anterior;
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
