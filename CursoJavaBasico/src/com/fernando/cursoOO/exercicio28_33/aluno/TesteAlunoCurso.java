package com.fernando.cursoOO.exercicio28_33.aluno;

import java.util.Scanner;

public class TesteAlunoCurso {

	public static void main(String[] args) {
		String nome;
		String matricula;
		boolean sair = false;
		Scanner scan = new Scanner(System.in);

		while (!sair) {
			System.out.println("Informe o código e nome do Curso");
			String codCurso = scan.nextLine();
			String nomeCurso = scan.nextLine();
			Curso curso = new Curso(codCurso, nomeCurso);

			Disciplina cc001 = new Disciplina("cc001", "Algoritmo Estruturado", curso);
			Disciplina cc002 = new Disciplina("cc002", "Engenharia de Software I", curso);
			Disciplina cc003 = new Disciplina("cc003", "Banco de Dados", curso);

			System.out.println("Informe o nome do aluno(a).");
			nome = scan.nextLine();
			System.out.println("Informe a matrícula do aluno(a).");
			matricula = scan.nextLine();

			Aluno aluno = new Aluno(nome, matricula, curso);
			aluno.matricularDisciplina(cc001);
			aluno.matricularDisciplina(cc002);
			aluno.matricularDisciplina(cc003);

			for (String cod : aluno.listarCodDisciplinas()) {
				System.out.println("Informe a nota1 e nota2 da disciplina " + cod);
				double nota1 = scan.nextDouble();
				double nota2 = scan.nextDouble();
				aluno.salvarNota(cod, nota1, nota2);
			}

			aluno.emitirHistorico();
		}

	}

}
