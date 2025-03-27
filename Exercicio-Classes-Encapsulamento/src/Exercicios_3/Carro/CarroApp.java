package Exercicios_3.Carro;

import java.util.Scanner;

public class CarroApp {
    

    public static void main(String[] args) {
        int selecao;

        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();



        do{


            Utilitarios.menu();
            selecao = scanner.nextInt();
            if(selecao < 0){

                Utilitarios.simularEspera(1000);
                System.out.println("Opção inválida, tente novamente");
                Utilitarios.simularEspera(1000);
            }

            switch (selecao) {
                case 1:

                    carro.ligarCarro();
                    
                    break;
                case 2:

                    carro.desligarCarro();

                    break;

                case 3:
                    carro.acelerar();

                    break;

                case 4:
                    carro.diminuirVelocidade();

                    break;
                case 5:
                    carro.direcaoCarro();

                    break;
                case 6:
                    carro.verificarVelocidade();

                    break;
                case 7:
                    carro.trocarMarcha();

                    break;
                default:
                
                    break;
            }

        }while(selecao != 0);
    
        scanner.close();
    }

}
