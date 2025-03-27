package Exercicios_3.Carro;

public class Utilitarios {


    public static void menu(){

        System.out.println("=== Escolha uma das opções ===");
        System.out.println("1 - Ligar o carro");
        System.out.println("2 - Desligar o carro");
        System.out.println("3 - Acelerar");
        System.out.println("4 - Diminuir velocidade");
        System.out.println("5 - Virar para esquerda/direita");
        System.out.println("6 - Verificar velocidade");
        System.out.println("7 - Trocar a marcha");
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




