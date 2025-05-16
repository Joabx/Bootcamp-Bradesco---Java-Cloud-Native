package Set.Gerenciador_Alunos;

import java.util.Comparator;

public class ComparatorPorNota implements Comparator<Alunos>{

    @Override
    public int compare(Alunos p1, Alunos p2) {
        
        return Double.compare(p1.getNota(), p2.getNota());
    }
    
}
