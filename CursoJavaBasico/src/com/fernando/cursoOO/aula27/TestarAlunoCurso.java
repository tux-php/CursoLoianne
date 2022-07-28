package com.fernando.cursoOO.aula27;

import java.util.Scanner;

public class TestarAlunoCurso {

	public static void main(String[] args) {
		String nome;
		String matricula;
		boolean sair = false;
		Scanner scan = new Scanner(System.in);
		
		Curso computacao = new Curso("comp001", "Ciência da Computação");

		Disciplina cc001 = new Disciplina("cc001", "Algoritmo Estruturado", computacao);
		Disciplina cc002 = new Disciplina("cc002", "Engenharia de Software I", computacao);
		Disciplina cc003 = new Disciplina("cc003", "Banco de Dados", computacao);
		
		while(!sair) {
			System.out.println("Informe o nome do aluno(a).");
			nome = scan.nextLine();
			System.out.println("Informe a matrícula do aluno(a).");
			matricula = scan.nextLine();
			
			Aluno aluno = new Aluno(nome, matricula, computacao);			
			aluno.matricularDisciplina(cc001);
			aluno.matricularDisciplina(cc002);
			aluno.matricularDisciplina(cc003);
			
			aluno.salvarNota(cc001, 3, 5);
			aluno.salvarNota(cc002, 10, 9);
			aluno.salvarNota(cc003, 6, 10);
			
			aluno.emitirHistorico(computacao);
		}
		

	}

	

}
