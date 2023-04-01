/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fernando.cursoOO.aula36_43.lab02_02;

/**
 *
 * @author 004349292569
 */
public abstract class Contribuinte {

    private String nome;
    private double rendaBruta;

    public Contribuinte() {
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double calcularImposto(double renda);

    /**
     * @return the rendaBruta
     */
    public double getRendaBruta() {
        return rendaBruta;
    }

    /**
     * @param rendaBruta the rendaBruta to set
     */
    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }
    

    public String Imprimir() {
        String imprimir = "Contribuinte(" + getId() + "): " + getNome() + " - Renda Bruta: " + getRendaBruta() + " Imposto Pago: " + calcularImposto(getRendaBruta()) + "\n";
        imprimir += "---------------------------------------------";

        return imprimir;
    }

    public abstract String getId();

}
