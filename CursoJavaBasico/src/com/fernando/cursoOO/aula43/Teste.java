/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.cursoOO.aula43;

/**
 *
 * @author fernando
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setCurso("Ciência da Computação");
        
        double notas[] = {10, 9, 8, 7};
        aluno.setNotas(notas);
        
        System.out.println(aluno);
    }
    
}
