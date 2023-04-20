/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.fernando.aula39_40.lab02;

/**
 *
 * @author 004349292569
 */
public class PessoaFisica extends Contribuinte {

    private String cpf;
    private double valorDescontado;

    public PessoaFisica() {
    };
    
    public PessoaFisica(String cpf, String nome, double salario) {
        super();
        this.cpf = cpf;
        super.setNome(nome);
        super.setRendaBruta(salario);
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
    
    

    public String toString() {
        return super.Imprimir();
    }
    
    

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getId() {
        return getCpf();
    }

}
