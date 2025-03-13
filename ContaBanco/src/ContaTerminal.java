import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int numeroConta;
        String numeroContaDigitado;
        String agencia;
        String nomeCliente;
        double saldo = 237.48;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bom dia!!!");

        System.out.println("Digite seu nome completo: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        numeroConta = Integer.parseInt( numeroContaDigitado  = scanner.nextLine() ); 
        
        System.out.println("Digite a sua Agência: ");
        agencia = scanner.nextLine();

        scanner.close();
        System.out.println("Aguarde um momento...");
        
        System.out.println(".");
        Thread.sleep(1000);
        System.out.println(".");
        Thread.sleep(1000);
        System.out.println(".");
        Thread.sleep(1000);


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " +numeroConta+ " e seu saldo " +saldo+ " já está disponível para saque.");
        



      
        

        



    }





}
