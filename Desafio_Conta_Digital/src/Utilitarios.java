public class Utilitarios {


    public static void simularEspera(int tempo){

        try {
            Thread.sleep(tempo);
            System.out.println(".");
            Thread.sleep(tempo);
            System.out.println(".");
            Thread.sleep(tempo);
            System.out.println(".");
        } catch (Exception e) {
            System.out.println("Simular espera deu ruim...");    
            e.printStackTrace();
        }
    }
    
}
