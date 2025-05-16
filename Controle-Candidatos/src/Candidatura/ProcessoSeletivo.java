package Candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {

        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        for (String candidato : candidatos){
            entrandoEmContato(candidato);


        }
      


    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }

        }while(continuarTentando && tentativasRealizadas < 3);

        if (atendeu){
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas);
        }else{
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas realizadas...");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){

        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE" };

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");


        int indice = 0;
        for(String candidato : candidatos){
            System.out.println("O candidato de n° " + indice + " é " + candidato);
            indice++;
        }



    }

    static void selecaoCandidatos(){

        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados= 0;
        int candidatosAtual= 0;
        double salarioBase = 2000.00;

        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            double salarioPretendido = valorPretendido();
            String candidato = candidatos[candidatosAtual];
            
            System.out.println("O Candidato " + candidato + "solicitou este valor de salário: " + salarioPretendido);

            if(salarioBase >= salarioPretendido){
                System.out.println("O Candidato " + candidato + " foi selecionado");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
        
    }
    
    static double valorPretendido(){

        return ThreadLocalRandom.current().nextDouble(1800.00, 2200.00);    


    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;

        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
            
        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }



    }



}
