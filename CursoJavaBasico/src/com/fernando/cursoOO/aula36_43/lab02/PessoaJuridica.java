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
    private static double percentual = 0.1;
    private double valorDescontado;
    private String cnpj;
    
    public PessoaJuridica(){}
    
    public PessoaJuridica(String cnpj, String nome, double renda){
        super();
        this.cnpj = cnpj;
        super.setNome(nome);
        super.setRendaBruta(renda);
    }

    @Override
    public double calcularImposto(double renda) {
        valorDescontado = getRendaBruta() * PessoaJuridica.percentual;
        
        return valorDescontado;
    }
    
    public String toString() {
        return super.Imprimir();
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String getId() {
        return getCnpj();
    }
    
}
