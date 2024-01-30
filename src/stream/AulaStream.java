package stream;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class AulaStream {

    public static void main(String[] args) {

        List<Livro> livros = new ArrayList<>();

        livros.add(new Livro("Biblia Sagrada", 1000));
        livros.add(new Livro("Crime e castigo", 700));
        livros.add(new Livro("Codigo limpo", 400));
        livros.add(new Livro("Crime e castigo V2", 1400));
        livros.add(new Livro("O homem que calculava", 700));
        livros.add(new Livro("Algoritmos e pratica - Thommas Cormem", 37700));
        //livros.add(new Livro(null, 37700));
        livros.add(new Livro("Algoritmos e pratica - Thommas Cormem", 400));

        //foreach
        //livros.stream().forEachOrdered(System.out::print);

        //Operacoes Intermediarias (Pipeline)

        //filter
     /*   livros.stream()
                .filter(livro -> 500 <= livro.getPaginas())
                .forEach(System.out::print);*/

        //map
/*        livros.stream()
                .filter(livro -> 500 <= livro.getPaginas())
                .map(AulaStream::formataLivro)
                .forEach(System.out::println);*/

        //sorted
/*        livros.stream()
                .sorted(Comparator.comparing(Livro::getPaginas))
                .forEach(System.out::print);*/


        //distinct
/*        livros.stream()
                .distinct()
                .forEach(System.out::print);*/

        //limit
  /*      livros.stream()
                .limit(2)
                .forEach(System.out::print);*/

        //skip
/*        livros.stream()
                .skip(4)
                .limit(2)
                .forEach(System.out::print);*/


        //Operacoes Finais (Terminal)

        //count
      /*  System.out.println("Quantidade de livros: " + livros.stream()
                .count());*/

        //allMatch
        /*boolean naoTemTituloNulo = livros.stream()
                .allMatch(livro -> Objects.nonNull(livro.getTitulo()));
        System.out.println(naoTemTituloNulo ? "Nao ha titulos nulos" : "Ha titulos nulos");*/


        //anyMatch
/*        boolean temTituloNulo = livros.stream()
                .anyMatch(livro -> Objects.isNull(livro.getTitulo()));
        System.out.println(temTituloNulo ? "Ha titulos nulos" : "Nao ha titulos nulos");*/

        //noneMatch
        /*boolean naoTemTituloNulo = livros.stream()
                .noneMatch(livro -> Objects.isNull(livro.getTitulo()));
        System.out.println(naoTemTituloNulo ? "Nao ha titulos nulos" : "Ha titulos nulos");*/


        //collect
        List<String> livrosAcima500Paginas = livros.stream()
                .filter(livro -> 500 <= livro.getPaginas())
                .map(AulaStream::formataLivro)
                .collect(Collectors.toList());

        Map<Integer, List<Livro>> livrosPorPagina = livros.stream()
                .collect(Collectors.groupingBy(Livro::getPaginas));

        livrosPorPagina.get(400).stream().forEach(System.out::print);

    }

    public static String formataLivro(Livro livro) {
        return String.format("Livro: %s - Total de paginas %d", livro.getTitulo(), livro.getPaginas());
    }

}
