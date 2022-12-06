package com.fernando.cursoOO.aula28_33.jogoDaVelha;

public class JogoDaVelha {
	private String[][] tabuleiro;
	private int seqTabuleiro;
	
	public JogoDaVelha() {
		tabuleiro = new String[3][3];
		seqTabuleiro = 1;
	}
	
	

	public String[][] getTabuleiro() {
		return tabuleiro;
	}



	public void setTabuleiro(String[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}



	public int getSeqTabuleiro() {
		return seqTabuleiro;
	}



	public void setSeqTabuleiro(int seqTabuleiro) {
		this.seqTabuleiro = seqTabuleiro;
	}



	public void mostrarTabuleiro() {
		for (int i = 0; i < getTabuleiro().length; i++) {
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

	public void limparJogo() {
		for (int i = 0; i < getTabuleiro().length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				tabuleiro[i][j] = null;
			}
		}
		seqTabuleiro = 1;
	}

	private boolean marcarPosicao(int posicao, String marcacao) {
		switch (posicao) {
		case 1:
			tabuleiro[0][0] = marcacao;
			return true;
		case 2:
			tabuleiro[0][1] = marcacao;
			return true;
		case 3:
			tabuleiro[0][2] = marcacao;
			return true;
		case 4:
			tabuleiro[1][0] = marcacao;
			return true;
		case 5:
			tabuleiro[1][1] = marcacao;
			return true;
		case 6:
			tabuleiro[1][2] = marcacao;
			return true;
		case 7:
			tabuleiro[2][0] = marcacao;
			return true;
		case 8:
			tabuleiro[2][1] = marcacao;
			return true;
		case 9:
			tabuleiro[2][2] = marcacao;
			return true;

		default:
			System.out.println("Marcação inválida");
			return false;
		}
	}

	private String marcacaoTabuleiro(int posicaoMarcada) {
		String posicao = "";
		switch (posicaoMarcada) {
		case 1:
			return posicao = tabuleiro[0][0];
		case 2:
			return posicao = tabuleiro[0][1];
		case 3:
			return posicao = tabuleiro[0][2];
		case 4:
			return posicao = tabuleiro[1][0];
		case 5:
			return posicao = tabuleiro[1][1];
		case 6:
			return posicao = tabuleiro[1][2];
		case 7:
			return posicao = tabuleiro[2][0];
		case 8:
			return posicao = tabuleiro[2][1];
		case 9:
			return posicao = tabuleiro[2][2];
		}
		return posicao;
	}

	public boolean mostrarVencedor(String marcacao) {
		if ((marcacaoTabuleiro(1) == marcacao) && (marcacaoTabuleiro(2) == marcacao)
				&& (marcacaoTabuleiro(3) == marcacao)) {
			return true;
		}
		if ((marcacaoTabuleiro(4) == marcacao) && (marcacaoTabuleiro(5) == marcacao)
				&& (marcacaoTabuleiro(6) == marcacao)) {
			return true;
		}
		if ((marcacaoTabuleiro(7) == marcacao) && (marcacaoTabuleiro(8) == marcacao)
				&& (marcacaoTabuleiro(9) == marcacao)) {
			return true;
		}
		if ((marcacaoTabuleiro(1) == marcacao) && (marcacaoTabuleiro(5) == marcacao)
				&& (marcacaoTabuleiro(9) == marcacao)) {
			return true;
		}
		if ((marcacaoTabuleiro(3) == marcacao) && (marcacaoTabuleiro(5) == marcacao)
				&& (marcacaoTabuleiro(7) == marcacao)) {
			return true;
		}
		if ((marcacaoTabuleiro(1) == marcacao) && (marcacaoTabuleiro(4) == marcacao)
				&& (marcacaoTabuleiro(7) == marcacao)) {
			return true;
		}
		if ((marcacaoTabuleiro(2) == marcacao) && (marcacaoTabuleiro(5) == marcacao)
				&& (marcacaoTabuleiro(8) == marcacao)) {
			return true;
		}
		if ((marcacaoTabuleiro(3) == marcacao) && (marcacaoTabuleiro(6) == marcacao)
				&& (marcacaoTabuleiro(9) == marcacao)) {
			return true;
		}
		return false;
	}

	public boolean marcacaoIsVazia(int posicao, String marcacao) {
		if ((marcacaoTabuleiro(posicao) != "O") && (marcacaoTabuleiro(posicao) != "X")) {
			return marcarPosicao(posicao, marcacao) ? true : false;
		} else {
			System.out.println("Posição já encontra-se marcada.");
			return false;

		}
	}

	public void fazerJogada(String jogadorNome) {
		System.out.println(jogadorNome + " faça sua jogada.");
	}

}
