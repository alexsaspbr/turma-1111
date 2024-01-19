package colecoes;

public class ListaEncadeada {

    private Item primeiro;

    public void add(int numero) {
        if (isListaVazia()) {
            this.primeiro = new Item(numero);
        } else {
            Item ultimo = buscarUltimo();
            Item proximo = new Item(numero);
            ultimo.setProximo(proximo);
        }
    }

    private Item buscarUltimo() {
        Item ultimo = this.primeiro;
        while (ultimo.getProximo() != null) {
            ultimo = ultimo.getProximo();
        }
        return ultimo;
    }

    private boolean isListaVazia() {
        return primeiro == null;
    }

    public void remove(int numero) {
        if (isListaVazia()) {
            System.out.println("Lista Vazia");
            return;
        }

        Item anterior = null;
        Item atual = this.primeiro;
        while (atual.getValor() != numero) {
            anterior = atual;
            atual = atual.getProximo();
            if (atual == null) {
                System.out.println("Valor nao existe na lista");
                return;
            }
        }

        if(anterior == null){
            this.primeiro = atual.getProximo();
            return;
        }

        anterior.setProximo(atual.getProximo());

    }

    public void imprimir() {
        Item atual = this.primeiro;
        while(atual != null) {
            System.out.println(atual.getValor());
            atual = atual.getProximo();
        }
    }

}
