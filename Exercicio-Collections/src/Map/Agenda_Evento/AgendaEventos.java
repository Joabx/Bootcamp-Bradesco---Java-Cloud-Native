package Map.Agenda_Evento;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    
    /*Atributos */
    private Map<LocalDate, Evento> eventosMap;


    /*Construtores */
    public AgendaEventos(){
        eventosMap = new HashMap<>();
    }

    /*Métodos */
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        if (!eventosMap.isEmpty()) {
            Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
            System.out.println(eventosTreeMap);
            
        }
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        if (!eventosTreeMap.isEmpty()) {
            for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
                if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                    System.out.println("O próximo evento é: " + entry.getValue() + " e acontecerá na data " + entry.getKey());
                    break;
                }
            }
            
        }

    }




    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.exibirAgenda();
        
        agendaEventos.adicionarEvento(LocalDate.of(2020, Month.MAY, 5), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 8, 2), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 6, 2), "Evento 3", "Atração 3");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

        
    }













}
