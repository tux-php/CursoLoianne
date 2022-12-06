package com.fernando.cursoOO.aula31;

public class TesteCarro {

	public static void main(String[] args) {
		Carro kicks = new Carro("Nissan", "kicks", 5, 43, 2);
		
		System.out.println("Carro" + kicks.marca);
		System.out.println("Ligar: " + kicks.ligarCarro());
		System.out.println("Consumo:" + kicks.capCombustivel);
		
		kicks.consumoCombustivel(5);
	}

}
