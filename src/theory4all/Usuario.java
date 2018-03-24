/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theory4all;

/**
 *
 * @author vinicius
 */
class Usuario{
    private int id;
    private int classificacaoGeral;
    private String nome;
    private String login;
    private String email;
    private String senha;

    public int getId(){
        return id;
    }// End getId

    public void setId(int id){
        this.id = id;
    }// End setId()

    public int getClassificacaoGeral(){
        return classificacaoGeral;
    }// End get ClassificacaoGeral()

    public void setClassificacaoGeral(int classificacaoGeral){
        this.classificacaoGeral = classificacaoGeral;
    }// End setClassificacaoGeral()

    public String getNome(){
        return nome;
    }// End getNome()

    public void setNome(String nome){
        this.nome = nome;
    }// End setNome()

    public String getLogin(){
        return login;
    }// End getLogin()

    public void setLogin(String login){
        this.login = login;
    }// End setLogin()

    public String getEmail(){
        return email;
    }// End setEmail()

    public void setEmail(String email){
        this.email = email;
    }// End setEmail()

    public String getSenha(){
        return senha;
    }// End setSenha()

    public void setSenha(String senha){
        this.senha = senha;
    }// End setSenha()
}// End class Usuario
