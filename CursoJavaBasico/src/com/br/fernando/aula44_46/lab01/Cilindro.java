/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.fernando.aula44_46.lab01;

/**
 *
 * @author 004349292569
 */
public class Cilindro extends Figura3D {

    private double raio;
    private double altura;

    public Cilindro(String nome, String cor) {
        super(nome, cor);
    }

    @Override
    public double calcularVolume() {
        volume = Math.PI * Math.pow(getRaio(), 2) * getAltura();
        return volume;
    }

    @Override
    public String toString() {
        String s = "<<Cilindro>> \n";
        s += super.toString();
        s += "Volume = " + volume + " cm2 \n";
        s += "Área = " + area + " cm2 \n";

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

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double areaBase = Math.PI * Math.pow(raio, 2);
        double areaLateral = 2 * Math.PI * raio * altura;
        area = 2 * areaBase + areaLateral;
        
        return area;
    }

}
