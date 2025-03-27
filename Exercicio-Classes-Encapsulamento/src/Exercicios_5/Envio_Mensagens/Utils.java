package Exercicios_5.Envio_Mensagens;

public class Utils {


    public static void menu(){

        System.out.println("===========================");
        System.out.println("=====ESCOLHA UMA OPÇÃO=====");
        System.out.println("===========================");
        System.out.println("1- SMS");
        System.out.println("2- E-MAIL");
        System.out.println("3- Redes Sociais");
        System.out.println("4- WhatsApp");
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
