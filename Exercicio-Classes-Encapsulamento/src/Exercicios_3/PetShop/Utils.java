package Exercicios_3.PetShop;

public class Utils {

    public static void simularEspera(int tempo){
        try {
        
            Thread.sleep(tempo);
            System.out.println(" .");
            Thread.sleep(tempo);
            System.out.println(" .");
            Thread.sleep(tempo);
            System.out.println(" .");
        
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Erro ao simular espera");
        }
    }


    public static void menu(){

        System.out.println("=== Escolha uma das opções ===");
        System.out.println("1 - Dar banho no Pet");
        System.out.println("2 - Abastecer a máquina com água");
        System.out.println("3 - Abastecer a máquina com shampoo");
        System.out.println("4 - Verificar nível de água");
        System.out.println("5 - Verificar nível de shampoo");
        System.out.println("6 - Verificar se tem Pet no banho");
        System.out.println("7 - Colocar Pet na máquina");
        System.out.println("8 - Retirar Pet da máquina");
        System.out.println("9 - Limpar a máquina");
        System.out.println("0 - Sair");

    }

    
    
}
