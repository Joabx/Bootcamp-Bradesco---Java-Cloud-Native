package Desafio_POO;


public class Utils {


    public static void simularEspera(int tempo){

        try {
            Thread.sleep(tempo);
            System.out.println(".");
            Thread.sleep(tempo);
            System.out.println(".");
            Thread.sleep(tempo);
            System.out.println(".");
        } catch (InterruptedException e) {
            
            System.out.println("Simular espera deu ruim...");    
            e.printStackTrace();
        }
       

    }
    
}
