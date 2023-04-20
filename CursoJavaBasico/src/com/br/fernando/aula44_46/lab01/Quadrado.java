/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.fernando.aula44_46.lab01;

/**
 *
 * @author 004349292569
 */
public class Quadrado extends Figura2D {
    
    private double lado;

    public Quadrado(String nome, String cor) {
        super(nome, cor);
    }

    @Override
    public double calcularArea() {
        area = Math.pow(getLado(), 2);
        return area;
    }

    @Override
    public String toString() {
        String s = "<<Quadrado>> \n";
        s += super.toString();
        s += "Área = " + area + " cm2 \n";

        return s;
    }

    /**
     * @return the lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(double lado) {
        this.lado = lado;
    }

}
