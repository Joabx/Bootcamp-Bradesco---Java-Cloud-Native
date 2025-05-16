package List.Carrinho_Compras;

public class Item {


    private double preco;
    private int quantidade;
    private String nome;

    /*Construtores ------------------------------------------------------------------ */
    public Item(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    /*Getters e Setters ------------------------------------------------------------------ */
    public double getPreco(){
        return preco;

    }

    
    public int getQuantidade(){
        return quantidade;

    }

    
    public String getnome(){
        return nome;

    }

    




}
