package com.fernando.cursoOO.aula27;

import java.util.Scanner;

public class TesteContaCorrente {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ContaCorrente contaF = new ContaCorrente();
		contaF.numero = 45856;
		contaF.limite = 1000;
		contaF.saldo = 100;
		boolean sair = false;
		int opcoes;
		double valor;
		int contDeposito = 0;
		double valorLimiteInicial = contaF.limite;

		while (!sair) {
			System.out.println("" + "  ___   _ __    ___  _ __   __ _   ___  ___\n"
					+ " / _ \\ | '_ \\  / _ \\| '__| / _` | / _ \\/ __|\n"
					+ "| (_) || |_) ||  __/| |   | (_| ||  __/\\__ \\\n"
					+ " \\___/ | .__/  \\___||_|    \\__,_| \\___||___/\n" + "       | |\n" + "       |_|");
			System.out.println("Escolha dentre as opções abaixo:");
			System.out.println("1.Saque");
			System.out.println("2.Deposito");
			System.out.println("3.Extrato");
			System.out.println("4.Sair");
			opcoes = scan.nextInt();

			if (opcoes == 1) {
				String resp;
				System.out.println("Informe o valor do saque.");
				valor = scan.nextDouble();
				boolean flagLimite = false;
				boolean sacandoValor;

				while (!flagLimite) {
					sacandoValor = contaF.sacar(valor);
					if (!sacandoValor) {
						System.out.println("Saldo Insuficiente. Gostaria de sacar do seu limite de R$"
								+ contaF.consultarLimite() + " ? S/N");
						resp = scan.next();
						flagLimite = verificarUtilizacaoLimite(contaF, valor, resp);
					} else {
						contaF.usarChequeEspecial(false);
						System.out.println("Operação realizada com sucesso. Retire seu dinheiro.");
						flagLimite = true;
					}

				}
				flagLimite = true;

			} else if (opcoes == 2) {
				System.out.println("Informe o valor do depósito.");
				valor = scan.nextDouble();

				depositarValor(contaF, valor, valorLimiteInicial);
				boolean validarContagemContaEspecial = (valor > 0) && (contDeposito >= 2);
				contaF.Especial(validarContagemContaEspecial ? true : false);
				contDeposito++;

			} else if (opcoes == 3) {
				boolean validarLimite = contaF.consultarLimite() != valorLimiteInicial;
				contaF.usarChequeEspecial(validarLimite ? true : false);
				contaF.mostrarExtrato();
			} else if (opcoes == 4) {
				sair = true;
			} else {
				System.out.println("Opção inexistente.");
			}

		}

	}

	private static double depositarValor(ContaCorrente contaF, double valor, double valorLimiteInicial) {
		return contaF.depositarEmSaldoELimite(valor, valorLimiteInicial);
	}

	private static boolean verificarUtilizacaoLimite(ContaCorrente contaF, double valor, String resp) {
		boolean flagLimite = true;
		if (resp.equalsIgnoreCase("S") && !resp.isBlank()) {
			if (contaF.consultarSaldo() != 0) {
				contaF.usarChequeEspecial(true);
				contaF.calcularDesconto(valor);
			} else {
				contaF.sacarChequeEspecial(valor);
				System.out.println("Saque R$" + valor + ". Limite R$" + contaF.consultarLimite());
			}
		}
		return flagLimite;
	}

}
