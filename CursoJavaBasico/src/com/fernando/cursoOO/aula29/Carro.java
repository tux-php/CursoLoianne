package com.fernando.cursoOO.aula29;

public class Carro {
	String marca;
	String modelo;
	int numPassegeiros;
	double capCombustivel;
	double consumoCombustivel;
	
	public Carro(String marca, String modelo, int numPassegeiros, double capCombustivel, double consumoCombustivel) {		
		this.marca = marca;
		this.modelo = modelo;
		this.numPassegeiros = numPassegeiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}
	
	public Carro() {}

	public Carro(String marca, String modelo) {		
		this(marca, modelo, 10);
		System.out.println("Chamando construtor com 2 parâmetros.");
	}

	public Carro(String marca, String modelo, int numPassegeiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassegeiros = numPassegeiros;
		System.out.println("Chamando construtor com 3 parâmetros.");
	}
	
	
	
	

}
