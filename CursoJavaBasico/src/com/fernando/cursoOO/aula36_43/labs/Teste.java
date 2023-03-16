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
        
        System.out.println("Cliente: " + polpanca.getNomeCliente());
        System.out.println("Conta Polpanca: " + polpanca.getNumConta());
        System.out.println("Saldo Polpanca s/ tx: " + polpanca.getSaldo());
        
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
        especial.setVl_limite(2000);
        especial.setLimite(2000);
        
        
        System.out.println("Cliente: " + especial.getNomeCliente());
        System.out.println("Conta Especial: " + especial.getNumConta());        
        System.out.println("Saldo Especial s/ tx: " + especial.getSaldo());
        System.out.println("Conta Especial com Limite: " + especial.getLimite());
        
        especial.sacar(1500);
        System.out.println("Saldo Especial depois do saque: " + especial.getSaldo());
        System.out.println("Saldo Limite Especial após o saque: " + especial.getLimite());
        especial.depositar(1500);
        System.out.println("Saldo Especial após deposito: " + especial.getSaldo());
        System.out.println("Saldo LImite após deposito: " + especial.getLimite());
    }
    
}
