package List.Carrinho_Compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

   

    private List<Item> itemLista;


    /*Construtores ----------------------------------------------------- */
    public CarrinhoDeCompras(){

        itemLista = new ArrayList<>();

    }


    /*Métodos --------------------------------------------*/
    public void adicionarItem(String nome, double preco, int quantidade){
      
        itemLista.add(new Item(nome, preco, quantidade));
        
    }


    public void removerItem(String nome){

        List<Item> itemRemover = new ArrayList<>();

        if(!itemLista.isEmpty()){
            for(Item i : itemLista){
                if(i.getnome().equalsIgnoreCase(nome)){
                    itemRemover.add(i);

                }
            }
            itemLista.removeAll(itemRemover);

        }else{
            System.out.println("A lista de compra está vazia...");
        }

    }


    public double calcularValorTotal(){
        if(!itemLista.isEmpty()){
            double valorTotal = 0;
            for(Item item : itemLista){
               double valorItem   = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;

        }else{
            throw new RuntimeException("A lista de compras está vazia...");
        }
        
    }


    public void exibirItens(){
        if(!itemLista.isEmpty()){
            for ( Item item : itemLista){
                System.out.println(item.getnome());
            }
            

        }else{
            System.out.println("A lista de compras está vazia");
        }

    }

    

    public static void main(String[] args) {
        CarrinhoDeCompras cr = new CarrinhoDeCompras();

        cr.exibirItens();
       

        cr.adicionarItem("Negresco", 20, 1);
        cr.adicionarItem("Bolacha de Sal", 28, 4);

        cr.exibirItens();

        System.out.println(cr.calcularValorTotal());

        cr.removerItem("Bolacha de Sal");

        cr.exibirItens();

        

    }



}

