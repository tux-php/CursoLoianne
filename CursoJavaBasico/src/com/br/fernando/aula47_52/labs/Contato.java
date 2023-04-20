/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.fernando.aula47_52.labs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 004349292569
 */
public class Contato {

    private static int cont = 1;

    private List<Integer> cod = new ArrayList<>();
    
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {

        this.nome = nome;
        this.telefone = telefone;

        cod.add(Contato.cont++);
    }

    public List<Integer> getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
