/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fernando.cursoOO.aula36_43.lab03;

/**
 *
 * @author 004349292569
 */
public class Peixe extends Animal {

    private String caracteristicas;

    public Peixe(String nome, double comprimento, double velocidade, String alimento) {
        super(nome, comprimento, 0, "Cizenta", "Mar", alimento, velocidade);

        this.caracteristicas = "barbatanas e caudas";
    }

    /**
     * @return the caracteristicas
     */
    public String getCaracteristicas() {
        return caracteristicas;
    }

    /**
     * @param caracteristicas the caracteristicas to set
     */
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String toString() {
        String dados = "Peixe[ \n";
        dados += "Característica: " + getCaracteristicas() + "\n";
        dados += super.toString();

        return dados;
    }

}
