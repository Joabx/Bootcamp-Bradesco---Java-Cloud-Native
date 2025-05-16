package Set.Agenda_Contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    /*Atributos ------------------------------------- */
    private Set<Contato> contatoSet;
    
    /*Construtores ----------------------------------------- */
    public AgendaContatos(){
        contatoSet = new HashSet<>();
    }

    /*Métodos ------------------------------------- */
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));

    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatoPorNome.add(c);
                
            }
        }
        return contatoPorNome;
    }


    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;

        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumeroTelefone(novoNumero);
                contatoAtualizado = c;
                break;
                
            }
        }
        return contatoAtualizado;

    }



    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 0);
        agendaContatos.adicionarContato("Camila Luz", 1111);
        agendaContatos.adicionarContato("Camila Dio", 1111);
        agendaContatos.adicionarContato("Joab", 88367119);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));
        System.out.println("Contato Att = " + agendaContatos.atualizarNumeroContato("Joab",111));
        
        agendaContatos.exibirContatos();
    }
    
}
