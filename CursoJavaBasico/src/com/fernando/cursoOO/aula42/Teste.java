/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.cursoOO.aula42;

/**
 *
 * @author fernando
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
//        Pessoa aluno = new Aluno();
//        Pessoa professor = new Professor();
        
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        
        System.out.println(Constantes.URL_BLOG);
        Constantes.URL_BLOG = "http://fernando.com";
        System.out.println(Constantes.URL_BLOG);
    }
    
}
