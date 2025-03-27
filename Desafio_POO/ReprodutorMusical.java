package Desafio_POO;

public class ReprodutorMusical extends Aplicativos{

    private String musica;


    /*Construtores */
    public ReprodutorMusical(){

        
        abrir();


    }

    
    
    /*Métodos ------------------------------------------------------ */
    public void tocar(){

        System.out.println("Tocou a música...");
    }

    public void pausar(){
        System.out.println("Pausou a musica...");

    }

    public String selecionarMusica(String musica){
        this.musica  = musica;
        return this.musica;
    }

    @Override
    public String toString(){

        return "Reprodutor Musical";


        
    }

}