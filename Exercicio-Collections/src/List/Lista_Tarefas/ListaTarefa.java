package List.Lista_Tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;


    /*Construtores ------------------------------------- */
    public ListaTarefa(){
        tarefaList = new ArrayList<>();
    }


    /*Métodos ----------------------------------- */
    public void adicionarTarefas(String descricao){

        tarefaList.add(new Tarefa(descricao));

    }

    public void removerTarefa(String descricao){

        List<Tarefa> tarefasRemover = new ArrayList<>();

            if(!tarefaList.isEmpty()){
                for(Tarefa t : tarefaList){
                    
                    if (t.getDescricao().equalsIgnoreCase(descricao)) {
                        tarefasRemover.add(t);                       
                    }
                }
                tarefaList.removeAll(tarefasRemover);
        
            }else{

                System.out.println("A lista está vazia...");
            }
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){

        System.out.println(tarefaList);
    }


    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println(listaTarefa.obterNumeroTotalTarefas());
       

        listaTarefa.adicionarTarefas("EU1");
        listaTarefa.adicionarTarefas("EU2");
        listaTarefa.adicionarTarefas("EU3");

        System.out.println(listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("EU1");

        
        System.out.println(listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();


    }
    
}
