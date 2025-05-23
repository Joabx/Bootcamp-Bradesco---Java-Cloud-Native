package Map.Livraria_Online;

import java.util.Comparator;
import java.util.Map;

public class Livro {

    /*Atributos */
    private String titulo, autor;
    private Double preco;


    /*Construtores */
    public Livro(String titulo, String autor, Double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    /*Getters e Setters */
    public String getTitulo() {
        return titulo;
    }


    public String getAutor() {
        return autor;
    }


    public Double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return titulo + " ||| Autor= " + autor + " ||| Preço= " + preco + "\n";
    }

    
    

    
    


    
}

class ComparatorPorPreco implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return Double.compare(l1.getValue().getPreco(), l2.getValue().getPreco());
    }
}

class ComparatorPorAutor implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getAutor().compareToIgnoreCase(l2.getValue().getAutor());
    }
}
