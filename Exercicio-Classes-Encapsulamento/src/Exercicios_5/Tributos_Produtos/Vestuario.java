package Exercicios_5.Tributos_Produtos;



public class Vestuario implements Impostos{

    private double valorProduto;
    /*Construtores ----------------------------------------------------------*/
    public Vestuario(double valorProduto){


        this.valorProduto += valorProduto * 0.025;
    }

   

    @Override
    public double  CalcularImpostos() {

        return valorProduto;


    


    }
    
}
