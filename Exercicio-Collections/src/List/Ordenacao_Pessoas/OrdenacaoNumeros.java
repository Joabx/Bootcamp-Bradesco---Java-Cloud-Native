package List.Ordenacao_Pessoas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    List<Integer> numeroList;

    /*Construtores ------------------------------------------------------------------ */
    public OrdenacaoNumeros(){
        numeroList = new ArrayList<>();
    }


    /*Métodos -------------------------------------------------------------------------- */
    public void adicionarNumero(int numero){
        numeroList.add(numero);
    }


    public List<Integer> ordenarAscendente(){

        List<Integer> numerosAscendente = new ArrayList<>(numeroList);
        if (!numerosAscendente.isEmpty()) {

            Collections.sort(numerosAscendente);
            
            return numerosAscendente;
            
        }else {
            throw new RuntimeException("A lista está vazia!");
        }


    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendente = new ArrayList<>(numeroList);
        if (!numerosDescendente.isEmpty()) {

            numerosDescendente.sort(Collections.reverseOrder());
            
            return numerosDescendente;
            
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        if (!numeroList.isEmpty()) {
            
            System.out.println(numeroList);
        }
    }




    public static void main(String[] args) {
        
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(4555);
        ordenacaoNumeros.adicionarNumero(11);
        ordenacaoNumeros.adicionarNumero(211);
        ordenacaoNumeros.adicionarNumero(2222);

        ordenacaoNumeros.exibirNumeros();

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());
        ordenacaoNumeros.exibirNumeros();



    }
    
}
