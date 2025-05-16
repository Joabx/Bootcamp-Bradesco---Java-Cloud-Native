package Set.Gerenciador_Alunos;

import java.util.Comparator;

public class Alunos implements Comparable<Alunos> {
    /*Atributos */
    private String nome;
    private long matricula;
    private int nota;
    
    
    /*Construtores */
    public Alunos(String nome, long matricula, int nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }
    
    
    /*Getters e Setters */
    public String getNome() {
        return nome;
    }


    public long getMatricula() {
        return matricula;
    }


    public int getNota() {
        return nota;
    }


    @Override
    public String toString() {
        return "Nome dos alunos= " + nome + "||| Matrícula= " + matricula + "||| Nota= " + nota + "\n";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (matricula ^ (matricula >>> 32));
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
        Alunos other = (Alunos) obj;
        if (matricula != other.matricula)
            return false;
        return true;
    }


    @Override
    public int compareTo(Alunos aluno) {
        return nome.compareTo(aluno.getNome());
        
    }


    


  

    
    
    
}
