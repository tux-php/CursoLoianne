/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.fernando.aula44_46.lab01;

/**
 *
 * @author 004349292569
 */
public abstract class Figura2D extends FiguraGeometrica implements DimensaoSuperficial {
    
    protected double area;

    public Figura2D(String nome, String cor) {
        super(nome, cor);
    }

    @Override
    public String toString() {
        String s = "[Figura 2D" + "\n";
        s += super.toString() + "\n";
        s += "] " + "\n";
        return s;
    }

}
