package Exercicios_3.Conta_Bancaria;

import java.util.Scanner;


public class BancoApp {

    


    public static void main(String[] args) {
        
        int selecao;
        double depositoInicial, depositoAdicional, valorBoleto, valorSacar;
        
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Digite o valor do desposito: ");
        depositoInicial = scanner.nextDouble();
        ContaCorrente novaCC = new ContaCorrente(depositoInicial);
        



        

       do {

        Utilitarios.simularEspera(200);
        Utilitarios.menu();
        

        selecao = scanner.nextInt();

        switch (selecao) {
            case 1:

                novaCC.consultarSaldo();               
                break;
            
            case 2:

                novaCC.consultarChequeEspecial();
                break;
            
            case 3:
                
                Utilitarios.simularEspera(200);
                System.out.println("Digite o valor para depósito: ");
                depositoAdicional = scanner.nextDouble();
                novaCC.depositarDinheiro(depositoAdicional);
                break;

            case 4:

                Utilitarios.simularEspera(200);
                System.out.println("Digite o valor para sacar: ");
                valorSacar = scanner.nextDouble();
                novaCC.sacarDinheiro(valorSacar);
                break;
            
            case 5:
                Utilitarios.simularEspera(200);
                System.out.println("Digite o valor do boleto: ");
                valorBoleto = scanner.nextDouble();
                novaCC.pagarBoleto(valorBoleto);
                break;

            case 6:

                novaCC.verificarChequeEspecial();
                break;

            default:

                Utilitarios.simularEspera(200);
                break;
        }


        
       } while (selecao!=0);
        
       scanner.close();
    }
    
}
