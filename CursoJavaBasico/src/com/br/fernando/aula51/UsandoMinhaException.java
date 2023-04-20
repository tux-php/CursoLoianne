/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.br.fernando.aula51;

import com.br.fernando.aula52.DivisaoNaoExata;

/**
 *
 * @author 004349292569
 */
public class UsandoMinhaException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
        int[] demon = {2, 0, 4, 8, 0, 2, 4};

        for (int i = 0; i < numeros.length; i++) {

            try {
                if (numeros[i] % 2 != 0) {
                    throw new DivisaoNaoExata(numeros[i], demon[i]);
                }
                System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i] / demon[i]));
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e) {
                System.out.println("Ocorreu um erro.");
                e.printStackTrace();
            }
        }
    }

}
