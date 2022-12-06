package com.fernando.cursoOO.aula31;

class Carro {
	String marca;
	String modelo;
	int numPassegeiros;
	double capCombustivel;
	double consumoCombustivel;
	boolean chaveVirada;
	
	public Carro(String marca, String modelo, int numPassegeiros, double capCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassegeiros = numPassegeiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}
	
	boolean ligarCarro() {
		return true;
	}
	
	private double calculoConsumo(double km) {
		return consumoCombustivel * km;
	}
	
	public void consumoCombustivel(double km) {
		
		System.out.println("Consumido: " + this.calculoConsumo(km));
	}

}
