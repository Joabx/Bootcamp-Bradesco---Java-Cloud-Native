package Exercicios_4.Hierarquia_Tipos_Usuarios;

public class Vendedor extends Colaborador {

    
    private int quantidadeVendas;





    /*Construtores */
    public Vendedor(String email, String senha){
        super(email, senha);
        setAdmin(false);
    }


    /*Métodos */
    public void realizarVenda(){
        quantidadeVendas ++;
    }

    public void consultarVendas(){
        

    }

    /*Getters e Setters */
    
    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }


    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }
    
    
    
}
