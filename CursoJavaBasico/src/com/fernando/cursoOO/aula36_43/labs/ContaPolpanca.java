/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.cursoOO.aula36_43.labs;

/**
 *
 * @author fernando
 */
public class ContaPolpanca extends ContaBancaria{
    private int diaRendimento;
    
    public ContaPolpanca(){}
    
    public double calcularNovoSaldo(double taxa){
        double totalRendimento = getDiaRendimento() * taxa;
        if(getSaldo() >= 0){
           double novoSaldo = getSaldo() + (getSaldo() * totalRendimento);
            setSaldo(novoSaldo);
        }
        return getSaldo();
    }

    /**
     * @return the diaRendimento
     */
    public int getDiaRendimento() {
        return diaRendimento;
    }

    /**
     * @param diaRendimento the diaRendimento to set
     */
    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    
    
}
