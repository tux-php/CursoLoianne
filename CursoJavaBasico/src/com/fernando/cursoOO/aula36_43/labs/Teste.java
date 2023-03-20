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
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaPolpanca polpanca = new ContaPolpanca();
        polpanca.setNomeCliente("Fernando Baia");
        polpanca.setNumConta("22209-8");
        polpanca.setSaldo(3500.00);

        System.out.println(polpanca);
        

        polpanca.sacar(200);
        System.out.println("Saldo Polpanca depois do saque: " + polpanca.getSaldo());

        polpanca.depositar(1800);
        System.out.println("Saldo Polpanca após deposito: " + polpanca.getSaldo());

        polpanca.setDiaRendimento(10);
        polpanca.calcularNovoSaldo(0.030);

        System.out.println("Dias de Rendimento: " + polpanca.getDiaRendimento() + " dias.");
        System.out.println("Saldo Polpanca c/ tx: " + polpanca.getSaldo());

        System.out.println("-----------------------------------------------");

        ContaEspecial especial = new ContaEspecial();
        especial.setNomeCliente("Dayanne Gomes");
        especial.setNumConta("889910-X");
        especial.setSaldo(1000.00);
        especial.setLimiteR(2000);

        System.out.println(especial);

        especial.sacar(1500);
        System.out.println("Saldo depois do saque: " + especial.getSaldo());
        System.out.println("Limite após o saque: " + especial.getLimiteR());

        especial.depositar(500);
        System.out.println("Saldo Especial após deposito: " + especial.getSaldo());
        System.out.println("Saldo LImite após deposito: " + especial.getLimiteR());
        
        System.out.println("--------------------------------");        
        especial.depositar(500);
        especial.depositar(150);
        especial.sacar(300);
        especial.sacar(450);
        especial.depositar(200);
        especial.sacar(50);
        System.out.println("Saldo Especial após deposito: " + especial.getSaldo());
        System.out.println("Saldo LImite após deposito: " + especial.getLimiteR());
    }

}
