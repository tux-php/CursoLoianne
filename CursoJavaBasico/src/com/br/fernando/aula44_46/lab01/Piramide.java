/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.fernando.aula44_46.lab01;

/**
 *
 * @author 004349292569
 */
public class Piramide extends Figura3D {

    private double ladoBase;
    private double altura;
    private double apotema;
    private double numPoliBase;

    private Figura2D base;

    public Piramide(String nome, String cor) {
        super(nome, cor);
    }

    @Override
    public double calcularVolume() {
        if (getBase() != null) {
            return volume = (getBase().calcularArea() * altura) / 3;
        }
        return 0;

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

    /**
     * @return the areaBase
     */
    public double getAreaBase() {
        return Math.pow(getLadoBase(), 2);
    }

    /**
     * @return the ladoBase
     */
    public double getLadoBase() {
        return ladoBase;
    }

    /**
     * @param ladoBase the ladoBase to set
     */
    public void setLadoBase(double ladoBase) {
        this.ladoBase = ladoBase;
    }

    @Override
    public String toString() {
        String s = "<<Pirâmide>> \n";
        s += super.toString();
        s += "Volume = " + volume + " cm2 \n";
        s += "Área = " + area + " cm2 \n";

        return s;
    }

    @Override
    public double calcularArea() {
        if (getBase() != null) {
            return area = (numPoliBase * ((ladoBase * apotema) / 2)) + base.calcularArea();
        }
        return 0;
    }

    /**
     * @return the numPoliBase
     */
    public double getNumPoliBase() {
        return numPoliBase;
    }

    /**
     * @param numPoliBase the numPoliBase to set
     */
    public void setNumPoliBase(double numPoliBase) {
        this.numPoliBase = numPoliBase;
    }

    /**
     * @return the apotema
     */
    public double getApotema() {
        return apotema;
    }

    /**
     * @param apotema the apotema to set
     */
    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    /**
     * @return the base
     */
    public Figura2D getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(Figura2D base) {
        this.base = base;
    }

}
