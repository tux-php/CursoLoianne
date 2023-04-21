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
    private List<Contato> contatos = new ArrayList<>(1);

    public void adicionarContato(Contato contato) {
        try
        {
            
            contatos.add(contato);
            
        } catch (Exception e)
        {
            System.out.println("Erro de tamanho do array.");
            e.getMessage();
        }
    }

    public List<Contato> listarContato() {
        return contatos;
    }

    public String consultarContato(int cod) {
        String s = "";
        for (Contato contato : listarContato())
        {
            for (Integer codigo : contato.getCod())
            {
                try
                {
                    if (codigo == cod)
                    {
                        s = "Código: " + codigo + "\n";
                        s += "Nome: " + contato.getNome() + "\n";
                        s += "Telefone: " + contato.getTelefone() + "\n";
                        return s;

                    } else
                    {
                        throw new ContatoNaoExisteException();
                    }

                } catch (Exception e)
                {
                    System.out.println("Ocorreu um erro: " + e.getMessage());
                    e.printStackTrace();

                }
            }

        }

        return s;
    }

}
