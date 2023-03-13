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
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        String[] cursos = new String[1];
        cursos[0] = "Computação";
        double[] notas = new double[1];
        notas[0] = 9.8;

        professor.setNome("Raphael Lacerda");
        professor.setCpf("00044444");
        professor.setEndereco("Brasília rua dos safos");
        professor.setNomeCurso("Ciência da Computação");
        professor.setDepartamento("Exatas");
        professor.setSalario(18989.98);
        professor.setTelefone("61888555666");

        System.out.println("Nome: " + professor.getNome());
        System.out.println("Cpf: " + professor.getCpf());
        System.out.println("Endereço: " + professor.getEndereco());
        System.out.println("Telefone: " + professor.getTelefone());
        System.out.println("Salário: " + professor.getSalario());
        if (professor.getDepartamento() != null) {
            System.out.println("Departamento: " + professor.getDepartamento());

        }
        System.out.println("Curso: " + professor.getNomeCurso());

        System.out.println("---------------------------");

        aluno.setNome("Fernando");
        aluno.setEndereco("Sao Paulo rua dos jedi");
        aluno.setCpf("52600270272");
        aluno.setTelefone("96996633");
        aluno.setCursos(cursos);
        aluno.setNotas(notas);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Cpf: " + aluno.getCpf());
        System.out.println("Endereço: " + aluno.getEndereco());
        System.out.println("Telefone: " + aluno.getTelefone());
        if (aluno.getCursos() != null) {
            for (String al : aluno.getCursos()) {
                System.out.println("Curso: " + al);
            }
        }

        if (aluno.getNotas() != null) {
            for (double nt : aluno.getNotas()) {
                System.out.println("Notas: " + nt);
            }
        }
    }
    
}
