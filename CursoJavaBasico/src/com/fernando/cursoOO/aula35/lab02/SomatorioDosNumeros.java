/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.cursoOO.aula35.lab02;

/**
 *
 * @author fernando
 */
public class SomatorioDosNumeros {

    public SomatorioDosNumeros() {
    }

    public static int somar(int num) {
        if (num < 2)
        {
            return 1;
        }
        return num + somar(num - 1);
    }
}
