package Map.Agenda_Contatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    /*Atributos */
    private Map<String, Integer> agendaContatoMap;
    
    /*Construtores */
    public AgendaContatos(){
        agendaContatoMap = new HashMap<>();
    }

    /*Métodos */
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
            
        }else{
            System.out.println("Agenda está vazia...");
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer nPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            nPorNome = agendaContatoMap.get(nome);
            
        }
        return nPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Joab", 111);
        agendaContatos.adicionarContato("Joab", 12345);
        agendaContatos.adicionarContato("Joab", 11991);
        agendaContatos.adicionarContato("Joab Souza", 33111);
        agendaContatos.adicionarContato("CR7", 1115);
        agendaContatos.adicionarContato("Joab Silva", 1112);
        
        agendaContatos.exibirContatos();
        
        agendaContatos.removerContato("CR7");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Joab"));
    }









}