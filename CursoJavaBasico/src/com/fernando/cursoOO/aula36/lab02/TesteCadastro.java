/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.cursoOO.aula36.lab02;

import java.util.ArrayList;
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
        String[] nome_aluno = new String[6];
        String[] matricula = new String[6];
        Double[] notaA = new Double[6];
        Double[] notaB = new Double[6];
        Double[] notaC = new Double[6];
        Double[] notaD = new Double[6];
        Aluno[] aluno = new Aluno[6];
        ArrayList<Double> mediaTurma = new ArrayList<>();

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

                System.out.println("Nome do Professor(a): ");
                String nome_prof = scan.next();
                System.out.println("Departamento do Professor(a): ");
                String dep_prof = scan.next();
                System.out.println("Email do Professor(a): ");
                String email_prof = scan.next();
                
                Professor professor = new Professor(nome_prof, dep_prof, email_prof);
                
                curso.setProfessor(professor);

                for (int i = 1; i <= 5; i++)
                {
                    System.out.println("Nome do Aluno(a) " + i + " : ");
                    nome_aluno[i] = scan.next();
                    System.out.println("Matricula do Aluno(a): " + i + " : ");
                    matricula[i] = scan.next();
                    System.out.println("Nota1 do Aluno(a): " + i + " : ");
                    notaA[i] = scan.nextDouble();
                    System.out.println("Nota2 do Aluno(a): " + i + " : ");
                    notaB[i] = scan.nextDouble();
                    System.out.println("Nota3 do Aluno(a): " + i + " : ");
                    notaC[i] = scan.nextDouble();
                    System.out.println("Nota4 do Aluno(a): " + i + " : ");
                    notaD[i] = scan.nextDouble();

                    aluno[i] = new Aluno(nome_aluno[i], matricula[i], notaA[i], notaB[i], notaC[i], notaD[i]);

                    mediaTurma.add(notaA[i]);
                    mediaTurma.add(notaB[i]);
                    mediaTurma.add(notaC[i]);
                    mediaTurma.add(notaD[i]);

                    curso.addAluno(aluno[i]);
                }

                int somaMediaTurma = 0;

                for (Double soma : mediaTurma)
                {
                    somaMediaTurma += soma;
                }

                System.out.println("Curso: " + curso.getNome());
                System.out.println("Hoário do curso: " + curso.getHorario());

                System.out.println("Professor(a): " + curso.getProfessor().getNome());
                System.out.println("Departamento :" + curso.getProfessor().getDepartamento());
                System.out.println("E-mail: " + curso.getProfessor().getEmail());
                System.out.println("-------------------------------------------------");

                for (Aluno alunoItem : curso.getListaAlunos())
                {
                    System.out.println("Aluno(a): " + alunoItem.getNome());
                    System.out.println("Matrícula : " + alunoItem.getMatricula());

                    System.out.println("Média : " + alunoItem.getMedia());
                    System.out.println("Situação: " + alunoItem.getSituacaoAluno());
                    System.out.println("-------------------------------------------------");
                }
                System.out.println("Média da Turma: " + somaMediaTurma / 20);

            } else
            {
                
                System.out.println("Gostaria de sair do sistema ? (s/n)");
                resp = scan.next();
                if (resp.equalsIgnoreCase("s"))
                {
                    System.out.println("saindo...");
                    sair = true;
                }
            }
        }
    }

}
