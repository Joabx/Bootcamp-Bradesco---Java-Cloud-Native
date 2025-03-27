package Exercicios_4.Hierarquia_Tipos_Usuarios;

public class Colaborador {

    private String nome, email, senha;
    

    private boolean admin;
    
    

    /*Construtores ---------------------------------------------------*/
    public Colaborador(String email, String senha){
        this.email = email;
        this.senha = senha;

    }


    /*Métodos ----------------------------------------------------*/
    public void login(){

    }

    public void logoff(){

    }

    public void alterarDados(){

    }

    public void alterarSenha(){

    }

    /*Getters e Setters */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }


    public boolean getAdmin(){
        return admin;
    }
    public void setAdmin(boolean admin){
        this.admin = admin;
    }
    
    
}
