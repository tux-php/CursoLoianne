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
public class Calculadora {

    public Calculadora() {
    }

    public static int fazerFatorial(int num) {
        if (num == 0)
        {
            return 1;
        }

        int fat = 1;
        for (int i = num; i > 1; i--)
        {
            fat *= i;
        }
        return fat;

    }

    public static int fatorial(int num) {
        //metodos recursivos sempre tem ponto de parada. 
        //Caso contrario fica em loop infinito.
        if (num == 0)
        {
            return 1;
        }
        return num * fatorial(num - 1);
    }
}
