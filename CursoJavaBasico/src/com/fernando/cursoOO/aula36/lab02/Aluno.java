/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.cursoOO.aula36.lab02;

/**
 *
 * @author fernando
 */
public class Aluno {

    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private String situacao;

    public Aluno(String nome, String matricula, double nota1, double nota2, double nota3, double nota4) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getMedia() {
        double media = (getNota1() + getNota2() + getNota3() + getNota4()) / 4;

        return media;
    }

    public String getSituacaoAluno() {
        return situacao = getMedia() >= 7 ? "Aprovado" : "Reprovado";
    }

}
