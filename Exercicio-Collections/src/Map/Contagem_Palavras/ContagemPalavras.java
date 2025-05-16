package Map.Contagem_Palavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {


    /*Atributo */
    private Map<String, Integer> palavrasMap;

    /*Construtores */
    public ContagemPalavras(){
        palavrasMap = new HashMap<>();

    }

    /*Métodos */
    public void adicionarPalavra(String palavra, Integer contagem){
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if (!palavrasMap.isEmpty()) {
            palavrasMap.remove(palavra);
            
        }else{
            System.out.println("Lista está vazia...");
        }
    }

    public void exibirContagemPalavras(){
        System.out.println(palavrasMap);

    }

    public String encontrarPalavraMaisFrequente(){
        String palavraFrequente = null;
        Integer maiorContagem = Integer.MIN_VALUE;
        if (!palavrasMap.isEmpty()) {
            for (Map.Entry<String, Integer> p : palavrasMap.entrySet()) {
                if (p.getValue() > maiorContagem) {
                    palavraFrequente = p.getKey();
                    maiorContagem = p.getValue();
                    
                }
            }
            
        }


        return palavraFrequente + "=" + maiorContagem;
    }


    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.exibirContagemPalavras();
        
        contagemPalavras.adicionarPalavra("Joab Caramelo", 2);
        contagemPalavras.adicionarPalavra("Caramelo", 20);
        contagemPalavras.adicionarPalavra("Joab", 8);
        contagemPalavras.adicionarPalavra("GG Caramelo", 12);
        
        contagemPalavras.exibirContagemPalavras();
        
        contagemPalavras.removerPalavra("GG");

        contagemPalavras.exibirContagemPalavras();

        System.out.println("A palavra mais frequente é: " + contagemPalavras.encontrarPalavraMaisFrequente());

        contagemPalavras.exibirContagemPalavras();
    }
    
}
