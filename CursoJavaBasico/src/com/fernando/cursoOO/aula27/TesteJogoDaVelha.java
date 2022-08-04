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
				flagJogadores = false;
				//adicionar o limparJogo();
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

					if (tabuleiro.lancarVencedor("X") || tabuleiro.lancarVencedor("O")) {
						tabuleiro.mostrarTabuleiro();
						System.out.println(jogadorNome + " é o campeão. Parabéns!!");
						flagJogadores = true;

					} else if (jogadaDaVez == 8) {
						tabuleiro.mostrarTabuleiro();
						System.out.println("Jogo empatado!!");
						flagJogadores = true;
					} else {
						jogadaDaVez++;
					}
					//flagJogadores = true;
				}
				

			} else {
				System.out.println("Good By.:)");
				sair = true;
			}
		}

	}

}
