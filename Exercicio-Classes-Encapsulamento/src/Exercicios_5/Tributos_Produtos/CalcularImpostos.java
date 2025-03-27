package Exercicios_5.Tributos_Produtos;

import java.util.Scanner;

public class CalcularImpostos {

    public static void main(String[] args) {
        
        int selecao;
        double valorProduto;
        Impostos impostos;
        


        Scanner scanner = new Scanner(System.in);
        
        do{

            Utils.menu();
            selecao = scanner.nextInt();

            switch (selecao) {
                case 1:

                    System.out.println("Digite o valor do produto: ");
                    valorProduto = scanner.nextDouble();
                    impostos = new Alimentos(valorProduto);
                    Utils.simularEspera(200);
                    System.out.println("Impostos no valor de " +impostos.CalcularImpostos());
                    Utils.simularEspera(200);
                    break;

                case 2:

                    System.out.println("Digite o valor do produto: ");
                    valorProduto = scanner.nextDouble();
                    impostos = new Saude(valorProduto);
                    Utils.simularEspera(200);
                    System.out.println("Impostos no valor de " +impostos.CalcularImpostos());
                    Utils.simularEspera(200);
                    break;
                
                case 3:

                    System.out.println("Digite o valor do produto: ");
                    valorProduto = scanner.nextDouble();
                    impostos = new Vestuario(valorProduto);
                    Utils.simularEspera(200);
                    System.out.println("Impostos no valor de " +impostos.CalcularImpostos());
                    Utils.simularEspera(200);
                    break;

                case 4:

                    System.out.println("Digite o valor do produto: ");
                    valorProduto = scanner.nextDouble();
                    impostos = new Cultura(valorProduto);
                    Utils.simularEspera(200);
                    System.out.println("Impostos no valor de " +impostos.CalcularImpostos());
                    Utils.simularEspera(200);
                    break;
        
                default:

                    
                    Utils.simularEspera(200);
                    break;
            }


        }while(selecao > 0);


        scanner.close();


    }
    
}
