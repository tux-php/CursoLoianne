/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.cursoOO.aula37;

/**
 *
 * @author fernando
 */
public class Aluno extends Pessoa{

    private String[] cursos;
    private double[] notas;

    public Aluno() {
    }

    /**
     * @return the cursos
     */
    public String[] getCursos() {
        return cursos;
    }

    /**
     * @param cursos the cursos to set
     */
    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }

  

    public Double calcularMedia() {
        return 0.0;
    }

    public boolean verificarAprovado() {
        return true;
    }

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

   
}
