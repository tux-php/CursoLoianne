package com.fernando.cursoOO.exercicio28_33.aluno;

public class Disciplina {
	private String codDisciplina;
	private String nomeDisciplina;
	private String codCurso;

	public Disciplina(String codDisciplina, String nomeDisciplina, Curso curso) {
		this.codDisciplina = codDisciplina;
		this.nomeDisciplina = nomeDisciplina;
		this.codCurso = curso.getCodCurso();
	}

	public String getCodDisciplina() {
		return codDisciplina;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public String getCodCurso() {
		return codCurso;
	}

}
