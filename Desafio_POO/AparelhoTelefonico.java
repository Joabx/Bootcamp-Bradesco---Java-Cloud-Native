package Desafio_POO;

public class AparelhoTelefonico extends Aplicativos {

    private String numero; 


    /*Construtores */
    public AparelhoTelefonico(){

       
        abrir();
        

    }

    /*Métodos ------------------------------------------------------ */
    public String ligar(String numero){
        this.numero = numero;
        return this.numero;
    }

    public void atender(){

    }

    public void iniciarCorreioVoz(){
        
    }


    @Override
    public String toString(){

        return "Aparelho Telefônico";


        
    }



    
}
