package com.fernando.cursoOO.aula27;

public class Curso {
	String codCurso;
	String nomeCurso;
	String[] listaDisciplina;
	
	public Curso(String codCurso, String nomeCurso) {
		this.codCurso = codCurso;
		this.nomeCurso = nomeCurso;
	}
	
	String getCodCurso() {
		return codCurso;
	}
	String getNomeCurso() {
		return nomeCurso;
	}
	String getNomeCurso(String codCurso) {
		if(getCodCurso() == codCurso) {
			return nomeCurso;	
		}
		return nomeCurso;
		
	}
	
	
	
}
