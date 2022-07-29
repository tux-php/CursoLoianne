package com.fernando.cursoOO.aula27;

import java.util.Scanner;

public class TesteJogoDaVelha {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean sair = false;
		String resp;
		String[][] tabuleiro = new String[3][3];
		int jogadaDaVez = 0;
		while(!sair) {
			System.out.println("Iniciar a partida ?(S/N)");
			resp = scan.next();
			if(resp.equalsIgnoreCase("s")) {
				for(int i = 0; i < tabuleiro.length; i++) {
					for(int j = 0; j < tabuleiro[i].length; j++) {
						System.out.print("|" + tabuleiro[i][j] + "|");
					}
					System.out.println();
				}
				System.out.println();
				//continuar
				if(jogadaDaVez % 2 == 0) {
					System.out.println("Jogador1 faça sua jogada.");					
				}else {
					System.out.println("Jogador2 faça sua jogada.");
				}
				jogadaDaVez++;
			}
		}

	}

}
