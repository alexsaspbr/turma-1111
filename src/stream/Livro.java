package stream;

import java.util.Objects;

public class Livro {

    private final int paginas;
    private String titulo;

    public Livro(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(titulo, livro.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getPaginas() {
        return paginas;
    }

    @Override
    public String toString() {
        return """
                Titulo: %s 
                   """.formatted(this.titulo);
    }
}
