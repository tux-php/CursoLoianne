/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.cursoOO.aula43;

import java.util.Arrays;

/**
 *
 * @author fernando
 */
public class Aluno {

    private String curso;
    private double[] notas;

    public Aluno() {
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        //super(nome, endereco, telefone);
        this.curso = curso;
    }

    public double calcularMedia() {
        return 0;
    }

    public double verificarAprovado() {
        return 0;
    }

    

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

//    public String toString() {
//        String s = getCurso() + "\n";
//        for (double nota : getNotas())
//        {
//            s += nota + " ";
//        }
//        return s;
//    }

    /**
     * @return the notas
     */
    public double[] getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Aluno{" + "curso=" + curso + ", notas=" + Arrays.toString(notas) + '}';
    }

 
    
    

}
