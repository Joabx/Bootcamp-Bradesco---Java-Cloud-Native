package Set.Conjunto_Palavras_Unicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    
    /*Atributos ------------------------------------------------ */
    private Set<String> palavraUnica;


    /*Contrutores --------------------------------------------- */
    public ConjuntoPalavrasUnicas(){

        palavraUnica = new HashSet<>();

    }

    /*Métodos ------------------------------------------------ */
    public void adicionarPalavra(String palavra){
        palavraUnica.add(palavra);
    }

    public void removerPalavra( String palavra){

        
        if (palavraUnica.contains(palavra)){
            palavraUnica.remove(palavra);
        }

    }

    public boolean verificarPalavra(String palavra){

        return palavraUnica.contains(palavra);
        
    }


    public void exibirPalavrasUnicas(){
        System.out.println(palavraUnica);
    }

    public static void main(String[] args) {
    
    ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();


    conjuntoLinguagens.adicionarPalavra("Java");
    conjuntoLinguagens.adicionarPalavra("Python");
    conjuntoLinguagens.adicionarPalavra("JavaScript");
    conjuntoLinguagens.adicionarPalavra("Python");
    conjuntoLinguagens.adicionarPalavra("C++");
    conjuntoLinguagens.adicionarPalavra("Ruby");


    conjuntoLinguagens.exibirPalavrasUnicas();


    conjuntoLinguagens.removerPalavra("Python");
    conjuntoLinguagens.exibirPalavrasUnicas();


    System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
    System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));


    conjuntoLinguagens.exibirPalavrasUnicas();
  }





}
