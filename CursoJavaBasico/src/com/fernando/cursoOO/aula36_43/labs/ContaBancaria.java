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
public abstract class ContaBancaria {

    private String nomeCliente;
    private String numConta;
    private double saldo;

    public ContaBancaria() {
        super();
    }

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * @return the numConta
     */
    public String getNumConta() {
        return numConta;
    }

    /**
     * @param numConta the numConta to set
     */
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double sacar(double valor) {
        if (saldo > 0 && saldo >= valor)
        {
            saldo -= valor;
        }
        return saldo;
    }

    public double depositar(double valor) {
        final double deposito = saldo += valor;
        return saldo = saldo >= 0 ? deposito : 0;
    }

}
