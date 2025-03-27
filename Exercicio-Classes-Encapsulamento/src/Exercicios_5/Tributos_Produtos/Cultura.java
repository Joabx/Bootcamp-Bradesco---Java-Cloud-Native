package Exercicios_5.Tributos_Produtos;



public class Cultura implements Impostos{

    private double valorProduto;
    /*Construtores ----------------------------------------------------------*/
    public Cultura(double valorProduto){


        this.valorProduto += valorProduto * 0.04;
    }

   

    @Override
    public double CalcularImpostos() {


        return valorProduto;


    }
    
}
