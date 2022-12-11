/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.cursoOO.aula35.lab01;

/**
 *
 * @author fernando
 */
public class Fibonacci {

    public Fibonacci() {
    }

    public static int calcular(int num) {
        if (num < 2)
        {
            return 1;
        }
        return calcular(num - 1) + calcular(num - 2);
    }
}
