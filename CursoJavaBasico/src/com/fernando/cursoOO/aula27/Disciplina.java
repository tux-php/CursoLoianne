package com.fernando.cursoOO.aula27;

public class Disciplina {
	String codDisciplina;
	String nomeDisciplina;
	String codCurso;
	
	public Disciplina(String codDisciplina, String nomeDisciplina, Curso curso) {
		this.codDisciplina = codDisciplina;
		this.nomeDisciplina = nomeDisciplina;
		this.codCurso = curso.getCodCurso();
	}
	
	String getCodDisciplina() {
		return codDisciplina;
	}
	String getNomeDisciplina() {
		return nomeDisciplina;
	}
	String getCodCurso() {
		return codCurso;
	}
	
	

}
