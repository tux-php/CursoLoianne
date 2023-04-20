/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.fernando.aula39_40.lab01;

public class ContaEspecial extends ContaBancaria {

    private double limiteR;
    private static double limiteFixo = 2000;

    public ContaEspecial() {
    }

    /**
     * @return the limite
     */
    public double getLimiteR() {
        return limiteR;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimiteR(double limite) {
        this.limiteR = limite;
    }

    public boolean sacar(double valor) {
        double saldoLimite = getSaldo() + getLimiteR();

        if (saldoLimite > 0)
        {
            if (getSaldo() >= 0)
            {

                double valorMinimo = getSaldo() - valor;
                sacarSaldoOuLimite(valorMinimo, valor);

                return true;
            }
        }
        return false;
    }

    private void sacarSaldoOuLimite(double valorMinimo, double valor) {
        if (valorMinimo >= 0)
        {
            setSaldo(valorMinimo);
        } else
        {
            setLimiteR(getLimiteR() + getSaldo() - valor);            
            setSaldo(0);
        }
    }

    public double depositar(double valor) {
        double limiteFaltante = ContaEspecial.limiteFixo - getLimiteR();
        double resto = valor - limiteFaltante;

        return limiteFaltante == 0 ? depositarNoSaldo(valor) : depositarNoLimite(limiteFaltante, resto);

    }

    private double depositarNoLimite(double limiteFaltante, double resto) {
        setLimiteR(getLimiteR() + limiteFaltante);
        if (resto != 0)
        {
            setSaldo(getSaldo() + resto);
        }
        return getLimiteR();
    }

    private double depositarNoSaldo(double valor) {
        setSaldo(getSaldo() + valor);

        return getSaldo();
    }
    
     public String toString(){
        String imprimir = "Conta Especial[";
        imprimir += super.toString();
        imprimir += "Limite: " + getLimiteR();
        imprimir += "]";
        
        return imprimir;
    }

}