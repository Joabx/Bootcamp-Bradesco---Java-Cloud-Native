package Set.Agenda_Contatos;

public class Contato {

    /*Atributos -------------------------------- */
    private String nome;
    private int numeroTelefone;


    /*Construtores ---------------------------- */
    public Contato(String nome, int numeroTelefone){

        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    /*Getters e Setters --------------------------------- */
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getNumeroTelefone(){
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone){
        this.numeroTelefone = numeroTelefone;
    }

    

    @Override
    public String toString() {
        return nome + "--- N° = " + numeroTelefone + "\n";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numeroTelefone;
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
        Contato other = (Contato) obj;
        if (numeroTelefone != other.numeroTelefone)
            return false;
        return true;
    }

    
    
    
}
