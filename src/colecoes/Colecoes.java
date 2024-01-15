package colecoes;

import veiculos.Veiculo;

import java.util.*;

public class Colecoes {

    public static void main(String[] args) {

        List<String> nomesAL = new ArrayList();

        //adicionar itens na lista
        nomesAL.add("Alex");
        nomesAL.add("Alex");
        nomesAL.add("Davi");
        nomesAL.add("Bruno");

        //remove um item
        nomesAL.remove("Alex");

        System.out.println(nomesAL);

        Item listaEncadeada = null;

        Item no1 = new Item();
        //primeira adicao
        no1.setAnterior(null);
        no1.setValor(12);
        no1.setProximo(null);

        listaEncadeada = no1;

        //segunda adicao
        Item no2 = new Item();

        no2.setAnterior(listaEncadeada);
        no2.setValor(25);
        listaEncadeada.setProximo(no2);

        LinkedList<Object> linkedList = new LinkedList<>();

        //Map
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("nome", "Alex");
        hashMap.put("nome", "Davi");
        hashMap.put("idade", 36);

        System.out.println("Hash Map");
        hashMap.entrySet()
                .forEach(item -> System.out.printf("Chave %s Valor %s \n", item.getKey(), item.getValue()));

        Map<String, Object> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("nome", "Alex");
        linkedHashMap.put("idade", 36);

        System.out.println("LinkedHash Map");
        linkedHashMap.entrySet()
                .forEach(item -> System.out.printf("Chave %s Valor %s \n", item.getKey(), item.getValue()));

        //Set
        Set<Object> hashSet = new HashSet<>();
        hashSet.add("Alex");
        hashSet.add("Alex");
        System.out.println("HASH SET");
        hashSet.forEach(System.out::println);

        Set<Object> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Davi");
        linkedHashSet.add("Davi");
        linkedHashSet.add("Alex");
        System.out.println("LINKEDHASH SET");
        linkedHashSet.forEach(System.out::println);

    }


}
