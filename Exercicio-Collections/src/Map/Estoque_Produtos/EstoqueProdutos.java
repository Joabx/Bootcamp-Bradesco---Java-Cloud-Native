package Map.Estoque_Produtos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    /*Atributos */
    private Map<Long, Produto> estoqueProdutoMap;

    /*Construtores */
    public EstoqueProdutos(){
        estoqueProdutoMap = new HashMap<>();
    }
    
    /*Métodos */
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutoMap.put(cod,new Produto(nome, preco, quantidade));

    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutoMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if (!estoqueProdutoMap.isEmpty()) {
            for(Produto p : estoqueProdutoMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
                
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutoMap.isEmpty()) {
            for(Produto p : estoqueProdutoMap.values()){
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                    
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        double menorPreco = Double.MAX_VALUE;
        Produto produtoMaisBarato = null;
        if (!estoqueProdutoMap.isEmpty()) {
            for(Produto p : estoqueProdutoMap.values()){
                if (p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                    
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        double maiorQuantidadeValor = Double.MIN_VALUE;
        Produto produtoValorQuantidade = null;
        if (!estoqueProdutoMap.isEmpty()) {
            for(Produto p : estoqueProdutoMap.values()){
                double valorTotalProduto = p.getPreco() * p.getQuantidade();
                if (valorTotalProduto > maiorQuantidadeValor ) {
                    produtoValorQuantidade = p;
                    maiorQuantidadeValor = valorTotalProduto;
                    
                }
            }
        }
        return produtoValorQuantidade;
    }
    



    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.exibirProdutos();
        
        estoqueProdutos.adicionarProduto(02L, "Gratis 150ml", 10, 25);
        estoqueProdutos.adicionarProduto(01L, "Gratis 1500ml", 1, 10);
        estoqueProdutos.adicionarProduto(03L, "Gratis 140ml", 4, 1);
        estoqueProdutos.adicionarProduto(04L, "Gratis 10ml", 25, 2);
        
        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque: " +estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("O Produto mais caro é: " +estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("O Produto mais barato é: " +estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("O Produto mais caro levando em conta a quantidade é: " +estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    }   


    




}
