package Map.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    /*Atributos */
    private Map<String, String> dicionarioMap;

    /*Construtores */
    public Dicionario(){
        dicionarioMap = new HashMap<>();
    }
    

    /*Métodos */
    public void adicionarPalavra(String palavra, String definicao){
        
            
        dicionarioMap.put(palavra, definicao);
       

    }

    public void removerPalavra(String palavra){
        if (!dicionarioMap.isEmpty()) {
            
            dicionarioMap.remove(palavra);
        }else{
            System.out.println("Lista está vazia...");
        }
        
    }

    public void exibirPalavras(){
        if (!dicionarioMap.isEmpty()) {
            
            System.out.println(dicionarioMap);
        }else{
            System.out.println("Lista está vazia...");
        }

    }

    public String pesquisarPorPalavra(String palavra){
        String definicao = null;
        if (!dicionarioMap.isEmpty()) {
            definicao = dicionarioMap.get(palavra);

            
        }else{
            System.out.println("Lista está vazia...");
        }

        return definicao;

    }



    public static void main(String[] args) {
        
        Dicionario dicionario = new Dicionario();

        dicionario.exibirPalavras();
        
        dicionario.adicionarPalavra("Marmita", "Comida");
        dicionario.adicionarPalavra("Cadeira", "objeto para sentar");
        dicionario.adicionarPalavra("Eu to tiltado cara?", "Eu to ganhando minha lane");
        dicionario.adicionarPalavra("Dando Roaming", "Ajudando a bot lane");
        
        dicionario.exibirPalavras();

        System.out.println("A definição de Marmita é: " +dicionario.pesquisarPorPalavra("Marmita")
);


    }
}
