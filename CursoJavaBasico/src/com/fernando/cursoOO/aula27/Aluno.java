package com.fernando.cursoOO.aula27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Aluno {
	String nome;
	String matricula;
	String codCurso;
	String nomeCurso;
	ArrayList<String> codDisciplinas = new ArrayList<>();
	ArrayList<String> nomeDisciplinas = new ArrayList<>();
	Map<String, Double> disciplinaNotas = new HashMap<>();
	String msg = "";
	double media;

	public Aluno(String nome, String matricula, Curso curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.codCurso = curso.getCodCurso();
		this.nomeCurso = curso.getNomeCurso();
	}

	String getNome() {
		return nome;
	}

	String getNomeCurso() {
		return nomeCurso;
	}

	String getMatricula() {
		return matricula;
	}

	String getCodCurso() {
		return codCurso;
	}

	ArrayList<String> matricularDisciplina(Disciplina disciplina) {
		codDisciplinas.add(disciplina.codDisciplina);
		nomeDisciplinas.add(disciplina.getNomeDisciplina());
		return codDisciplinas;
	}

	ArrayList<String> listarDisciplinaMatriculadas() {
		ArrayList<String> matriculasAluno = new ArrayList<>();
		for (String disciplinaNome : nomeDisciplinas) {
			matriculasAluno.add(disciplinaNome);
		}
		return matriculasAluno;

	}

	ArrayList<String> listarCodDisciplinas() {
		ArrayList<String> codigoDisciplinas = new ArrayList<>();
		for (String codDisciplina : codDisciplinas) {
			codigoDisciplinas.add(codDisciplina);
		}
		return codDisciplinas;

	}

	void salvarNota(String disciplina, double nota1, double nota2) {
		media = (nota1 + nota2) / 2;
		disciplinaNotas.put(disciplina, media);
	}

	void listarNota() {
		disciplinaNotas.forEach((disc, media) -> {
			if (media >= 7) {
				System.out.println("Aluno aprovado na disciplina " + disc + " com " + media);
			} else {
				System.out.println("Aluno reprovado na disciplina " + disc + " com " + media);
			}
		});

	}

	void emitirHistorico() {
		System.out.println("Aluno: " + getNome());
		System.out.println("Matrícula: " + getMatricula());
		System.out.println("Curso: " + getNomeCurso());
		System.out.println("Disciplinas matriculadas: " + listarDisciplinaMatriculadas());
		listarNota();
	}

}
