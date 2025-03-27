package Exercicios_4.Hierarquia_Cinema;

import java.util.Scanner;

import Exercicios_4.Hierarquia_Cinema.Ingresso.TipoAudio;

public class CinemaApp {

    

    public static void main(String[] args) {

        int selecao;
        int pessoas;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do filme e o seu valor... ");
        Ingresso ingresso = new Ingresso(scanner.nextLine(), scanner.nextDouble());
        System.out.println("Filme " +ingresso.getNomeFilme()+ ", com ingresso no valor de " +ingresso.getValor()+ " reais.");

        System.out.println("Gostaria de comprar ingresso para quantas pessoas?");
        pessoas = scanner.nextInt();

        while (pessoas <= 0) {
            System.out.println("Por favor, insira um número válido de pessoas...");
            pessoas = scanner.nextInt();
        }
        
        
        if (pessoas == 1 ){

            ingresso = new Meia_Entrada(ingresso.getNomeFilme(), ingresso.getValor());
            ingresso.valorMeia();
            
        }else{

            ingresso = new Familia(ingresso.getNomeFilme(), ingresso.getValor()); 
            ingresso.setPessoas(pessoas);
            ingresso.valorFamilia();

        }
       
        

        System.out.println("Selecione o tipo de áudio do filme: ");
        System.out.println("Pressione 0 para Dublado ou 1 para Legendado...");
        selecao = scanner.nextInt();
        
        while (selecao < 0 || selecao > 1) {
            System.out.println("Por favor, insira um número válido...");
            selecao = scanner.nextInt();
        }
        

        if(selecao == 0) ingresso.setTipoAudio(TipoAudio.DUBLADO);

        else if(selecao == 1 ) ingresso.setTipoAudio(TipoAudio.LEGENDADO);
      
       
        System.out.println("A compra de " +pessoas+ " ingresso(s) com o desconto de 5% ficará por " +ingresso.getValor());
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println("Filme escolhido foi " +ingresso.getNomeFilme()+ " " +ingresso.getTipoAudio());
        


        scanner.close();
        
        
        
        
    }

    

    //*Getters e Setters */
    


}