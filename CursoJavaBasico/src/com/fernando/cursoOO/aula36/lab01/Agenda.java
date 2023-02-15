/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.cursoOO.aula36.lab01;

/**
 *
 * @author fernando
 */
public class Agenda {

    private String nome;
    private Contato[] contatos;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the contatos
     */
    public Contato[] getContatos() {
        return contatos;
    }

    /**
     * @param contatos the contatos to set
     */
    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

}
