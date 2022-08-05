package com.fernando.cursoOO.aula27;

public class JogoDaVelha {
	String[][] tabuleiro = new String[3][3];
	int seqTabuleiro = 1;

	void mostrarTabuleiro() {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				if (tabuleiro[i][j] == null) {
					tabuleiro[i][j] = Integer.toString(seqTabuleiro);
				}
				System.out.print("|" + tabuleiro[i][j] + "|");
				seqTabuleiro++;
			}
			System.out.println();
		}

		System.out.println();

	}

	void limparJogo() {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				tabuleiro[i][j] = null;
			}
		}
		seqTabuleiro = 1;
	}

	void marcarPosicao(int posicao, String marcacao) {
		switch (posicao) {
		case 1:
			tabuleiro[0][0] = marcacao;
			break;
		case 2:
			tabuleiro[0][1] = marcacao;
			break;
		case 3:
			tabuleiro[0][2] = marcacao;
			break;
		case 4:
			tabuleiro[1][0] = marcacao;
			break;
		case 5:
			tabuleiro[1][1] = marcacao;
			break;
		case 6:
			tabuleiro[1][2] = marcacao;
			break;
		case 7:
			tabuleiro[2][0] = marcacao;
			break;
		case 8:
			tabuleiro[2][1] = marcacao;
			break;
		case 9:
			tabuleiro[2][2] = marcacao;
			break;

		default:
			System.out.println("Marcação inválida");
			break;
		}
	}

	String marcacaoTabuleiro(int posicaoMarcada) {
		String posicao = "";
		switch (posicaoMarcada) {
		case 1:
			posicao = tabuleiro[0][0];
			break;
		case 2:
			posicao = tabuleiro[0][1];
			break;
		case 3:
			posicao = tabuleiro[0][2];
			break;
		case 4:
			posicao = tabuleiro[1][0];
			break;
		case 5:
			posicao = tabuleiro[1][1];
			break;
		case 6:
			posicao = tabuleiro[1][2];
			break;
		case 7:
			posicao = tabuleiro[2][0];
			break;
		case 8:
			posicao = tabuleiro[2][1];
			break;
		case 9:
			posicao = tabuleiro[2][2];
			break;
		}
		return posicao;
	}

	boolean lancarVencedor(String marcacao) {
		boolean campeao = false;
		if ((marcacaoTabuleiro(1) == marcacao) && (marcacaoTabuleiro(2) == marcacao)
				&& (marcacaoTabuleiro(3) == marcacao)) {
			campeao = true;
		}
		if ((marcacaoTabuleiro(4) == marcacao) && (marcacaoTabuleiro(5) == marcacao)
				&& (marcacaoTabuleiro(6) == marcacao)) {
			campeao = true;
		}
		if ((marcacaoTabuleiro(7) == marcacao) && (marcacaoTabuleiro(8) == marcacao)
				&& (marcacaoTabuleiro(9) == marcacao)) {
			campeao = true;
		}
		if ((marcacaoTabuleiro(1) == marcacao) && (marcacaoTabuleiro(5) == marcacao)
				&& (marcacaoTabuleiro(9) == marcacao)) {
			campeao = true;
		}
		if ((marcacaoTabuleiro(3) == marcacao) && (marcacaoTabuleiro(5) == marcacao)
				&& (marcacaoTabuleiro(7) == marcacao)) {
			campeao = true;
		}
		if ((marcacaoTabuleiro(1) == marcacao) && (marcacaoTabuleiro(4) == marcacao)
				&& (marcacaoTabuleiro(7) == marcacao)) {
			campeao = true;
		}
		if ((marcacaoTabuleiro(2) == marcacao) && (marcacaoTabuleiro(5) == marcacao)
				&& (marcacaoTabuleiro(8) == marcacao)) {
			campeao = true;
		}
		if ((marcacaoTabuleiro(3) == marcacao) && (marcacaoTabuleiro(6) == marcacao)
				&& (marcacaoTabuleiro(9) == marcacao)) {
			campeao = true;
		}
		return campeao;
	}

	boolean validarMarcacaoTabuleiro(int posicao, String marcacao) {
		if ((marcacaoTabuleiro(posicao) != "O") && (marcacaoTabuleiro(posicao) != "X")) {
			marcarPosicao(posicao, marcacao);
			return true;
		} else {
			System.out.println("Posição já encontra-se marcada.");
			return false;

		}
	}
	
	void selecionarJogada(String jogadorNome) {
		System.out.println(jogadorNome + " faça sua jogada.");
	}

}
