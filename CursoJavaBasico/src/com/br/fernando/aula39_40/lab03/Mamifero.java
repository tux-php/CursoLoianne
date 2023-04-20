/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.fernando.aula39_40.lab03;

/**
 *
 * @author 004349292569
 */
public class Mamifero extends Animal {

    public Mamifero(String nome, double comprimento, String alimento, double velocidade) {
        super(nome, comprimento, 4, "Castanho", "Terra", alimento, velocidade);

    }

    public String toString() {
        String dados = "Mamífero[ \n";
        dados += super.toString();

        return dados;
    }

}
