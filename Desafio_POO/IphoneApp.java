package Desafio_POO;

public class IphoneApp{


    
    public static void main(String[] args) {

        Utils.simularEspera(200);
        ReprodutorMusical reprodutorMusical   = new ReprodutorMusical();
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        NavegadorInternet navegadorInternet   = new NavegadorInternet();
        

       
        reprodutorMusical.fechar();
        aparelhoTelefonico.fechar();
        navegadorInternet.fechar();


        
    }


}


