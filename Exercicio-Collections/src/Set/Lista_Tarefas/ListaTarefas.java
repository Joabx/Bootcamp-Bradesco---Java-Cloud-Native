package Set.Lista_Tarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    /*Atributos */
    private Set<Tarefas> tarefaSet;
    int contador = 0;

    /*Contrutores */
    public ListaTarefas(){
        tarefaSet = new HashSet<>();

    }

    /*Métodos */
    public void adicionarTarefa(String descricao){
        contador ++;
        tarefaSet.add(new Tarefas(descricao));
        System.out.println("Tarefa n° "+contador+" adicionada comsucesso!!!");
    }

    public void removerTarefa(String descricao){
        Tarefas tarefaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefas t : tarefaSet) {
                if (t.getDescricao().equals(tarefaSet)) {
                    tarefaRemover = t;
                    System.out.println("Tarefa removida com sucesso!!!");
                    break;
                }else{
                    System.out.println("Não existe tarefa com essa descrição...");
                }
            }
            tarefaSet.remove(tarefaRemover);

        }else{
            System.out.println("Lista está vazia...");
        }
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public void contarTarefas(){
        System.out.println("Número total de tarefas: "+tarefaSet.size());
    }

    public Set<Tarefas> obterTarefasConcluidas(){
        Set<Tarefas> tarefasConcluidas = new HashSet<>();
        if (!tarefaSet.isEmpty()) {
            for(Tarefas t : tarefaSet){
                if (t.getConclusao()==true) {
                    tarefasConcluidas.add(t);
                }else{
                    System.out.println("Não existem tarefas concluídas...");
                }
            }
            
        }
        return tarefasConcluidas;
    }

    public void marcarTarefaConcluida(String descricao){
        if (!tarefaSet.isEmpty()) {
            for (Tarefas t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    if (t.getConclusao()==true) {
                        System.out.println("Essa tarefa já foi marcada como concluída...");   
                    }else{
                        t.setConclusao(true);
                        System.out.println("Tarefa marcada como conckuída com sucesso!!!");
                    }
                }
            }
        }
    }

    public Set<Tarefas> obterTarefasPendentes(){
        Set<Tarefas> tarefasPendentes = new HashSet<>();
        if (!tarefaSet.isEmpty()) {
            for (Tarefas t : tarefaSet) {
                if (t.getConclusao()==false) {
                    tarefasPendentes.add(t);   
                }
            }
        }
        return tarefasPendentes;
    }
    
    public void marcarTarefaPendente(String descricao){
        if (!tarefaSet.isEmpty()) {
            for (Tarefas t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    if (t.getConclusao()==false) {
                        System.out.println("Essa tarefa já foi marcada como pendente...");   
                    }else{
                        t.setConclusao(false);
                        System.out.println("Tarefa marcada como pendente com sucesso!!!");
                    }
                }
            }
        }
    }
  
    public void limparListaTarefas() {

        tarefaSet.clear();    
        System.out.println("Todas as tarefas foram removidas com sucesso!!!");

    }
    

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Eu");
        listaTarefas.adicionarTarefa("Eu to tiltado cara?");
        listaTarefas.adicionarTarefa("Eu to ganhando minha lane...");
        listaTarefas.adicionarTarefa("dando roaming...");
        listaTarefas.adicionarTarefa("ajudando a bot lane...");
        listaTarefas.adicionarTarefa("e tomando gank de 3 main mid...");

        listaTarefas.exibirTarefas();
        
        System.out.println("Essas foram as tarefas concluídas: " +listaTarefas.obterTarefasConcluidas());
        
        listaTarefas.marcarTarefaConcluida("Eu");
        listaTarefas.marcarTarefaConcluida("e tomando gank de 3 main mid... ");
        System.out.println("Essas foram as tarefas concluídas: " +listaTarefas.obterTarefasConcluidas());
        
        System.out.println("Essas foram as tarefas pendentes... " +listaTarefas.obterTarefasPendentes());
        listaTarefas.marcarTarefaPendente("Eu");
        listaTarefas.marcarTarefaPendente("Eu to ganhando minha lane...");
        System.out.println("Essas foram as tarefas pendentes... " +listaTarefas.obterTarefasPendentes());
        
        listaTarefas.contarTarefas();
        
        listaTarefas.limparListaTarefas();
        
        listaTarefas.contarTarefas();
    }


}
