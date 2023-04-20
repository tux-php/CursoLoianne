/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.fernando.aula39_40.lab01;

import java.util.Calendar;

public class ContaPolpanca extends ContaBancaria {

    private int diaRendimento;

    public ContaPolpanca() {
    }

    public boolean calcularNovoSaldo(double taxa) {
        Calendar hoje = Calendar.getInstance();
        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            if (getSaldo() >= 0) {
                setSaldo(getSaldo() + getSaldo() * taxa);
            }
            return true;
        }
        return false;
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

    public String toString() {

        super.toString();

        String imprimir = "Conta Polpança[";
        imprimir += " diaRendimento: " + diaRendimento + "\n";
        imprimir += super.toString();
        imprimir += "; saldo: " + getSaldo();
        imprimir += "]";

        return imprimir;
    }

}
