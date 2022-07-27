package com.fernando.cursoOO.aula27;

public class ContaCorrente {
	int numero;
	double saldo;
	boolean especial;
	double limite;
	boolean usoChequeEspecial;
	String tpConta;
	String msg;
	String chequeEspecial = "Cheque Especial";
	int contContaEspecial = 0;

	boolean sacar(double valor) {
		boolean validarSaque = (saldo >= valor) && (valor > 0);
		if (validarSaque) {
			saldo -= valor;
			return true;
		} else {
			return false;
		}

	}

	boolean sacarChequeEspecial(double valor) {
		if (saldo == 0 && valor <= limite) {
			limite -= valor;
			return true;
		} else {
			return false;
		}

	}

	double depositarSaldo(double valor) {
		if (valor > 0) {
			return saldo += valor;
		}
		return saldo;
	}

	void depositarLimite(double valor) {
		if (valor > 0) {
			limite += valor;
		}
	}

	double depositarEmSaldoELimite(double valor, double valorLimiteInicial) {
		double limiteFaltante = valorLimiteInicial - consultarLimite();
		double valorDeposito = valor - limiteFaltante;
		depositarLimite(valorDeposito < 0 ? valor : limiteFaltante);
		valor -= limiteFaltante;
		if (valor >= 0) {
			depositarSaldo(valor);
		}
		return valor;
	}

	void calcularDesconto(double valor) {
		double descontoLimite = valor - consultarSaldo();
		double descontoSaldo = valor - descontoLimite;
		sacar(descontoSaldo);
		sacarChequeEspecial(descontoLimite);
	}

	double consultarSaldo() {
		return saldo;
	}

	double consultarLimite() {
		return limite;
	}

	double consultarSaldoLimite() {
		return pegarTotal();
	}

	double pegarTotal() {
		return saldo + limite;
	}

	boolean usarChequeEspecial(boolean validarChequeEspecial) {
		return usoChequeEspecial = validarChequeEspecial;
	}

	String consultarChequeEspecial() {
		msg = usoChequeEspecial ? " utilizado" : " não utilizado";
		return chequeEspecial + msg;

	}

	boolean Especial(double valor, int contDeposito) {
		boolean validarContagemContaEspecial = (valor > 0) && (contDeposito >= 2);
		return especial = validarContagemContaEspecial ? true : false;

	}

	String verficarStatusConta() {

		return tpConta = especial ? "Conta Especial" : "Conta Simples";
	}

	boolean verificarUtilizacaoLimite(double valor, String resp) {
		boolean flagLimite = true;
		if (resp.equalsIgnoreCase("S") && !resp.isBlank()) {
			if (consultarSaldo() != 0) {
				usarChequeEspecial(true);
				calcularDesconto(valor);
			} else {
				sacarChequeEspecial(valor);
				System.out.println("Saque R$" + valor + ". Limite R$" + consultarLimite());
			}
		}
		return flagLimite;
	}

	void mostrarExtrato() {
		System.out.println("Conta: " + numero + "fernando");
		System.out.println("Tipo de Conta: " + verficarStatusConta());
		System.out.println("Saldo: " + consultarSaldo());
		System.out.println("Cheque Especial: " + consultarLimite());
		System.out.println("Saldo + Limite: " + consultarSaldoLimite());
		System.out.println(consultarChequeEspecial());
	}

}
