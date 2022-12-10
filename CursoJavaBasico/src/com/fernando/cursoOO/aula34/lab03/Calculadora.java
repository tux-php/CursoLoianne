/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.cursoOO.aula34.lab03;

/**
 *
 * @author fernando
 */
public class Calculadora {

    public Calculadora() {
    }

    public static int somar(int num1, int num2) {
        return num1 + num2;
    }

    public static double somar(double num1, double num2) {
        return num1 + num2;
    }

    public static double multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(int num1, int num2) {
        return num1 / num2;
    }

    public static double subtrair(int num1, int num2) {
        return num1 - num2;
    }

    public static double elevarPotenciaN(int num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static int fazerFatorial(int num) {
        if (num == 0) {
            return 1;
        }
  
        int fat = 1;
        for (int i = num; i > 1; i--) {
            fat *= i;
        }
        return fat;

    }

}
