/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bv.models;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author valentims
 */
public class Usuario {
    
    private String nome;
    private String email;
    private String senha;

    public Usuario() {
        this.nome = "Bruno";
    }
    
   
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

    
}
