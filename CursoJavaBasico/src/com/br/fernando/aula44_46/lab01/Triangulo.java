/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.fernando.aula44_46.lab01;

/**
 *
 * @author 004349292569
 */
public class Triangulo extends Figura2D {

    private double base;
    private double altura;

    public Triangulo(String nome, String cor) {
        super(nome, cor);
    }
    
    @Override
    public double calcularArea() {
        return area = (base * altura) / 2;
    }
    
     @Override
    public String toString() {
        String s = "<<Triângulo>> \n";
        s += super.toString();
        s += "Área = " + area + " cm2 \n";

        return s;
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
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

}
