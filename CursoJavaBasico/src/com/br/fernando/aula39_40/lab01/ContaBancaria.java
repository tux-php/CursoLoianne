/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.fernando.aula39_40.lab01;

public class ContaBancaria {

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

    public boolean sacar(double valor) {
        if (saldo > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public double depositar(double valor) {
        final double deposito = saldo += valor;
        return saldo = saldo >= 0 ? deposito : 0;
    }

    public String toString() {
        String imprimir;

        imprimir = "Cliente: " + getNomeCliente() + "\n";
        imprimir += "Conta :  " + getNumConta() + "\n";
        imprimir += "Saldo  s/ tx: " + getSaldo() + "\n";

        return imprimir;
    }

}
