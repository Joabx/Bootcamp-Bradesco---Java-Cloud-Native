package Map.Agenda_Evento;

public class Evento {

    /*Atributos */

    private String nome, atracao;

    /*Construtores */
    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    /*Getters e Setters */
    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Evento= " + nome + " ||| Atracao= " + atracao + "\n";
    }

    
    

    
}
