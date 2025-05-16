package List.Soma_Numeros;

import java.util.ArrayList;
import java.util.List;

import List.Catalogo_Livros.Livro;

public class SomaNumeros {

    private List<Integer> numerosList;


    /*Construtores -------------------------------------------------- */
    public SomaNumeros(){
        numerosList = new ArrayList<>();
    }


    /*Métodos ------------------------------------------------------------ */
    public void adicionarNumero(int numero){

        numerosList.add(numero);

    }
    
    public int calcularSoma(){
        int soma = 0;
        for(int n : numerosList){

            soma += n;

        }

        return soma;
        
    }


    public int encontrarMaiorNumero(){
        int maiorNumero =  Integer.MIN_VALUE;
    
        if (!numerosList.isEmpty()) {
            for(int n : numerosList){
                if (n >= maiorNumero) {
                    maiorNumero = n;
                    
                }
            }
            
        }
    
    
        return maiorNumero;
    
    }
    public int encontrarMenorNumero(){
        int menorNumero =  Integer.MAX_VALUE;
    
        if (!numerosList.isEmpty()) {
            for(int n : numerosList){
                if (n <= menorNumero) {
                    menorNumero = n;
                    
                }
            }
            
        }
    
    
        return menorNumero;
    
    }


    public void exibirNumeros() {
    if (!numerosList.isEmpty()) {
      System.out.println(numerosList);
    } else {
      System.out.println("A lista está vazia!");
    }
  }



    public static void main(String[] args) {
        
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(2050);
        somaNumeros.adicionarNumero(7700);
        somaNumeros.adicionarNumero(5200);
        somaNumeros.adicionarNumero(23);
        somaNumeros.adicionarNumero(20);

        somaNumeros.exibirNumeros();

        System.out.println("A soma é " + somaNumeros.calcularSoma());
        System.out.println("O maior número é " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor número é " + somaNumeros.encontrarMenorNumero());


    }
}
