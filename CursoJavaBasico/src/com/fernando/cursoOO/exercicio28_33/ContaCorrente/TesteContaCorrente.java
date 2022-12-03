package com.fernando.cursoOO.exercicio28_33.ContaCorrente;
import java.util.Scanner;

public class TesteContaCorrente {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			ContaCorrente contaF = new ContaCorrente(45856, 100.00, 1000.00,  0);
			contaF.setNumero(22225555);
			contaF.setSaldo(600);
			contaF.setLimite(2000.00);
						
			boolean sair = false;
			int opcoes;
			double valor;
			int contDeposito = 0;
			double valorLimiteInicial = contaF.getLimite();

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
					boolean sacarValorSaldo;

					while (!flagLimite) {
						if (valor > 0) {
							sacarValorSaldo = contaF.sacarSaldo(valor);
							if (!sacarValorSaldo) {
								System.out.println("Saldo Insuficiente. Gostaria de sacar do seu limite de R$"
										+ contaF.getLimite() + " ? S/N");
								resp = scan.next();
								flagLimite = contaF.utilizarLimite(valor, resp);
							} else {
								contaF.usarChequeEspecial(false);
								System.out.println("Operação realizada com sucesso. Retire seu dinheiro.");
								flagLimite = true;
							}

						} else {
							System.out.println("Valor de saque inválido! Tente novamente.");
							flagLimite = true;
						}

					}
					flagLimite = true;

				} else if (opcoes == 2) {
					System.out.println("Informe o valor do depósito.");
					valor = scan.nextDouble();

					contaF.depositarEmSaldoELimite(valor, valorLimiteInicial);
					contaF.Especial(valor, contDeposito);
					contDeposito++;
					
				} else if (opcoes == 3) {
					boolean validarLimite = contaF.getLimite() != valorLimiteInicial;
					contaF.usarChequeEspecial(validarLimite ? true : false);
					contaF.mostrarExtrato();
					
				} else if (opcoes == 4) {
					sair = true;
				} else {
					System.out.println("Opção inexistente.");
				}

			}

		}

	}

