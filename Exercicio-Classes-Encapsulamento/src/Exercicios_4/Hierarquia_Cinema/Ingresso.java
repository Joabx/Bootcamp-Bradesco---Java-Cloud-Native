package Exercicios_4.Hierarquia_Cinema;



public class Ingresso {

    //** Enum ------------ 
    public enum TipoAudio{
        DUBLADO,
        LEGENDADO
    }

    private double valor;
    private String nomeFilme;
    private TipoAudio tipoAudio;
    private int pessoas;
    



    //** Construtor -----------------------------------------------
    public Ingresso(String nomeFilme , double valor){
        this.nomeFilme = nomeFilme;
        this.valor = valor;
    }

    

    //*Métodos */
    public void valorMeia(){

        setValor(getValor() / 2);
        
    }

    public void valorFamilia(){
        double valorIngresso = getValor() * pessoas;
        if(pessoas > 2){

            valorIngresso = valorIngresso - valorIngresso * 0.05; 
        }

        setValor(valorIngresso);
       
        
    }

    //** Getters e Setters -----------------------------------------

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }


    public String getNomeFilme() {
        return nomeFilme;
    }
    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }
    

    public TipoAudio getTipoAudio() {
        return tipoAudio;
    }
    public void setTipoAudio(TipoAudio tipoAudio) {
        this.tipoAudio = tipoAudio;
    }

    
    public int getPessoas(){
        return pessoas;
    }
    public void setPessoas(int pessoas){
        this.pessoas = pessoas;
    }

}