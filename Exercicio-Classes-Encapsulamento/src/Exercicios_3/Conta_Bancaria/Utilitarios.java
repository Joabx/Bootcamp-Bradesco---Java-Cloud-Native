package Exercicios_3.Conta_Bancaria;

public class Utilitarios {


    public static void menu(){

        System.out.println("=== Escolha uma das opções ===");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Consultar cheque especial");
        System.out.println("3 - Depositar dinheiro");
        System.out.println("4 - Sacar dinheiro");
        System.out.println("5 - Pagar um boleto");
        System.out.println("6 - Verificar se a conta está usando cheque especial");
        System.out.println("0 - Sair");

    }


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
    
}
