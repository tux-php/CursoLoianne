package com.fernando.cursoOO.aula28_33.jogoDaVelha;

import java.util.Scanner;

public class TesteJogoDaVelha {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		JogoDaVelha tabuleiro = new JogoDaVelha();

		String resp, jogadorNome;
		int jogadaDaVez, posicao;
		boolean flagJogadores;
		boolean sair = false;

		while (!sair) {
			System.out.println("Iniciar a partida ?(S/N)");
			resp = scan.next();
			if (resp.equalsIgnoreCase("s")) {
				flagJogadores = false;
				tabuleiro.limparJogo();
				jogadaDaVez = 0;

				while (!flagJogadores) {
					tabuleiro.mostrarTabuleiro();

					if (jogadaDaVez % 2 == 0) {
						jogadorNome = "Jogador1";
						tabuleiro.fazerJogada(jogadorNome);
						posicao = scan.nextInt();

						if (!tabuleiro.marcacaoIsVazia(posicao, "X")) {
							jogadaDaVez--;
						}

					} else {
						jogadorNome = "Jogador2";
						tabuleiro.fazerJogada(jogadorNome);
						posicao = scan.nextInt();
						if (!tabuleiro.marcacaoIsVazia(posicao, "O")) {
							jogadaDaVez--;
						}
					}

					if (tabuleiro.mostrarVencedor("X") || tabuleiro.mostrarVencedor("O")) {
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
				}

			} else {
				System.out.println("Good By.:)");
				sair = true;
			}
		}

	}

}
