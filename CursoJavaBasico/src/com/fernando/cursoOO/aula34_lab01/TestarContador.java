package com.fernando.cursoOO.aula34_lab01;

public class TestarContador {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Contador c = new Contador();
		}

		imprimirValor();
		for (int i = 0; i < 3; i++) {
			Contador.incrementarContador();
		}

		imprimirValor();
		Contador.zerarContador();
		imprimirValor();

	}

	public static void imprimirValor() {
		System.out.println("Contador: " + Contador.getCont());
	}

}
