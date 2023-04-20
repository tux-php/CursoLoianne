/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.br.fernando.aula39_40.lab01;

/**
 *
 * @author 004349292569
 */
public class Teste {

    public static void main(String[] args) {
//        System.out.println("-----------------------------------------------");
//
//        ContaBancaria simples = new ContaBancaria();
//        simples.setNomeCliente("Guilherme Correa");
//        simples.setNumConta("1122556");
//        simples.setSaldo(200);
//        simples.depositar(100);
//        
//        verificarSaldo(simples, 500);
   
//        ContaPolpanca polpanca = new ContaPolpanca();
//        polpanca.setNomeCliente("Fernando Baia");
//        polpanca.setNumConta("22209-8");
//        polpanca.setSaldo(500.00);
//
//        //System.out.println(polpanca);
//        
//        verificarSaldo(polpanca, 400);
//
//        //polpanca.sacar(200);
//        System.out.println("Saldo Polpanca depois do saque: " + polpanca.getSaldo());
//
//        polpanca.depositar(200);
//        System.out.println("Saldo Polpanca após deposito: " + polpanca.getSaldo());
//
//        polpanca.setDiaRendimento(29);
//        if(polpanca.calcularNovoSaldo(0.5)){
//            System.out.println("Hoje é dia do Rendimento: " + polpanca.getDiaRendimento());
//            System.out.println("Saldo Polpanca c/ tx: " + polpanca.getSaldo());            
//        }else{
//            System.out.println("Hoje não dia de Rendimento. Novo saldo não calculado. Saldo: " + polpanca.getSaldo());
//        }
//        
//
//
//        System.out.println("-----------------------------------------------");

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
        especial.depositar(200);
        especial.sacar(50);        
        System.out.println("Saldo Especial após deposito: " + especial.getSaldo());
        System.out.println("Saldo LImite após deposito: " + especial.getLimiteR());
        
        System.out.println("--------------------------------");
        especial.sacar(200);        
        System.out.println("Saldo Especial após deposito: " + especial.getSaldo());
        System.out.println("Saldo LImite após deposito: " + especial.getLimiteR());
}
    
 public static void verificarSaldo(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println(conta);
        } else {
            System.out.println("Valor: " + valor + " ;" + "Saldo Insuficiente." + " Saldo: " + conta.getSaldo());
        }
    }
 
}
