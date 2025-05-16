package List.Catalogo_Livros;

public class Livro {

    private String titulo, autor;
    private int anoPublicacao;

    /*Construtores ------------------------------------------------------------------- */
    public Livro ( String titulo, String autor, int anoPublicacao){

        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;

    }


    /*Getters e Setters -------------------------------------------------------------- */
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }


    /* To String sobrescrevendo o padrão ------------------------------------------------------- */
    @Override
    public String toString() {
        return "Título: " +titulo+ " | Autor: " +autor+ " | Ano da Publicação: " +anoPublicacao + " \n";
    }


    
    



    
    
}
