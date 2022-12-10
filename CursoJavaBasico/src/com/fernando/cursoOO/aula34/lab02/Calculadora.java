package com.fernando.cursoOO.aula34.lab02;

public class Calculadora {
	public Calculadora() {}

	public static int somar(int num1, int num2) {
		return num1 + num2;
	}

	public static double somar(double num1, double num2) {
		return num1 + num2;
	}

	public static double multiplicar(int num1, int num2) {
		return num1 * num2;
	}

	public static double multiplicar(double num1, double num2) {
		return num1 * num2;
	}

	public static double dividir(int num1, int num2) {
		return num1 / num2;
	}
	
	public static double subtrair(int num1, int num2) {
		return num1 - num2;
	}

	public static double elevarPotenciaN(int num1, int num2) {
		return Math.pow(num1, num2);
	}
}
