/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.fernando.aula44_46.lab01;

/**
 *
 * @author 004349292569
 */
public class Cubo extends Figura3D {

    private double lado;

    public Cubo(String nome, String cor) {
        super(nome, cor);
    }

    @Override
    public double calcularVolume() {
        volume = Math.pow(getLado(), 3);
        return volume;
    }
    
    @Override
    public String toString() {
        String s = "<<Cubo>> \n";
        s += super.toString();
        s += "Volume = " + volume + " cm2 \n";
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

    @Override
    public double calcularArea() {
        return area = 6 * Math.pow(lado, 2);
    }

}
