package Exercicios_4.Hierarquia_Tipos_Relogio;

public class RelogioApp {


    public static void main(String[] args) {

        

        Relogio_BR relogioBr = new Relogio_BR();
        Relogio_EUA relogioEUA = new Relogio_EUA();

        relogioBr.definirHorario(23, 59, 59);
        relogioEUA.converter(relogioBr);

       
        

        System.out.println( relogioBr.getHora() + ":" +relogioBr.getMinuto()+ ":"
                            +relogioBr.getSegundo());

        System.out.println(relogioEUA.getHora() + ":" +relogioEUA.getMinuto()+ ":"
                            +relogioEUA.getSegundo() + " " +relogioEUA.getIndicadorPeriodo());
    }
    
}
