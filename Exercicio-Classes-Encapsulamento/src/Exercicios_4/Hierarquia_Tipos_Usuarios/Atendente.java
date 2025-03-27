package Exercicios_4.Hierarquia_Tipos_Usuarios;

public class Atendente extends Colaborador {

    
    private double valorCaixa;



    /*Construtores */
    public Atendente(String email, String senha){
        super(email,senha);
        setAdmin(false);
    }


    /*Métodos */
    public void receberPagamentos(double valorCaixa){


        this.valorCaixa = getValorCaixa() + valorCaixa;

    }
    
    
    public void fecharCaixa(){

    }

    
    /* Getters e Setters  */
    public double getValorCaixa(){
        return valorCaixa;
    }

    public void setValorCaixa(double valorCaixa){
        this.valorCaixa = valorCaixa;
        
    }
}
