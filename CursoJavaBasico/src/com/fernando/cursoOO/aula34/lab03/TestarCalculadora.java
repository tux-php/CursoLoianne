/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.cursoOO.aula34.lab03;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class TestarCalculadora {

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            
            int num;
            
            do{
                System.out.println("Entre com um número positivo");
                num = scan.nextInt();
                
                if(num < 0){
                    System.out.println("Número inválido, entre novamente.");
                }
            }while(num < 0);
        
          System.out.println(Calculadora.fazerFatorial(num));
          
         
    }

}
