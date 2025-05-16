package List.Ordenacao_Pessoas;

import java.util.Comparator;

public class Pessoas implements Comparable<Pessoas> {

    private String nome;
    private int idade;
    private double altura;

    /*Construtores ---------------------------------------------------- */
    public Pessoas(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;

    }


    /*Getters e Setters ------------------------------------------------------------ */
    public String getNome(){
        return this.nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public double getAltura(){
        return this.altura;
    }

    /* To String sobrescrevendo o padrão ------------------------------------------------------- */
    @Override
    public String toString() {
        return "Nome: " +nome+ " | Idade: " +idade+ " | Altura: " +altura + " \n";
    }


    @Override
    public int compareTo(Pessoas p) {
        return Integer.compare(idade, p.getIdade());
    }


  
}
class ComparatorPorAltura implements Comparator<Pessoas>{

    @Override
    public int compare(Pessoas p1, Pessoas p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
    
}
