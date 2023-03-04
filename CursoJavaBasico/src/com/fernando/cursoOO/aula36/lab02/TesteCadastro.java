/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.cursoOO.aula36.lab02;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class TesteCadastro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean sair = false;
        Scanner scan = new Scanner(System.in);
        String resp;
        while (sair == false)
        {
            System.out.println("Gostaria de iniciar ? s/n");
            resp = scan.next();
            if (resp.equalsIgnoreCase("s"))
            {
                System.out.println("Cadastre o Curso: ");
                String nome_curso = scan.next();
                System.out.println("Cadastre o horário do curso: ");
                String horario_curso = scan.next();

                Curso curso = new Curso(nome_curso, horario_curso);

                System.out.println("Nome do Professor: ");
                String nome_prof = scan.next();
                System.out.println("Departamento do Professor: ");
                String dep_prof = scan.next();
                System.out.println("Email do Professor: ");
                String email_prof = scan.next();

                curso.incluirProfessor(nome_prof, dep_prof, email_prof);

                System.out.println("Nome do Aluno1: ");
                String nome_aluno = scan.next();
                System.out.println("Matricula do Aluno1: ");
                String matricula = scan.next();
                System.out.println("Nota1 do Aluno1: ");
                Double nota1 = scan.nextDouble();
                System.out.println("Nota2 do Aluno1: ");
                Double nota2 = scan.nextDouble();
                System.out.println("Nota3 do Aluno1: ");
                Double nota3 = scan.nextDouble();
                System.out.println("Nota4 do Aluno1: ");
                Double nota4 = scan.nextDouble();

                curso.addAluno(nome_aluno, matricula, nota1, nota2, nota3, nota4);

                System.out.println("Curso: " + curso.getNome());
                System.out.println("Hoário do curso: " + curso.getHorario());

                System.out.println("Professor: " + curso.getProfessor().getNome());
                System.out.println("Departamento :" + curso.getProfessor().getDepartamento());
                System.out.println("E-mail: " + curso.getProfessor().getEmail());

                for (Aluno aluno : curso.getListaAlunos())
                {
                    System.out.println("Aluno: " + aluno.getNome());
                    System.out.println("Matrícula : " + aluno.getMatricula());
                    System.out.println("Aluno: " + aluno.getNota1());

                    System.out.println("Média das notas: " + aluno.getMedia());
                    System.out.println("Situação: " + aluno.getSituacaoAluno());
                }

            } else
            {
                System.out.println("saindo...");
            }
        }
    }

}
