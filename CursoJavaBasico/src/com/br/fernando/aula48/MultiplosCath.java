/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.fernando.aula48;

/**
 *
 * @author 004349292569
 */
public class MultiplosCath {

    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] demon = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i] / demon[i]));
            } catch (ArithmeticException e) {
                System.out.println("Erro ao dividir por zero.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Índice não encontrado no vetor.");
            }

        }
    }

}
