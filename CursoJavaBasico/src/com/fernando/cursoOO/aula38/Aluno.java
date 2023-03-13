/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.cursoOO.aula38;

/**
 *
 * @author fernando
 */
public class Aluno extends Pessoa{
    private String[] cursos;
    private Double[] notas;
    
    public Aluno(){}

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

   

    
    public double calcularMedia(){
        return 0;
    }
    
    public double verificarAprovado(){
        return 0;
    }

    /**
     * @return the notas
     */
    public Double[] getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(Double[] notas) {
        this.notas = notas;
    }
    
}
