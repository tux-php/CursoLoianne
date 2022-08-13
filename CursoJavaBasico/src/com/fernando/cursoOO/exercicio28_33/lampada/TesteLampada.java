package com.fernando.cursoOO.exercicio28_33.lampada;

public class TesteLampada {

	public static void main(String[] args) {
		Lampada encadescente = new Lampada("Encandescente", "LED", "branca", "Ouro Lux", true);

		encadescente.printDescricao();
		encadescente.tomada();

		System.out.println();

		encadescente.printDescricao();
		System.out.println();

		encadescente.tomada();

		encadescente.printDescricao();

	}

}
