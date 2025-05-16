package Set.Lista_Tarefas;

public class Tarefas {

    /*Atributos --------------------------------- */
    private String descricao;
    private boolean conclusao;

    /*Construtores --------------------------------- */
    public Tarefas( String descricao, boolean conclusao){
        this.descricao = descricao;
        this.conclusao = conclusao;

    }

    public Tarefas(String descricao){
        this.descricao = descricao;
    }

    /*Getters e Setters */
    public String getDescricao(){
        return descricao;
    }
    
    public boolean getConclusao(){
        return conclusao;
    }

    public void setConclusao(boolean conclusao){
        this.conclusao = conclusao;
    }

    /*Sobrescrevendo */

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tarefas other = (Tarefas) obj;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        return true;
    }

    @Override
    public String toString() {
        String simNao;
        if (conclusao==true) {
            simNao = " Sim!";
            
        }else{
            simNao = "Não!";
        }
        return "Descrição da Tarefa: " + descricao + " ||| Foi concluída? " + simNao + "\n";
    }

    

    


    
}
