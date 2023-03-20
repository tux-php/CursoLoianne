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

    public double sacar(double valor) {
        double saldoLimite = getSaldo() + getLimiteR();

        if (saldoLimite > 0)
        {
            if (getSaldo() >= 0)
            {

                double valorMinimo = getSaldo() - valor;
                sacarSaldoOuLimite(valorMinimo, valor);

                return getSaldo();
            }
        }
        return 0;
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
        String cliente = "Cliente: " + getNomeCliente();
        String conta = "Conta Polpanca:  " + getNumConta();
        String saldo = "Saldo Polpanca s/ tx: " + getSaldo();
        String limite = "Limite: " + getLimiteR();
        
        String imprimir = cliente + "\n";
        imprimir += conta + "\n";
        imprimir += saldo + "\n";
        imprimir += limite + "\n";
        
        return imprimir;
    }

}
