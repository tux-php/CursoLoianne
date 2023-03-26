/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fernando.cursoOO.aula36_43.lab02;

/**
 *
 * @author 004349292569
 */
public class PessoaJuridica extends Contribuinte{
    private double rendaBruta;
    private static double percentual = 0.1;
    private double valorDescontado;
    
    public PessoaJuridica(){}
    
    public PessoaJuridica(String nome, double renda){
        super();
        super.setNome(nome);
        rendaBruta = renda;
    }

    @Override
    public double calcularImposto(double renda) {
        valorDescontado = getRendaBruta() * PessoaJuridica.percentual;
        
        return valorDescontado;
    }
    
    public String toString() {
        return imprimir();
    }

    public String imprimir() {
        String imprimir = "Imposto pago pelo contribuinte " + getNome() + " : " + calcularImposto(getRendaBruta()) + "\n";
        imprimir += "---------------------------------------------";

        return imprimir;
    }

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
    
    
    
}
