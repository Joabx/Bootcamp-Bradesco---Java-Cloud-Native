package Exercicios_3.Conta_Bancaria;


public class ContaCorrente {

    private double saldoAtual, valorChequeEspecialInicial, valorChequeEspecialAtual, valorChequeEspecialUsado, depositoInicial, depositoAdicional, sacarDinheiro;
    private boolean verificarChequeEspecial = false;

    public ContaCorrente(double depositoInicial){

        this.depositoInicial = depositoInicial;
        valorChequeEspecialInicial = depositoInicial <= 500 ? 50 : this.depositoInicial*0.5;
        saldoAtual = valorChequeEspecialInicial + depositoInicial;

    }



    public void consultarSaldo(){

        Utilitarios.simularEspera(200);
        System.out.println("Seu saldo é " +saldoAtual+ " reais.");
        

    }

    public void consultarChequeEspecial() {

        valorChequeEspecialUsado = valorChequeEspecialInicial - saldoAtual;
        if (valorChequeEspecialUsado < 0) {
            valorChequeEspecialUsado = 0;
            
        }
        verificarChequeEspecial = valorChequeEspecialUsado > 0  ? true : false;

        valorChequeEspecialAtual = valorChequeEspecialInicial - valorChequeEspecialUsado;

        Utilitarios.simularEspera(200);
        System.out.println("Seu Cheque Especial é " +valorChequeEspecialAtual+ " reais.");
        

    }

    public void depositarDinheiro(double depositoAdicional){

        this.depositoAdicional = depositoAdicional;
        saldoAtual += this.depositoAdicional;

        valorChequeEspecialUsado = valorChequeEspecialInicial - saldoAtual;
        verificarChequeEspecial = valorChequeEspecialUsado > 0  ? true : false;

        Utilitarios.simularEspera(200);
        System.out.println("Você depositou " +this.depositoAdicional+ " reais da sua conta corrente");
        

    }

    public void sacarDinheiro(double valorSacar){

        
        sacarDinheiro = valorSacar;
        if (sacarDinheiro <= saldoAtual){

            saldoAtual -= sacarDinheiro;

            valorChequeEspecialUsado = valorChequeEspecialInicial - saldoAtual;

            if (valorChequeEspecialUsado < 0) {
                valorChequeEspecialUsado = 0;
                
            }


            valorChequeEspecialAtual = valorChequeEspecialInicial - valorChequeEspecialUsado;
            verificarChequeEspecial = valorChequeEspecialUsado > 0  ? true : false;

            Utilitarios.simularEspera(200);
            System.out.println("Você sacou " +sacarDinheiro+ " reais da sua conta corrente");


        }else{ 

            Utilitarios.simularEspera(200);
            System.out.println("Valor que pretende sacar é maior que o valor em conta!");

        }

        
        

    }

    public void pagarBoleto(double valorBoleto){

        sacarDinheiro = valorBoleto; 
        if (sacarDinheiro <= saldoAtual){

            saldoAtual -= sacarDinheiro;

            valorChequeEspecialUsado = valorChequeEspecialInicial - saldoAtual;
            if (valorChequeEspecialUsado < 0) {
                valorChequeEspecialUsado = 0;
                
            }


            valorChequeEspecialAtual = valorChequeEspecialInicial - valorChequeEspecialUsado;
            verificarChequeEspecial = valorChequeEspecialUsado > 0  ? true : false;
    
            
           
             
            Utilitarios.simularEspera(200);
            System.out.println("Você usou " +sacarDinheiro+ " reais da sua conta corrente para pagar um boleto!");
            

        }else{

            System.out.println("O valor do boleto excede o valor disponível na conta!");

        } 
        

        
        

    }

    public void verificarChequeEspecial(){

        if(verificarChequeEspecial){

            Utilitarios.simularEspera(200);
            System.out.println("Usuário usou o Cheque Especial!");
            System.out.println("Valor usado foi " +valorChequeEspecialUsado+ " reais...");
            System.out.println("Valor do Cheque Especial restante " +valorChequeEspecialAtual+ " reais...");
            System.out.println("Será debitado automaticamente 20% do valor usado, ou seja " +valorChequeEspecialUsado*0.2+ " reais assim que possível." );
            


        }else{

            Utilitarios.simularEspera(200);
            System.out.println("Usuário não usou o Cheque Especial!");
            System.out.println("Valor do Cheque Especial restante " +valorChequeEspecialAtual+ " reais...");

            

        }
        

    }
    

    
}
