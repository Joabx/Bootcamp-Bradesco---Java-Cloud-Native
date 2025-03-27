package Exercicios_4.Hierarquia_Tipos_Usuarios;

public class Gerente extends Colaborador {

    
    /*Construtores */
    public Gerente(String email, String senha ){
        super(email, senha);
        setAdmin(true);
    }


    /*Métodos */
    public void gerarRelatorioFinanceiro(){

    }

    public void consultarVendas(){

    }

    

}
