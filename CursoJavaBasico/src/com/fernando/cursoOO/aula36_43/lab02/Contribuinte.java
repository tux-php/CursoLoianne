/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fernando.cursoOO.aula36_43.lab02;

/**
 *
 * @author 004349292569
 */
public abstract class Contribuinte {
    private String nome;
    private double aliquota;
    private double parcelaAdeduzir;
    
    public Contribuinte(){}

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
     * @return the aliquota
     */
    public double getAliquota() {
        return aliquota;
    }

    /**
     * @param aliquota the aliquota to set
     */
    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }

    /**
     * @return the parcelaAdeduzir
     */
    public double getParcelaAdeduzir() {
        return parcelaAdeduzir;
    }

    /**
     * @param parcelaAdeduzir the parcelaAdeduzir to set
     */
    public void setParcelaAdeduzir(double parcelaAdeduzir) {
        this.parcelaAdeduzir = parcelaAdeduzir;
    }
    
    
    
}
