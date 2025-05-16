package List.Ordenacao_Pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoas> pessoasList;

    
    /*Construtores ---------------------------------------------------------------------- */
    public OrdenacaoPessoas(){
        pessoasList = new ArrayList<>();
    }



    /*Métodos ----------------------------------------------------------------------------- */
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoasList.add(new Pessoas(nome, idade, altura));

    }

   
    public List<Pessoas> ordenarPorIdade(){
        List<Pessoas> pessoasPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdade);

        return pessoasPorIdade;
    }


    public List<Pessoas> ordenarPorAltura(){

        List<Pessoas> pessoasPorAltura = new ArrayList<>(pessoasList);
        if (!pessoasList.isEmpty()) {
            Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
            return pessoasPorAltura;
            
        }else {
            
            throw new RuntimeException("A lista está vazia!");
        }


    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Joab", 29, 1.81);
        ordenacaoPessoas.adicionarPessoa("Kliandila", 24, 1.40);
        ordenacaoPessoas.adicionarPessoa("Paarthurnax", 295, 3.40);
        ordenacaoPessoas.adicionarPessoa("Roberta", 19, 1.60);

        System.out.println(ordenacaoPessoas.ordenarPorAltura());
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
    }




}
