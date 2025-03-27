package Exercicios_3.Carro;

public class Carro {

    private boolean ligado, virarDirecao;
    private String[] marchas;
    private int numeroMarcha;
    private int velocidadeAtual;
    private int velocidadeMaxima = 120;
    private int velocidadeMinima = 0;

    public Carro(){
        this.ligado = false;
        this.marchas = new String[] { "Neutro", "1ª marcha", "2ª marcha", "3ª marcha", "4ª marcha", "5ª marcha", "6ª marcha"};
        this.velocidadeAtual = velocidadeMinima;
    }

    public void ligarCarro(){

        if (ligado){
            Utilitarios.simularEspera(200);
            System.out.println("Carro já está ligado");
            Utilitarios.simularEspera(200);
            
        }else{
            ligado = true;
            System.out.println("Ligando carro...");
            Utilitarios.simularEspera(200);
            System.out.println("Carro foi ligado com sucesso!!!");
            Utilitarios.simularEspera(200);
        }
    }

    public void desligarCarro(){

        if (ligado && numeroMarcha == 0){

            ligado = false;
            Utilitarios.simularEspera(200);
            System.out.println("Carro foi desligado...");
            Utilitarios.simularEspera(200);
            
        }else if(ligado == false){
            
            Utilitarios.simularEspera(200);
            System.out.println("Tá tentando desligar um carro desligado? Gênio...");
            Utilitarios.simularEspera(200);

        }else{

            Utilitarios.simularEspera(200);
            System.out.println("Pra desligar o carro, somente estando no neutro...");
            Utilitarios.simularEspera(200);

        }
    }

    public void acelerar(){

        if (ligado && numeroMarcha > 0){

            if(velocidadeAtual < velocidadeMaxima){

                if(velocidadeAtual < 20 && numeroMarcha == 1){

                    velocidadeAtual = velocidadeAtual + 5;
                    Utilitarios.simularEspera(200);
                    System.out.println("Aumentou a velocidade em 5km...");
                    System.out.println("Sua velocidade atual é " +velocidadeAtual+ "km.");
                    Utilitarios.simularEspera(200);

                }else if(velocidadeAtual < 40 && numeroMarcha == 2){

                    velocidadeAtual = velocidadeAtual + 5;
                    Utilitarios.simularEspera(200);
                    System.out.println("Aumentou a velocidade em 5km...");
                    System.out.println("Sua velocidade atual é " +velocidadeAtual+ "km.");
                    Utilitarios.simularEspera(200);

                }else if(velocidadeAtual < 60 && numeroMarcha == 3){

                    velocidadeAtual = velocidadeAtual + 5;
                    Utilitarios.simularEspera(200);
                    System.out.println("Aumentou a velocidade em 5km...");
                    System.out.println("Sua velocidade atual é " +velocidadeAtual+ "km.");
                    Utilitarios.simularEspera(200); 
                    
                }else if(velocidadeAtual < 80 && numeroMarcha == 4){

                    velocidadeAtual = velocidadeAtual + 5;
                    Utilitarios.simularEspera(200);
                    System.out.println("Aumentou a velocidade em 5km...");
                    System.out.println("Sua velocidade atual é " +velocidadeAtual+ "km.");
                    Utilitarios.simularEspera(200); 
                 
                }else if(velocidadeAtual < 100 && numeroMarcha == 5){

                    velocidadeAtual = velocidadeAtual + 5;
                    Utilitarios.simularEspera(200);
                    System.out.println("Aumentou a velocidade em 5km...");
                    System.out.println("Sua velocidade atual é " +velocidadeAtual+ "km.");
                    Utilitarios.simularEspera(200);    

                }else if(velocidadeAtual < 120 && numeroMarcha == 6){

                    velocidadeAtual = velocidadeAtual + 5;
                    Utilitarios.simularEspera(200);
                    System.out.println("Aumentou a velocidade em 5km...");
                    System.out.println("Sua velocidade atual é " +velocidadeAtual+ "km.");
                    Utilitarios.simularEspera(200);    

                }else{

                    Utilitarios.simularEspera(200);
                    System.out.println("Troca a marcha ai sua anta... Comprou a carteira amigão?");
                    Utilitarios.simularEspera(200);

                }

                

            }else{

                Utilitarios.simularEspera(200);
                System.out.println("Carro chegou a " +velocidadeAtual+ " que é sua velocidade máxima.");
                Utilitarios.simularEspera(200);

            }
            
        }else if(ligado && numeroMarcha == 0){

            Utilitarios.simularEspera(200);
            System.out.println("Você não pode acelerar na marcha " + marchas[numeroMarcha]);
            Utilitarios.simularEspera(200);

        }else{
            Utilitarios.simularEspera(200);
            System.out.println("ATENÇÃO!! -- Esse modelo de carro não permite a realização de nenhuma tarefa estando desligado! ");
            System.out.println("Ligue o carro para continuar... ");
            Utilitarios.simularEspera(200);
        }

    }

    public void diminuirVelocidade(){

        if (ligado){

            if(velocidadeAtual > velocidadeMinima){

                if(velocidadeAtual <= 20 && numeroMarcha == 1){

                    velocidadeAtual = velocidadeAtual - 5;
                    Utilitarios.simularEspera(200);
                    System.out.println("Diminuiu a velocidade em 5km...");
                    System.out.println("Sua velocidade atual é " +velocidadeAtual+ "km.");
                    Utilitarios.simularEspera(200);
                
                }else if(velocidadeAtual > 20 && numeroMarcha == 2){

                    velocidadeAtual = velocidadeAtual - 5;
                    Utilitarios.simularEspera(200);
                    System.out.println("Diminuiu a velocidade em 5km...");
                    System.out.println("Sua velocidade atual é " +velocidadeAtual+ "km.");
                    Utilitarios.simularEspera(200);

                }else if(velocidadeAtual > 40 && numeroMarcha == 3){

                    velocidadeAtual = velocidadeAtual - 5;
                    Utilitarios.simularEspera(200);
                    System.out.println("Diminuiu a velocidade em 5km...");
                    System.out.println("Sua velocidade atual é " +velocidadeAtual+ "km.");
                    Utilitarios.simularEspera(200);

                }else if(velocidadeAtual > 60 && numeroMarcha == 4){

                    velocidadeAtual = velocidadeAtual - 5;
                    Utilitarios.simularEspera(200);
                    System.out.println("Diminuiu a velocidade em 5km...");
                    System.out.println("Sua velocidade atual é " +velocidadeAtual+ "km.");
                    Utilitarios.simularEspera(200);

                }else if(velocidadeAtual > 80 && numeroMarcha == 5){

                    velocidadeAtual = velocidadeAtual - 5;
                    Utilitarios.simularEspera(200);
                    System.out.println("Diminuiu a velocidade em 5km...");
                    System.out.println("Sua velocidade atual é " +velocidadeAtual+ "km.");
                    Utilitarios.simularEspera(200);

                }else if(velocidadeAtual > 100 && numeroMarcha == 6){

                    velocidadeAtual = velocidadeAtual - 5;
                    Utilitarios.simularEspera(200);
                    System.out.println("Diminuiu a velocidade em 5km...");
                    System.out.println("Sua velocidade atual é " +velocidadeAtual+ "km.");
                    Utilitarios.simularEspera(200);

                }else{

                    Utilitarios.simularEspera(200);
                    System.out.println("Troca a marcha ai sua anta... Comprou a carteira amigão?");
                    Utilitarios.simularEspera(200);

                }

            }else{

                Utilitarios.simularEspera(200);
                System.out.println("Carro chegou a " +velocidadeAtual+ " que é sua velocidade mínima.");
            }
            
        }else{

            Utilitarios.simularEspera(200);
            System.out.println("ATENÇÃO!! -- Esse modelo de carro não permite a realização de nenhuma tarefa estando desligado! ");
            System.out.println("Ligue o carro para continuar... ");
            Utilitarios.simularEspera(200);
        }

    }

    public void direcaoCarro(){

        if (ligado){

            virarDirecao = Math.random()> 0.5;

            if(virarDirecao){

                
                Utilitarios.simularEspera(200);
                System.out.println("Carro virou a direita... ");
                Utilitarios.simularEspera(200);
                

            }else if(virarDirecao == false){

                
                Utilitarios.simularEspera(200);
                System.out.println("Carro virou a esquerda... ");
                Utilitarios.simularEspera(200);

            }



            
        }else{

            Utilitarios.simularEspera(200);
            System.out.println("ATENÇÃO!! -- Esse modelo de carro não permite a realização de nenhuma tarefa estando desligado! ");
            System.out.println("Ligue o carro para continuar... ");
            Utilitarios.simularEspera(200);
        }

    }

    public void verificarVelocidade(){

        if (ligado){

            Utilitarios.simularEspera(200);
            System.out.println("Velocidade atual do carro é " +velocidadeAtual+ "km");
            Utilitarios.simularEspera(200);


        }else{

            Utilitarios.simularEspera(200);
            System.out.println("ATENÇÃO!! -- Esse modelo de carro não permite a realização de nenhuma tarefa estando desligado! ");
            System.out.println("Ligue o carro para continuar... ");
            Utilitarios.simularEspera(200);
        }

    }

    public void trocarMarcha(){

        if (ligado){
            
            if(velocidadeAtual == 0){

                if(numeroMarcha == 0){

                    numeroMarcha++;
                    Utilitarios.simularEspera(200);    
                    System.out.println("A marcha está na "+marchas[numeroMarcha]);
                    Utilitarios.simularEspera(200);

                }else if(numeroMarcha == 1){

                    numeroMarcha--;
                    Utilitarios.simularEspera(200);    
                    System.out.println("A marcha está no "+marchas[numeroMarcha]);
                    Utilitarios.simularEspera(200);

                }
                

            }else if(velocidadeAtual <= 20){

                if (numeroMarcha == 1){

                    numeroMarcha++;
                    Utilitarios.simularEspera(200);
                    System.out.println("A marcha está na "+marchas[numeroMarcha]);
                    Utilitarios.simularEspera(200);
                    
                }else if (numeroMarcha == 2){

                    numeroMarcha--;
                    Utilitarios.simularEspera(200);
                    System.out.println("A marcha está na "+marchas[numeroMarcha]);
                    Utilitarios.simularEspera(200);

                }else{

                    System.out.println("Você está na marcha " +marchas[numeroMarcha]+ "... quer passar a segunda sem acelerar?");

                }
                
            }else if (velocidadeAtual >= 21 && velocidadeAtual <= 40){

                if (numeroMarcha == 2){

                    numeroMarcha++;
                    Utilitarios.simularEspera(200);
                    System.out.println("A marcha está na "+marchas[numeroMarcha]);
                    Utilitarios.simularEspera(200);

                }else if (numeroMarcha == 3){

                    numeroMarcha--;
                    Utilitarios.simularEspera(200);
                    System.out.println("A marcha está na "+marchas[numeroMarcha]);
                    Utilitarios.simularEspera(200);

                }
                
            }else if (velocidadeAtual >= 41 && velocidadeAtual <= 60){

                if (numeroMarcha == 3){

                    numeroMarcha++;
                    Utilitarios.simularEspera(200);
                    System.out.println("A marcha está na "+marchas[numeroMarcha]);
                    Utilitarios.simularEspera(200);

                }else if (numeroMarcha == 4){

                    numeroMarcha--;
                    Utilitarios.simularEspera(200);
                    System.out.println("A marcha está na "+marchas[numeroMarcha]);
                    Utilitarios.simularEspera(200);
                    
                }
                
            }else if (velocidadeAtual >= 61 && velocidadeAtual <= 80){

                if (numeroMarcha == 4){

                    numeroMarcha++;
                    Utilitarios.simularEspera(200);
                    System.out.println("A marcha está na "+marchas[numeroMarcha]);
                    Utilitarios.simularEspera(200);

                }else if (numeroMarcha == 5){

                    numeroMarcha--;
                    Utilitarios.simularEspera(200);
                    System.out.println("A marcha está na "+marchas[numeroMarcha]);
                    Utilitarios.simularEspera(200);
                    
                }
                
            }else if (velocidadeAtual >= 81 && velocidadeAtual <= 100){

                if (numeroMarcha == 5){

                    numeroMarcha++;
                    Utilitarios.simularEspera(200);
                    System.out.println("A marcha está na "+marchas[numeroMarcha]);
                    Utilitarios.simularEspera(200);

                }else if (numeroMarcha == 6){

                    numeroMarcha--;
                    Utilitarios.simularEspera(200);
                    System.out.println("A marcha está na "+marchas[numeroMarcha]);
                    Utilitarios.simularEspera(200);
                    
                }
                
            }else if (velocidadeAtual >= 101 && velocidadeAtual <= 120 ){

                if (numeroMarcha == 6){

                   
                    Utilitarios.simularEspera(200);
                    System.out.println("A marcha está na "+marchas[numeroMarcha]);
                    System.out.println("Não é possível avançar mais marchas, velocidade máxima atingida!!!");
                    Utilitarios.simularEspera(200);

                }
                
            }else{

            }

        }else{
            Utilitarios.simularEspera(200);
            System.out.println("ATENÇÃO!! -- Esse modelo de carro não permite a realização de nenhuma tarefa estando desligado! ");
            System.out.println("Ligue o carro para continuar... ");
            Utilitarios.simularEspera(200);
        
        }
        
    }
    
}
