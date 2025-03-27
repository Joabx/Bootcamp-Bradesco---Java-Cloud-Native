package Desafio_POO;


public abstract class Aplicativos {


    public void abrir(){

        
        System.out.println("Aplicativo abriu o app " + toString());
        Utils.simularEspera(200);

    }

    public void fechar(){

        
        System.out.println("Aplicativo fechou o app " + toString());
        Utils.simularEspera(200);

    }




}
