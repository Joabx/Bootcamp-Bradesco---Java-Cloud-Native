package Exercicios_5.Tributos_Produtos;



public class Alimentos implements Impostos{

    private double valorProduto;
    /*Construtores ----------------------------------------------------------*/
    public Alimentos(double valorProduto){


        this.valorProduto += valorProduto * 0.01;
    }

   

    @Override
    public double CalcularImpostos() {


        return valorProduto;


    }
    
}
