package Exercicios_5.Tributos_Produtos;



public class Saude implements Impostos{

    private double valorProduto;
    /*Construtores ----------------------------------------------------------*/
    public Saude(double valorProduto){


        this.valorProduto += valorProduto * 0.015;
    }

   

    @Override
    public double CalcularImpostos() {

        
        return valorProduto;


    


    }
    
}
