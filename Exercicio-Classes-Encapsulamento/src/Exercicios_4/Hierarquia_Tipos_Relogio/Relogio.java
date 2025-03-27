package Exercicios_4.Hierarquia_Tipos_Relogio;

public sealed abstract class Relogio permits Relogio_BR, Relogio_EUA {


    protected int hora, minuto, segundo;
    

    


    /*Métodos -------------------------------------------------------- */
    abstract Relogio converter(Relogio relogio);


    public void definirHorario(int hora, int minuto, int segundo){

        if ( hora > 23){
            hora = 00;
            minuto = 00;
            segundo = 00;
        }else if ( minuto > 59 ) {
            minuto = 00;
        }else if( segundo > 59 ) {
            segundo = 00;
        }

        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        
    }

    /*Getters e Setters ------------------------------------------------- */
    
    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {

        this.hora = hora;
    }


    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {

      
        this.minuto = minuto;

    }


    public int getSegundo() {
        return segundo;
    }
    public void setSegundo(int segundo) {

     
        this.segundo = segundo;

    }

   
}