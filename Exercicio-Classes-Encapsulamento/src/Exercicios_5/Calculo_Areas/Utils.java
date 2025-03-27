package Exercicios_5.Calculo_Areas;

public class Utils {


    public static void menu(){

        System.out.println("======================================");
        System.out.println("=====ESCOLHA UMA FORMA GEOMÉTRICA=====");
        System.out.println("======================================");
        System.out.println("1- QUADRADO");
        System.out.println("2- RETÂNGULO");
        System.out.println("3- CIRCULO");
        System.out.println("0- Sair...");
        simularEspera(200);
        



    }

    public static void simularEspera(int tempo)   {

        try {

            System.out.println(".");
            Thread.sleep(tempo);
            System.out.println(".");
            Thread.sleep(tempo);
            System.out.println(".");

        } catch (InterruptedException e) {

            System.out.println("Erro ao simular espera...");
            e.printStackTrace();

        }
        

    }
    
}
