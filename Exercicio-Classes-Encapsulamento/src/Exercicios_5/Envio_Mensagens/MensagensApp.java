package Exercicios_5.Envio_Mensagens;

import java.util.Scanner;

public class MensagensApp{



    public static void main(String[] args) {

        int selecao;
        String mensagem;
        TipoMensagens tipoMsn;

        Scanner scanner = new Scanner(System.in);

        Utils.simularEspera(200);
        System.out.println("Digite a mensagem que gostaria de enviar: ");
        mensagem = scanner.nextLine();    

        do{
               
            Utils.simularEspera(200);
            Utils.menu();
            selecao = scanner.nextInt();
            //scanner.nextLine();

            switch (selecao) {
                case 1:

                    tipoMsn = new SMS();
                    tipoMsn.setMensagem(mensagem);
                    tipoMsn.enviarMensagem1();                
                    break;

                case 2:

                    tipoMsn = new EMAIL();
                    tipoMsn.setMensagem(mensagem);
                    tipoMsn.enviarMensagem1();                
                    break;

                case 3:
                
                    tipoMsn = new RedesSociais();
                    tipoMsn.setMensagem(mensagem);
                    tipoMsn.enviarMensagem1();                
                    break;

                case 4:

                    tipoMsn = new WhatsApp();
                    tipoMsn.setMensagem(mensagem);
                    tipoMsn.enviarMensagem1();                
                    break;
                    
                default:

                    System.out.println("Digite um valor válido...");
                    break;
            }



        }while(selecao > 0);
        


        scanner.close();

    }

    
}
