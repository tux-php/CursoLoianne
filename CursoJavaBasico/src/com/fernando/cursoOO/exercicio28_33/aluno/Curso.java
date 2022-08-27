package com.fernando.cursoOO.exercicio28_33.aluno;

public class Curso {
	private String codCurso;
	private String nomeCurso;
	private String[] listaDisciplina;
	
	public Curso(String codCurso, String nomeCurso) {
		this.codCurso = codCurso;
		this.nomeCurso = nomeCurso;
	}
	
	public String getCodCurso() {
		return codCurso;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public String getNomeCurso(String codCurso) {
		if(getCodCurso() == codCurso) {
			return nomeCurso;	
		}
		return nomeCurso;
		
	}
	
	
	
}
