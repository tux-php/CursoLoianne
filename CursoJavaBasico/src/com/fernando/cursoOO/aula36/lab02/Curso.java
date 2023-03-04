/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.cursoOO.aula36.lab02;

import java.util.ArrayList;

/**
 *
 * @author fernando
 */
public class Curso {

    private String nome;
    private String horario;

    public Professor professor;
    public Aluno aluno;
    public ArrayList<Aluno> listaAlunos;

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void addAluno(String nome, String matricula, double nota1, double nota2, double nota3, double nota4) {
        this.listaAlunos = new ArrayList();
        this.aluno = new Aluno(nome, matricula, nota1, nota2, nota3, nota4);

        listaAlunos.add(aluno);
    }

    public ArrayList<Aluno> getListaAlunos() {
        
        return listaAlunos;
    }

    public Curso(String nome, String horario) {
        this.nome = nome;
        this.horario = horario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void incluirProfessor(String nome, String dept, String email) {
        this.professor = new Professor(nome, dept, email);
    }

}
