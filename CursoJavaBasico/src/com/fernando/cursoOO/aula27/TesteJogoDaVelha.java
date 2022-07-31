package com.fernando.cursoOO.aula27;

import java.util.Scanner;

public class TesteJogoDaVelha {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean sair = false;
		JogoDaVelha tabuleiro = new JogoDaVelha();
		String resp;
		int jogadaDaVez = 0;
		int posicao;
		String jogadorNome;
		boolean flagJogadores = false;

		while (!sair) {
			System.out.println("Iniciar a partida ?(S/N)");
			resp = scan.next();
			if (resp.equalsIgnoreCase("s")) {
				while (!flagJogadores) {
					tabuleiro.mostrarTabuleiro();
					if (jogadaDaVez % 2 == 0) {
						jogadorNome = "Jogador1";
						System.out.println(jogadorNome + " faça sua jogada.");
						posicao = scan.nextInt();
						if (!tabuleiro.validarMarcacaoTabuleiro(posicao, "O")) {
							jogadaDaVez--;
						}

					} else {
						jogadorNome = "Jogador2";
						System.out.println(jogadorNome + " faça sua jogada.");
						posicao = scan.nextInt();
						if (!tabuleiro.validarMarcacaoTabuleiro(posicao, "X")) {
							jogadaDaVez--;
						}
					}
					if (tabuleiro.lancarVencedor()) {
						System.out.println(jogadorNome + " é o campeão. Parabéns!!");
						flagJogadores = true;
						sair = true;
					} else {
						jogadaDaVez++;
					}

				}

			} else {
				System.out.println("Good By.:)");
				sair = true;
			}
		}

	}

}
