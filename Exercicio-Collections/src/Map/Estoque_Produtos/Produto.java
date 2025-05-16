package Map.Estoque_Produtos;

public class Produto {

    /*Atributos */
    private String nome;
    private double preco;
    private int quantidade;
    
    
    /*Construtores */
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    /*Getters e Setters */
    public String getNome() {
        return nome;
    }


    public double getPreco() {
        return preco;
    }


    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return nome + "||| Preço= " + preco + "||| Quantidade= " + quantidade + "\n";
    }

    
    
    
    
}
