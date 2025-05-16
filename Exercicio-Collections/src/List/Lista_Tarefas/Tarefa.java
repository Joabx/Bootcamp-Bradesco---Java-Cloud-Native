package List.Lista_Tarefas;

public class Tarefa {

    private String descricao;


    /*Construtores --------------------------------------*/
    public Tarefa(String descricao){
        this.descricao = descricao;

    }

    /*Getters e Setters --------------------------------------*/
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }


    

   

}