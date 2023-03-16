/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.cursoOO.aula42;

import com.fernando.cursoOO.aula38.*;

/**
 *
 * @author fernando
 */
public class Aluno {

    private String curso;
    private Double[] notas;

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

}
