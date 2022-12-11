/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.cursoOO.aula35;

/**
 *
 * @author fernando
 */
public class TesteCalculadora {
    public static void main(String[] args) {
        int fatorialNR = Calculadora.fazerFatorial(5);
        System.out.println(fatorialNR);
        
        int fatorialR = Calculadora.fatorial(5);
        System.out.println(fatorialR);
    }
    
}
