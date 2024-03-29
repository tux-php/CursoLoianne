package com.fernando.cursoOO.exercicio28_33.ContaCorrente;

public class ContaCorrente {
	private int numero;
	private double saldo;
	private boolean especial;
	private double limite;
	private boolean usoChequeEspecial;
	private String tpConta;
	private int contContaEspecial = 0;

	public ContaCorrente(int numero, double saldo, double limite, int contContaEspecial) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.contContaEspecial = contContaEspecial;
	}

	public ContaCorrente() {
	};

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public boolean isUsoChequeEspecial() {
		return usoChequeEspecial;
	}

	public void setUsoChequeEspecial(boolean usoChequeEspecial) {
		this.usoChequeEspecial = usoChequeEspecial;
	}

	public String getTpConta() {
		return tpConta;
	}

	public void setTpConta(String tpConta) {
		this.tpConta = tpConta;
	}

	public int getContContaEspecial() {
		return contContaEspecial;
	}

	public void setContContaEspecial(int contContaEspecial) {
		this.contContaEspecial = contContaEspecial;
	}

	public boolean sacarSaldo(double valor) {
		boolean isTemSaldo = (this.getSaldo() >= valor) && (valor > 0);
		if (isTemSaldo) {
			this.saldo -= valor;
		}
		return isTemSaldo;
	}

	public boolean sacarChequeEspecial(double valor) {
		boolean isTemLimite = this.getSaldo() == 0 && valor <= limite;
		if (isTemLimite) {
			limite -= valor;
		}
		return isTemLimite;
	}

	public double depositarSaldo(double valor) {
		if (valor > 0) {
			saldo += valor;
		}
		return getSaldo();
	}

	public double depositarLimite(double valor) {
		if (valor > 0) {
			limite += valor;
		}
		return getLimite();
	}

	public double depositarEmSaldoELimite(double valor, double valorLimiteInicial) {
		double limiteFaltante = valorLimiteInicial - getLimite();
		double valorDeposito = valor - limiteFaltante;
		depositarLimite(valorDeposito < 0 ? valor : limiteFaltante);
		valor -= limiteFaltante;
		if (valor >= 0) {
			depositarSaldo(valor);
		}
		return valor;
	}

	public void descontarSaldoOuLimite(double valor) {
		double descontoLimite = valor - getSaldo();
		double descontoSaldo = valor - descontoLimite;
		sacarSaldo(descontoSaldo);
		sacarChequeEspecial(descontoLimite);
	}

	public double consultarSaldoLimite() {
		return pegarTotal();
	}

	public double pegarTotal() {
		return getSaldo() + getLimite();
	}

	public boolean usarChequeEspecial(boolean validarChequeEspecial) {
		setUsoChequeEspecial(validarChequeEspecial);
		return usoChequeEspecial;
	}

	public String consultarChequeEspecial() {
		String msg = usoChequeEspecial ? " utilizado" : " não utilizado";
		return "Cheque Especial" + msg;

	}

	public boolean Especial(double valor, int contDeposito) {
		boolean validarContagemContaEspecial = (valor > 0) && (contDeposito >= 2);
		setEspecial(validarContagemContaEspecial ? true : false);
		return isEspecial();

	}

	public String verficarStatusConta() {
		setTpConta(isEspecial() ? "Conta Especial" : "Conta Simples");
		return getTpConta();
	}

	public boolean utilizarLimite(double valor, String resp) {
		//Return True(default) para flagLimite.
		if (resp.equalsIgnoreCase("S") && !resp.isBlank()) {
			usarChequeEspecial(true);
			if (getSaldo() != 0) {
				descontarSaldoOuLimite(valor);
			} else {
				sacarChequeEspecial(valor);
				System.out.println("Saque R$" + valor + ". Limite R$" + getLimite());
			}
		}

		return true;
	}

	public void mostrarExtrato() {
		System.out.println("Conta: " + getNumero());
		System.out.println("Tipo de Conta: " + verficarStatusConta());
		System.out.println("Saldo: " + getSaldo());
		System.out.println("Cheque Especial: " + getLimite());
		System.out.println("Saldo + Limite: " + consultarSaldoLimite());
		System.out.println(consultarChequeEspecial());
	}
}
