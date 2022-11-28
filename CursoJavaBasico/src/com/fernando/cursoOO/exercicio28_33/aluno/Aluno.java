package com.fernando.cursoOO.exercicio28_33.aluno;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Aluno {
	private String nome;
	private String matricula;
	private String codCurso;
	private String nomeCurso;
	private ArrayList<String> codDisciplinas = new ArrayList<>();
	private ArrayList<String> nomeDisciplinas = new ArrayList<>();
	private Map<String, Double> disciplinaNotas = new HashMap<>();
	private double media;

	public Aluno(String nome, String matricula, Curso curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.codCurso = curso.getCodCurso();
		this.nomeCurso = curso.getNomeCurso();
	}

	public Aluno() {
	};

	public String getNome() {
		return nome;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getCodCurso() {
		return codCurso;
	}

	public ArrayList<String> matricularDisciplina(Disciplina disciplina) {
		codDisciplinas.add(disciplina.getCodDisciplina());
		nomeDisciplinas.add(disciplina.getNomeDisciplina());
		return codDisciplinas;
	}

	public ArrayList<String> listarDisciplinaMatriculadas() {
		ArrayList<String> matriculasAluno = new ArrayList<>();

		for (String disciplinaNome : nomeDisciplinas) {
			matriculasAluno.add(disciplinaNome);
		}
		return matriculasAluno;

	}

	public ArrayList<String> listarCodDisciplinas() {
		ArrayList<String> codigoDisciplinas = new ArrayList<>();

		for (String codDisciplina : codDisciplinas) {
			codigoDisciplinas.add(codDisciplina);
		}
		return codDisciplinas;

	}

	public void salvarNota(String disciplina, double nota1, double nota2) {
		media = (nota1 + nota2) / 2;
		disciplinaNotas.put(disciplina, media);
	}

	public void listarNota() {

		disciplinaNotas.forEach((disc, media) -> {
			String aprovado = "Aluno(a) aprovado(a) na disciplina " + disc + " com " + media;
			String reprovado = "Aluno(a) reprovado(a) na disciplina " + disc + " com " + media;
			if (media >= 7) {
				System.out.println(aprovado);
			} else {
				System.out.println(reprovado);
			}
		});

	}

	public void emitirHistorico() {
		System.out.println("Aluno: " + getNome());
		System.out.println("Matrícula: " + getMatricula());
		System.out.println("Curso: " + getNomeCurso());
		System.out.println("Disciplinas matriculadas: " + listarDisciplinaMatriculadas());
		listarNota();
	}

}
