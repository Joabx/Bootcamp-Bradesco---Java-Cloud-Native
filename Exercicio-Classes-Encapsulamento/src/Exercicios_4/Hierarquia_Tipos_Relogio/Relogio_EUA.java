package Exercicios_4.Hierarquia_Tipos_Relogio;

public final class Relogio_EUA  extends  Relogio{

    public IndicadorPeriodo indicadorPeriodo;

    /*Enum------------------------------------------------------------ */
    private enum IndicadorPeriodo{ 
                    PM, AM;
    }

  


    /*Métodos ------------------------------------------------------ */
    @Override
    Relogio converter(Relogio relogio) {
       
       setHora(relogio.getHora());
       setMinuto(relogio.getMinuto()); 
       setSegundo(relogio.getSegundo()); 
       
        if (getHora() > 12){
            
            int diferenca = getHora()-12;
            setHora(getHora()-getHora()+diferenca);
            setIndicadorPeriodo(IndicadorPeriodo.PM);

        }else if (getHora() <= 12 ){

            setIndicadorPeriodo(IndicadorPeriodo.AM);

        }

        return relogio ;

        
    }

    public IndicadorPeriodo getIndicadorPeriodo() {
        return indicadorPeriodo;
    }
    public void setIndicadorPeriodo(IndicadorPeriodo indicadorPeriodo){
        this.indicadorPeriodo = indicadorPeriodo;
    }


    
}