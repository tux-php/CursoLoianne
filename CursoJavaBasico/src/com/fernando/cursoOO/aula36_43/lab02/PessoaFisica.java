/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fernando.cursoOO.aula36_43.lab02;

/**
 *
 * @author 004349292569
 */
public class PessoaFisica extends Contribuinte {

    private double salarioBruto;
    private double valorDescontado;

    public PessoaFisica() {
    };
    
    public PessoaFisica(String nome, double salario) {
        super();
        super.setNome(nome);
        salarioBruto = salario;
    }

    @Override
    public double calcularImposto(double renda) {

        if ((renda >= 0) && (renda <= 1400)) {
            valorDescontado = 0;
        }
        if ((renda >= 1400.01) && (renda <= 2100)) {
            valorDescontado = (renda * 0.1) - 100;
        }
        if ((renda >= 2100.01) && (renda <= 2800)) {
            valorDescontado = (renda * 0.15) - 270;
        }
        if ((renda >= 2800.01) && (renda <= 3600)) {
            valorDescontado = (renda * 0.25) - 500;
        }
        if ((renda >= 3600.01)) {
            valorDescontado = (renda * 0.3) - 700;
        }
        return valorDescontado;
    }

    /**
     * @return the salarioBruto
     */
    public double getSalarioBruto() {
        return salarioBruto;
    }

    /**
     * @param salarioBruto the salarioBruto to set
     */
    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public String toString() {
        return imprimir();
    }

    public String imprimir() {
        String imprimir = "Imposto pago pelo contribuinte " + getNome() + " : " + calcularImposto(getSalarioBruto()) + "\n";
        imprimir += "---------------------------------------------";

        return imprimir;
    }

}
