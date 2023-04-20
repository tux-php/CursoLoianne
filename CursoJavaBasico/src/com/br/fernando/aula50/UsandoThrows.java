/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.br.fernando.aula50;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 004349292569
 */
public class UsandoThrows {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Entre com um número decimal.");
        try {
            double num = leNumero();
            System.out.println("Você digitou " + num);
        } catch (Exception ex) {
            System.out.println("Entrada inválida.");
            ex.printStackTrace();
        }
    }
    
    public static double leNumero() throws Exception{
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
    
}
