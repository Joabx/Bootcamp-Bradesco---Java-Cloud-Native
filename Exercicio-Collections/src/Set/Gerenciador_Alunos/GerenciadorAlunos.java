package Set.Gerenciador_Alunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    
    /*Atributos */
    private Set<Alunos> alunosSet;

    /*Construtores */
    public GerenciadorAlunos(){
        alunosSet = new HashSet<>();
    }


    /*Métodos */
    public void adicionarAluno(String nome, Long matricula, int nota){
        alunosSet.add(new Alunos(nome, matricula, nota));
    }

    public void removerAluno(long matricula){
        Alunos alunosRemover = null;
        if (!alunosSet.isEmpty()) {
            for (Alunos a : alunosSet) {
                if (a.getMatricula() == matricula) {
                    alunosRemover = a;
                    System.out.println("Aluno removido com sucesso!!!");
                    break;
                }
            }
        }else{
            System.out.println("Lista de alunos está vazia...");
        }
            
        
        alunosSet.remove(alunosRemover);
        if (alunosRemover == null) {
            System.out.println("Matrícula inexistente...");
        }
    }

    public void exibirAlunosPorNome(){
        Set<Alunos> alunosPorNome = new TreeSet<>(alunosSet);
        System.out.println(alunosPorNome);
    }

    public void exibirAlunosPorNota(){
        Set<Alunos> alunorPorNota = new TreeSet<>(new ComparatorPorNota());

        alunorPorNota.addAll(alunosSet);

        System.out.println(alunorPorNota);
    }



    public static void main(String[] args) {
        
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Joab", 1111L, 10);
        gerenciadorAlunos.adicionarAluno("Juliana", 2222L, 3);
        gerenciadorAlunos.adicionarAluno("Ben Mendes", 333L, 7);
        
        System.out.println(gerenciadorAlunos.alunosSet);
        
        gerenciadorAlunos.removerAluno(333L);        
        System.out.println(gerenciadorAlunos.alunosSet);
        
        gerenciadorAlunos.adicionarAluno("Ben Mendes", 333L, 7);
        gerenciadorAlunos.exibirAlunosPorNome();

        gerenciadorAlunos.exibirAlunosPorNota();
    }




}
