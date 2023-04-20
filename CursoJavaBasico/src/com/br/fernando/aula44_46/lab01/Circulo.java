/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.fernando.aula44_46.lab01;

/**
 *
 * @author 004349292569
 */
public class Circulo extends Figura2D {
    
    private double raio;

    public Circulo(String nome, String cor) {
        super(nome, cor);
    }

    @Override
    public double calcularArea() {
        area = Math.PI * Math.pow(raio, 2);
        return area;
    }

    @Override
    public String toString() {
        String s = "<<Círculo>> \n";
        s += super.toString();
        s += "área = " + area + " cm2 \n";

        return s;
    }

    /**
     * @return the raio
     */
    public double getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(double raio) {
        this.raio = raio;
    }

}
