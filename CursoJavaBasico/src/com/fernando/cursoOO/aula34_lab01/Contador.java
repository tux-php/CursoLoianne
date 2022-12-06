package com.fernando.cursoOO.aula34_lab01;

public class Contador {
	private static int cont;

	public Contador() {
		cont++;
	}

	public static int getCont() {
		return cont;
	}

	public static void setCont(int novoCont) {
		cont = novoCont;
	}

	public static void zerarContador() {
		setCont(0);
	}

	public static int incrementarContador() {
		return cont++;
	}

}
