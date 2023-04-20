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
public class Agenda {

    //private Contato contato;
    private List<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {        
        contatos.add(contato);        
    }
    
    public List<Contato> consultarContato(){
        return contatos;
    }

}
