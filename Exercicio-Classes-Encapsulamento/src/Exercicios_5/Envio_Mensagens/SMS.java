package Exercicios_5.Envio_Mensagens;


public class SMS implements TipoMensagens{

    private String mensagem;

    
    /*Métodos ---------------------------------------------------------------------- */
    @Override
    public void enviarMensagem1() {

        System.out.println("Você enviou a seguinte mensagem via " +getClass().getSimpleName()+ ": " +mensagem);

        
        
    }



    /*Getters e Setter -------------------------------------------------------*/
    @Override
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    


   
    








}