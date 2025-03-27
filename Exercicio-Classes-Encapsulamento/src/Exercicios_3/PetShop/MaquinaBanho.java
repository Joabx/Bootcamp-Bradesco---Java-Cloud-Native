package Exercicios_3.PetShop;

public class MaquinaBanho {

    private Pet pet;
    private  int capacidadeMaximaAgua = 30;
    private  int capacidadeMaximaShampoo = 10;
    int reabastecerRecursos = 2;
    int agua = capacidadeMaximaAgua;
    int shampoo = capacidadeMaximaShampoo;
    boolean maquinaLimpa = true;
    boolean maquinaOcupado = false;
    String nomePet;


    public MaquinaBanho (Pet pet){
        this.pet = pet;
        this.nomePet = this.pet.getNomePet();
    }


    
    
    public void darBanho(){
        
        

        Utils.simularEspera(1000);
        if(maquinaLimpa==true && maquinaOcupado==true){
            agua -= 10;
            shampoo -= 2;
            maquinaLimpa = Math.random() > 0.5; 
            maquinaOcupado = true;
            System.out.println("Pet " +nomePet+ " está tomando banho");
            Utils.simularEspera(1000);
            System.out.println("Banho no Pet " +nomePet+ " Finalizado");
            System.out.println("Foram gastos 10 litros de água e 2 litros de Shampoo!");     
            if (maquinaLimpa==false){
                System.out.println("Máquina de banho suja, limpe a máquina para o próximo uso!");
            }else{
                System.out.println("Máquina limpa, " +nomePet+ "pet não estava tão sujo a ponto de sujar a máquina...");
            }
        }else{
            System.out.println("Não há água ou shampoo suficiente, ou o pet " +nomePet+ " não entrou na máquina...");
        }
        Utils.simularEspera(1000);
        
    

    }

    public void reporAgua(){
        
        
        Utils.simularEspera(1000);

        if(agua == capacidadeMaximaAgua){
            System.out.println("Reservatório de água está cheio");
             
        }else{
            System.out.println("Repondo " +reabastecerRecursos+ " litros de dágua...");
            agua += reabastecerRecursos;
        }

        System.out.println("Água atual no reservatório: " +agua+ " litros");
        
        Utils.simularEspera(1000);


    }

    public void reporShampoo(){
        
        Utils.simularEspera(1000);
        if(shampoo == capacidadeMaximaShampoo){
            System.out.println("Reservatório de shampoo está cheio");
            
        }else{
            System.out.println("Repondo " +reabastecerRecursos+ " litros de shampoo...");
            shampoo += reabastecerRecursos;
            Utils.simularEspera(1000);

        }
        
        
        System.out.println("Shampoo atual no reservatório: " +shampoo+ " litros");

        Utils.simularEspera(1000);
        

    }

    public void verificarNivelAgua(){

        System.out.println("Verificando nível de água...");
        Utils.simularEspera(1000);
        System.out.println("Nível de água: " +agua+ " litros");
        Utils.simularEspera(1000);

    }

    public void verificarNivelShampoo(){
        System.out.println("Verificando nível de shampoo...");
        Utils.simularEspera(1000);
        System.out.println("Nível de shampoo: " +shampoo+ " litros");
        Utils.simularEspera(1000);
        
    }

    public void verificarPetBanho(){
        System.out.println("Verificando...");
        Utils.simularEspera(1000);

        if (maquinaOcupado){
            
            System.out.println("Máquina de banho está ocupada com  pet " +nomePet);
           
        }else{
            System.out.println("Nenhum Pet se encontra atualmente na máquina...");
            System.out.println("Máquina de banho está disponível para uso");
        }
        Utils.simularEspera(1000);
    }

    public void entradaPetMaquina(){
       
        
        System.out.println("Verificando...");
        Utils.simularEspera(1000);

        if(maquinaOcupado){
            System.out.println("Máquina de banho está ocupada, aguarde a saída do Pet " +nomePet);
            

        }else{

            System.out.println("Pet " +nomePet+ " entrou na máquina de banho");
            maquinaOcupado = true;


        }
        
       
        Utils.simularEspera(1000);
    
        
    }

    public void saidaPetMaquina(){

        System.out.println("Verificando...");
        Utils.simularEspera(1000);

        
        if(maquinaOcupado){
            System.out.println("Pet " +nomePet+ " saiu da máquina de banho");
            maquinaOcupado = false;

        }else{

            System.out.println("Nenhum Pet se encontra atualmente na máquina...");


        }

        
        
        Utils.simularEspera(1000);
        

    }

    public void limparMaquina() {

        Utils.simularEspera(1000);
        if(maquinaOcupado){
            System.out.println("Máquina de banho está ocupada, retire o pet " +nomePet+ " para limpar");
            
        }else if(maquinaLimpa){
            System.out.println("Máquina não precisa de limpeza pois já está limpa!!!");
           
            
        }else{

            System.out.println("Limpando máquina de banho...");
            Utils.simularEspera(1000);
            maquinaLimpa = true;
            System.out.println("Máquina de banho limpa e pronta para o uso!!!");

        }
        Utils.simularEspera(1000);

        
        
    }

    //getters

    
    



}

