package com.fernando.cursoOO.aula27;

public class JogoDaVelha {
	String[][] tabuleiro = new String[3][3];
	
	
	void mostrarTabuleiro() {
		for(int i = 0; i < tabuleiro.length; i++) {
			for(int j = 0; j < tabuleiro[i].length; j++) {
				System.out.print("|" + tabuleiro[i][j] + "|");
			}
			System.out.println();
		}
		System.out.println();
		
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

		default:System.out.println("Marcação inválida");			
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
	
	
	
	boolean lancarVencedor() {
		boolean campeao = false;
		if((marcacaoTabuleiro(1) == "O") && (marcacaoTabuleiro(2) == "O") && (marcacaoTabuleiro(3) == "O")) {
			campeao = true;
		}
		if((marcacaoTabuleiro(4) == "O") && (marcacaoTabuleiro(5) == "O") && (marcacaoTabuleiro(6) == "O")) {
			campeao = true;
		}
		if((marcacaoTabuleiro(7) == "O") && (marcacaoTabuleiro(8) == "O") && (marcacaoTabuleiro(9) == "O")) {
			campeao = true;
		}
		if((marcacaoTabuleiro(1) == "O") && (marcacaoTabuleiro(5) == "O") && (marcacaoTabuleiro(9) == "O")) {
			campeao = true;
		}
		if((marcacaoTabuleiro(3) == "O") && (marcacaoTabuleiro(5) == "O") && (marcacaoTabuleiro(7) == "O")) {
			campeao = true;
		}
		if((marcacaoTabuleiro(1) == "O") && (marcacaoTabuleiro(4) == "O") && (marcacaoTabuleiro(7) == "O")) {
			campeao = true;
		}
		if((marcacaoTabuleiro(2) == "O") && (marcacaoTabuleiro(5) == "O") && (marcacaoTabuleiro(8) == "O")) {
			campeao = true;
		}
		if((marcacaoTabuleiro(3) == "O") && (marcacaoTabuleiro(6) == "O") && (marcacaoTabuleiro(9) == "O")) {
			campeao = true;
		}
		if((marcacaoTabuleiro(1) == "X") && (marcacaoTabuleiro(2) == "X") && (marcacaoTabuleiro(3) == "X")) {
			campeao = true;
		}
		if((marcacaoTabuleiro(4) == "X") && (marcacaoTabuleiro(5) == "X") && (marcacaoTabuleiro(6) == "X")) {
			campeao = true;
		}
		if((marcacaoTabuleiro(7) == "X") && (marcacaoTabuleiro(8) == "X") && (marcacaoTabuleiro(9) == "X")) {
			campeao = true;
		}
		if((marcacaoTabuleiro(1) == "X") && (marcacaoTabuleiro(5) == "X") && (marcacaoTabuleiro(9) == "X")) {
			campeao = true;
		}
		if((marcacaoTabuleiro(3) == "X") && (marcacaoTabuleiro(5) == "X") && (marcacaoTabuleiro(7) == "X")) {
			campeao = true;
		}
		if((marcacaoTabuleiro(1) == "X") && (marcacaoTabuleiro(4) == "X") && (marcacaoTabuleiro(7) == "X")) {
			campeao = true;
		}
		if((marcacaoTabuleiro(2) == "X") && (marcacaoTabuleiro(5) == "X") && (marcacaoTabuleiro(8) == "X")) {
			campeao = true;
		}
		if((marcacaoTabuleiro(3) == "X") && (marcacaoTabuleiro(6) == "X") && (marcacaoTabuleiro(9) == "X")) {
			campeao = true;
		}
		return campeao;
	}
	
	 boolean validarMarcacaoTabuleiro( int posicao, String marcacao) {
		if (marcacaoTabuleiro(posicao) == null) {
			marcarPosicao(posicao, marcacao);
			return true;
		} else {
			System.out.println("Posição já encontra-se marcada.");
			return false;
		}
	}
	
}
