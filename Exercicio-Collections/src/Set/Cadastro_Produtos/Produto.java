package Set.Cadastro_Produtos;

public class Produto implements Comparable<Produto>{

    /*Atributos */
    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;
    
    
    /*Construtores */
    public Produto(String nome, long codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    
    /*Getters e Setters */
    public String getNome() {
        return nome;
    }


    public long getCodigo() {
        return codigo;
    }


    public double getPreco() {
        return preco;
    }


    public int getQuantidade() {
        return quantidade;
    }


    /*----------------------------------------------------- */
    @Override
    public String toString() {
        return nome + "||| Código= " + codigo + " ||| Preço= " + preco + "||| Quantidade= " + quantidade + "\n";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (codigo ^ (codigo >>> 32));
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }




    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }


  
    
    
    

    
    
}
