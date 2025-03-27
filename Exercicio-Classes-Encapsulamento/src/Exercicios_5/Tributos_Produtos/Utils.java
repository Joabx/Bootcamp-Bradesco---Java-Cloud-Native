package Exercicios_5.Tributos_Produtos;

public class Utils {


    public static void menu(){

        System.out.println("===========================");
        System.out.println("=====CALCULAR IMPOSTOS=====");
        System.out.println("===========================");
        System.out.println("1- ALIMENTAÇÃO");
        System.out.println("2- SAÚDE E BEM ESTAR");
        System.out.println("3- VESTUÁRIO");
        System.out.println("4- CULTURA");
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
