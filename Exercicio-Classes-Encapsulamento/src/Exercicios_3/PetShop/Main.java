package Exercicios_3.PetShop;

import java.util.Scanner;

public class Main { 
    
    

    public static void main(String[] args) {

        String nomePet;
        int opcao;

        
        Scanner      scanner      = new Scanner(System.in);
        System.out.println("Digite o nome do Pet: ");
        nomePet = scanner.nextLine();
        Pet          pet          = new Pet();
        pet.setNomePet(nomePet);
        MaquinaBanho maquinaBanho = new MaquinaBanho(pet);
        
        
        Utils.simularEspera(1000);
        
        
        do{ 
            
            Utils.menu();
            opcao = scanner.nextInt();

            if(opcao < 0){

                Utils.simularEspera(1000);
                System.out.println("Opção inválida, tente novamente");
                Utils.simularEspera(1000);

            }
            switch (opcao) {

            case 1:

                maquinaBanho.darBanho(); 
                break;
                
            case 2:
                maquinaBanho.reporAgua();
                
                break;
            case 3:
                maquinaBanho.reporShampoo();
                
                break;
            case 4:
                maquinaBanho.verificarNivelAgua();
                
                break;
            case 5:
                maquinaBanho.verificarNivelShampoo();

                break;
            case 6:
                maquinaBanho.verificarPetBanho();
                
                break;
            case 7:
                maquinaBanho.entradaPetMaquina();
                
                break;
            case 8:
                maquinaBanho.saidaPetMaquina();
                
                break;
            case 9:
                maquinaBanho.limparMaquina();
                
                break;
            case 0:
                
                System.out.println("Saindo...");
                Utils.simularEspera(1000);

                break;           
            
           }
            
        }while(opcao != 0);

        scanner.close();
        




       
    }

    




}
