package Desafio_POO;

public class NavegadorInternet extends Aplicativos {


    private String url; 


    /*Construtores */
    public NavegadorInternet(){

      
        abrir();


    }





    /*Métodos ------------------------------------------------------ */
    public String exibirPagina(String url){
        this.url = url;
        return this.url;
        
    }

    public void adicionarNovaAba(){

    }

    public void atualizarPagina(){

    }


    @Override
    public String toString(){

        return "Navegador Internet ";


        
    }

    

}
